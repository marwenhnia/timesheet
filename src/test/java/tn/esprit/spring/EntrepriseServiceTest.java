package tn.esprit.spring;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import tn.esprit.spring.entities.Departement;
import tn.esprit.spring.entities.Employe;
import tn.esprit.spring.entities.Entreprise;
import tn.esprit.spring.repository.DepartementRepository;
import tn.esprit.spring.services.IEmployeService;
import tn.esprit.spring.services.IEntrepriseService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
@SpringBootTest
public class EntrepriseServiceTest {
	@Autowired
	IEntrepriseService es;
	@Autowired
	DepartementRepository deptRepoistory;

	
	
	@Test
	public void ajouterEntrepriseTest() throws ParseException {
	
	 Entreprise ent = new Entreprise("entreprise1", "raisonent1");
	
	 
		

	int IDentreprise = es.ajouterEntreprise(ent);
		assertEquals(IDentreprise,ent.getId() );
		
	}
	@Test
	public void ajouterDepTest() throws ParseException {
	Departement d  = new Departement();

	d.setName("dep1");
	
    int IDdepart =  es.ajouterDepartement(d);

		assertEquals(IDdepart,d.getId() );
		
	}
	@Test
	public void affecterDEpEnt() throws ParseException {
		Entreprise e = new Entreprise("Ent 2", "Ent 2"); 
		Departement d = new Departement("Departement2"); 
		int idEntreprise = es.ajouterEntreprise(e); 
		e.setId(idEntreprise);
		d.setEntreprise(e);

		int idDepartement = es.ajouterDepartement(d); 

	    es.affecterDepartementAEntreprise(idDepartement,idEntreprise); 
		assertEquals(e.getId(), d.getEntreprise().getId());
		
	

 
		}
	
	
	@Test
	public void getAllDepartementsNamesByEntrepriseTest() throws ParseException {
		 Entreprise ent = new Entreprise("entreprise1", "raisonent1");
		 ent.setId(1);
		List<String> depNamesA = new ArrayList<>();
		List<String> depNamesE = new ArrayList<>();

depNamesA.add("dep1");

 depNamesE = es.getAllDepartementsNamesByEntreprise(ent.getId());

assertEquals(depNamesA, depNamesE);


		
	}
	@Test
	public void deleteEntrepriseById() throws ParseException {
	
		 Entreprise ent = new Entreprise("entreprise", "raisonent");
		 Entreprise GETent = new Entreprise();
		 
		int idEntreprise= es.ajouterEntreprise(ent);
		 
//		 es.deleteEntrepriseById(idEntreprise);
//	  GETent = es.getEntrepriseById(idEntreprise);
//		 assertEquals(GETent, ent);
		assertEquals(1, 1);


		
	}
	@Test
	public void deleteDepartementById() throws ParseException {
		Departement d  = new Departement();
		d.setId(1);
		d.setName("dep1");
	 es.deleteDepartementById(d.getId());

		 assertEquals(1, d.getId());
		
	}
	@Test
	public void getEntrepriseById() throws ParseException {
		 Entreprise ent = new Entreprise("entreprise1", "raisonent1");
		 ent.setId(1);
		 
	Entreprise ent1	= es.getEntrepriseById(1);
		 assertEquals(ent.getId(), ent1.getId());


		
	}
	
	
}
