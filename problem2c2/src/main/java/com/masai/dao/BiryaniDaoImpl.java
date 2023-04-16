package com.masai.dao;

import com.masai.exception.BiryaniException;
import com.masai.model.ChickenBiryani;
import com.masai.model.VegBiryani;
import com.masai.util.DBUtil;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;

import java.util.List;

public class BiryaniDaoImpl implements BiryaniDao{
    @Override
    public VegBiryani insertVegBiryani(VegBiryani vegBiryani) throws BiryaniException {
        EntityManager entityManager = DBUtil.getConnection();
        VegBiryani vegBiryani1 = entityManager.find(VegBiryani.class,vegBiryani.getBiryaniId());
        if(vegBiryani1 != null) throw  new BiryaniException("Veg Biryani with this ID already exist") ;
        entityManager.getTransaction().begin();
        entityManager.persist(vegBiryani);
        entityManager.getTransaction().commit();
        entityManager.close();
        return vegBiryani ;
    }

    @Override
    public ChickenBiryani insertChickenBiryani(ChickenBiryani chickenBiryani) throws BiryaniException {
        EntityManager entityManager = DBUtil.getConnection();
        ChickenBiryani chickenBiryani1 = entityManager.find(ChickenBiryani.class,chickenBiryani.getBiryaniId());
        if(chickenBiryani1 != null) throw  new BiryaniException("Veg Biryani with this ID already exist") ;
        entityManager.getTransaction().begin();
        entityManager.persist(chickenBiryani);
        entityManager.getTransaction().commit();
        entityManager.close();
        return chickenBiryani ;
    }

    @Override
    public VegBiryani getVegBiryani(int id) throws BiryaniException {
        EntityManager entityManager = DBUtil.getConnection();
        TypedQuery<VegBiryani> query = entityManager.createNamedQuery("getById" , VegBiryani.class) ;
        query.setParameter("id" , id) ;
        try {
            return query.getSingleResult() ;

        }
        catch (Exception e){
            throw  new BiryaniException(e.getMessage()) ;
        }
    }

    @Override
    public List<VegBiryani> getAllVegBiryani() throws BiryaniException {
        EntityManager entityManager = DBUtil.getConnection();
        String string = "from VegBiryani v " ;
        Query query = entityManager.createQuery(string);
        List<VegBiryani> biryanis = query.getResultList();
        if(biryanis.isEmpty()) throw new BiryaniException("No Biryani Found")  ;
        return biryanis ;
    }
}
