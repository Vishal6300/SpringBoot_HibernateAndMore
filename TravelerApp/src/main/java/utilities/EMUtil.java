package utilities;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class EMUtil {
    private static EntityManagerFactory emf;
    private static final String PERSISTENCE_UNIT_NAME = "TravelerApp";

    static {
    	emf=Persistence.createEntityManagerFactory(null);
    }
    
    public static EntityManager provideEntityManager() {
    	if(emf==null) {
    		emf= Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
    	}
    	return emf.createEntityManager();
    }
}
