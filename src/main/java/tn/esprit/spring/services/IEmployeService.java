package tn.esprit.spring.services;

import java.util.Date;
import java.util.List;

import tn.esprit.spring.entities.Contrat;
import tn.esprit.spring.entities.Employe;
import tn.esprit.spring.entities.Entreprise;
import tn.esprit.spring.entities.Mission;
import tn.esprit.spring.entities.Timesheet;


public interface IEmployeService {
	
	public Employe authenticate(String login, String password) ;
	 
	
	public void mettreAjourEmailByEmployeId( String email,int employeId);//done
	public void affecterEmployeADepartement(int employeId, int depId);//done
	public void desaffecterEmployeDuDepartement(int employeId, int depId);//done
	public int ajouterContrat(Contrat contrat);//done
	public void affecterContratAEmploye(int contratId, int employeId);//done
	public String getEmployePrenomById(int employeId);//done
	public void deleteEmployeById(int employeId);//no
	public void deleteContratById(int contratId);//no
	public int getNombreEmployeJPQL();//done
	public List<String> getAllEmployeNamesJPQL();//done
	public List<Employe> getAllEmployeByEntreprise(Entreprise entreprise);//no
	public void mettreAjourEmailByEmployeIdJPQL(String email, int employeId);//done
	public void deleteAllContratJPQL();//done
	public float getSalaireByEmployeIdJPQL(int employeId);//done
	public Double getSalaireMoyenByDepartementId(int departementId);//i dont know
	public List<Employe> getAllEmployes();//done
	public List<Timesheet> getTimesheetsByMissionAndDate(Employe employe, Mission mission, 
	Date dateDebut, Date dateFin);//no

	int addOrUpdateEmploye(Employe employe);
	
	
	

	
}
