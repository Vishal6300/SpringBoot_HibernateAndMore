package com.masai.dao;

import com.masai.exception.BiryaniException;
import com.masai.model.ChickenBiryani;
import com.masai.model.VegBiryani;

import java.util.List;

public interface BiryaniDao {

    public VegBiryani insertVegBiryani(VegBiryani vegBiryani) throws BiryaniException ;
    public ChickenBiryani insertChickenBiryani(ChickenBiryani chickenBiryani) throws BiryaniException ;
    public VegBiryani getVegBiryani(int id) throws BiryaniException ;
    public List<VegBiryani> getAllVegBiryani() throws BiryaniException ;
}
