package com.masai.usecases;

import com.masai.dao.BiryaniDao;
import com.masai.dao.BiryaniDaoImpl;
import com.masai.model.ChickenBiryani;

public class GetChickenBiryaniById {
    public static void main(String[] args) {
        BiryaniDao biryaniDao = new BiryaniDaoImpl();
        ChickenBiryani chickenBiryani = biryaniDao.getChickenBiryani(1) ;
        System.out.println(chickenBiryani);
    }
}
