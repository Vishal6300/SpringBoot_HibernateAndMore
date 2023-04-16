package com.masai.usecases;

import com.masai.dao.BiryaniDao;
import com.masai.dao.BiryaniDaoImpl;
import com.masai.model.VegBiryani;

public class GetVegBiryaniById {
    public static void main(String[] args) {
        BiryaniDao biryaniDao = new BiryaniDaoImpl();
        VegBiryani vegBiryani = biryaniDao.getVegBiryani(2) ;
        System.out.println(vegBiryani);
    }
}
