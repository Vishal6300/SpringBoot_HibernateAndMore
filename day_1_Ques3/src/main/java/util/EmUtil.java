package util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EmUtil {
	private static final EntityManagerFactory emf;
	
	static {
		emf= Persistence.createEntityManagerFactory(null);
	}

	public static EntityManager getConnection() {
		// TODO Auto-generated method stub
		return null;
	}
}
