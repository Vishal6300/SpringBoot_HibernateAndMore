package com.masai.dao;

import com.masai.exception.BiryaniException;
import com.masai.model.ChickenBiryani;
import com.masai.model.VegBiryani;

import java.util.List;

public interface BiryaniDao {

    public VegBiryani insertVegBiryani(VegBiryani vegBiryani) throws BiryaniException ;
    public ChickenBiryani insertChickenBiryani(ChickenBiryani chickenBiryani) throws BiryaniException ;
    public ChickenBiryani getChickenBiryani(int id) throws BiryaniException ;
    public List<ChickenBiryani> getAllChickenBiryani() throws BiryaniException ;
    public List<ChickenBiryani> getChickenBiryaniByPrice(int price) throws  BiryaniException;
}
