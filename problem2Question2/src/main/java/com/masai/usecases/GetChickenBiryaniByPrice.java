package com.masai.usecases;

import com.masai.dao.BiryaniDao;
import com.masai.dao.BiryaniDaoImpl;
import com.masai.model.ChickenBiryani;

import java.util.List;

public class GetChickenBiryaniByPrice {

    public static void main(String[] args) {
        BiryaniDao biryaniDao = new BiryaniDaoImpl();
        int price = 500 ;
        List<ChickenBiryani> biryanis = biryaniDao.getChickenBiryaniByPrice(price) ;
        biryanis.forEach(System.out::println);
    }
}
