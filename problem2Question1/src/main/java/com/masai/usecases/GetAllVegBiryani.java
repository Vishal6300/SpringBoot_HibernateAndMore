package com.masai.usecases;

import com.masai.dao.BiryaniDao;
import com.masai.dao.BiryaniDaoImpl;
import com.masai.model.VegBiryani;

import java.util.List;

public class GetAllVegBiryani {
    public static void main(String[] args) {
        BiryaniDao biryaniDao = new BiryaniDaoImpl();
        List<VegBiryani> vegBiryanis = biryaniDao.getAllVegBiryani();
        vegBiryanis.forEach(System.out::println);
    }
}
