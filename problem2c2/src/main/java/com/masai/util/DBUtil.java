package com.masai.util;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class DBUtil {

    private static final EntityManagerFactory emf ;
    static {
        emf = Persistence.createEntityManagerFactory("persistence-Unit") ;
    }
    public static EntityManager getConnection(){
        return emf.createEntityManager();
    }
}
