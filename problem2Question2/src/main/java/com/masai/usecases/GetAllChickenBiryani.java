package com.masai.usecases;

import com.masai.dao.BiryaniDao;
import com.masai.dao.BiryaniDaoImpl;
import com.masai.model.ChickenBiryani;

import java.util.List;

public class GetAllChickenBiryani {
    public static void main(String[] args) {
        BiryaniDao biryaniDao = new BiryaniDaoImpl();
        List<ChickenBiryani> vegBiryanis = biryaniDao.getAllChickenBiryani();
        vegBiryanis.forEach(System.out::println);
    }

}
