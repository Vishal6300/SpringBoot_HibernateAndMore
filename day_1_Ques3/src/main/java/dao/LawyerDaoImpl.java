package dao;

import javax.persistence.EntityManager;

import model.Lawyer;
import util.EmUtil;
import exception.LawyerException;
public class LawyerDaoImpl implements Interface{

	@Override
	public Lawyer findLawyerById(int id) {
		EntityManager em= EmUtil.getConnection();
		Lawyer lawyer= em.find(Lawyer.class,id);
		if(lawyer ==null) throw new LawyerException("no lawyer present");
		em.close();
		return lawyer;
	}

	private Exception LawyerException(String string) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String saveLawyer(Lawyer lawyer) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteLawyerById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String updateLawyerExperience(int id, int experience) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
