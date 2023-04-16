package com.masai.usecases;

import com.masai.dao.BiryaniDao;
import com.masai.dao.BiryaniDaoImpl;
import com.masai.model.ChickenBiryani;
import com.masai.model.VegBiryani;

import java.util.List;

public class InsertRecordOfChickenBiryani {
    public static void main(String[] args) {
        BiryaniDao biryaniDao = new BiryaniDaoImpl() ;
        ChickenBiryani chickenBiryani = new ChickenBiryani(4.5,1 ,200 ,"Chicken Biryani 1") ;
        ChickenBiryani chickenBiryani1 = new ChickenBiryani(4.0,2 ,300 ,"Chicken Biryani 2") ;
        ChickenBiryani chickenBiryani2 = new ChickenBiryani(5.0,3 ,150 ,"Chicken Biryani 3") ;
        ChickenBiryani chickenBiryani3 = new ChickenBiryani(3.5,4 ,500 ,"Chicken Biryani 4") ;


        ChickenBiryani chickenBiryani5 = biryaniDao.insertChickenBiryani(chickenBiryani);
        ChickenBiryani chickenBiryani6 = biryaniDao.insertChickenBiryani(chickenBiryani1);
        ChickenBiryani chickenBiryani7 = biryaniDao.insertChickenBiryani(chickenBiryani2);
        ChickenBiryani chickenBiryani8 = biryaniDao.insertChickenBiryani(chickenBiryani3);
        System.out.println(chickenBiryani5);
        System.out.println(chickenBiryani6);
        System.out.println(chickenBiryani7);
        System.out.println(chickenBiryani8);
    }
}
