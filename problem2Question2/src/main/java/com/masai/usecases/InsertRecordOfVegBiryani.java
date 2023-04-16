package com.masai.usecases;

import com.masai.dao.BiryaniDao;
import com.masai.dao.BiryaniDaoImpl;
import com.masai.model.ChickenBiryani;
import com.masai.model.VegBiryani;

public class InsertRecordOfVegBiryani {

    public static void main(String[] args) {
        BiryaniDao biryaniDao = new BiryaniDaoImpl() ;
        VegBiryani vegBiryani = new VegBiryani(4.5,1 ,80 ,"Veg Biryani 1") ;
        VegBiryani vegBiryani1 = new VegBiryani(4.0,2 ,100 ,"Veg Biryani 2") ;
        VegBiryani vegBiryani2 = new VegBiryani(5.0,3 ,150 ,"Veg Biryani 3") ;
        VegBiryani vegBiryani3 = new VegBiryani(3.5,4 ,300 ,"Veg Biryani 4") ;


        VegBiryani vegBiryani5 = biryaniDao.insertVegBiryani(vegBiryani);
        VegBiryani vegBiryani6 = biryaniDao.insertVegBiryani(vegBiryani1);
        VegBiryani vegBiryani7 = biryaniDao.insertVegBiryani(vegBiryani2);
        VegBiryani vegBiryani8 = biryaniDao.insertVegBiryani(vegBiryani3);
        System.out.println(vegBiryani5);
        System.out.println(vegBiryani6);
        System.out.println(vegBiryani7);
        System.out.println(vegBiryani8);
    }


}
