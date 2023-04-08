package dao;

import model.Lawyer;

public interface Interface {
	Lawyer findLawyerById(int id);
	String saveLawyer(Lawyer lawyer);
	String deleteLawyerById(int id);
	String updateLawyerExperience(int id, int experience);
}
