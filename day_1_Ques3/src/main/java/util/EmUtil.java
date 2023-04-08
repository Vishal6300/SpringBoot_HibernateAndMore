package util;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EmUtil {
	private static final EntityManagerFactory emf;
	
	static {
		emf= Persistence.createEntityManagerFactory(null);
	}
}
