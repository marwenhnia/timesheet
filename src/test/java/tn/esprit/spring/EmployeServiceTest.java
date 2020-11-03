package tn.esprit.spring;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;



import tn.esprit.spring.entities.Contrat;
import tn.esprit.spring.entities.Departement;
import tn.esprit.spring.entities.Employe;


import tn.esprit.spring.entities.MissionExterne;
import tn.esprit.spring.entities.Role;
import tn.esprit.spring.entities.Timesheet;

import tn.esprit.spring.services.IContratService;
import tn.esprit.spring.services.IDepartementService;
import tn.esprit.spring.services.IEmployeService;

@SpringBootTest

public class EmployeServiceTest {
	
	@Autowired
	IEmployeService es;
	@Autowired
	IDepartementService ds;
	@Autowired
	IContratService cs;
	
	@Test
	public void testmettreAjourEmailByEmployeId() { 
		String mail="marwen.hnia12@gmail.com";
		int id=1;
		
		 es.mettreAjourEmailByEmployeId(mail,id);
		 assertEquals("marwen.hnia12@gmail.com",mail );		
	}
	
	
	@Test
	public void testaffecterEmployeADepartement() {
		List<Employe>le= es.getAllEmployes();
		int e=le.get(0).getId();
         List<Departement> l =ds.getAllDepartements();
		int l1= l.get(0).getId();
		 es.affecterEmployeADepartement(e, l1);
		 	assertEquals(l1, 2);
		
	}
	
	@Test
	public void testdesaffecterEmployeDuDepartement() {
		List<Employe>le= es.getAllEmployes();
		int e=le.get(0).getId();
		List<Departement> l =ds.getAllDepartements();
		int l1= l.get(0).getId();
		 es.desaffecterEmployeDuDepartement(e, l1);
		 	assertEquals(1, e);
	}
	
	
	
	@Test
	public void testAjouteContrat() throws ParseException {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		Date d = dateFormat.parse("2015-03-23");
		Contrat c=new Contrat(d,"CDI",800.0f);
		 es.ajouterContrat(c);
		assertEquals(c.getTypeContrat(), "CDI");
			
	}
	
	
	@Test
	public void testAffecteContratAEmploye() throws ParseException {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		Date d = dateFormat.parse("2015-03-23");
		Contrat c=new Contrat(d,"CDI",900.0f);
		int idC= es.ajouterContrat(c);
		 Employe e=new Employe( "khalil", "sfar", "khalil.sfar@esprit.tn", "123",  true, Role.ADMINISTRATEUR);
		 es.addOrUpdateEmploye(e);
		 es.affecterContratAEmploye(c.getReference(),e.getId());
		
		 assertEquals(idC,c.getReference());
	}
	
	
	
	@Test
	public void testdesAffecteContratAEmploye() throws ParseException {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		Date d = dateFormat.parse("2015-03-23");
		Contrat c=new Contrat(d,"CDI",900.0f);
		int idC= es.ajouterContrat(c);
		 Employe e=new Employe( "khalil", "sfar", "khalil.sfar@esprit.tn", "123",  true, Role.ADMINISTRATEUR);
		 es.addOrUpdateEmploye(e);
		 System.out.println("l id est "+e.getId());
		 es.affecterContratAEmploye(c.getReference(),e.getId());
		 assertEquals(c.getReference(),idC);
	}
	
	
	@Test
	public void testgetEmployePrenomById() {
		
	String s=	es.getEmployePrenomById(1);
		assertEquals("marwen", s);
	}
	/*
	@Test 
	public void testdeleteEmployeById() {
		List<Employe>le= es.getAllEmployes();
		int e=le.get(0).getId();
	     es.deleteEmployeById(e);
	     le= es.getAllEmployes();
		int e2=le.get(0).getId();

		assertNotEquals(e2,e);
	}
	*/
	@Test()
	public void testdeleteContratById() {
		List<Contrat>lc= cs.getAllContrats();
		int c=lc.get(0).getReference();
	     es.deleteContratById(c);
	     lc= cs.getAllContrats();
	     int c2=lc.get(0).getReference();
		assertNotEquals(c2,c);
	}
	
	@Test
	public void testgetNombreEmployeJPQL() {
		int nb=es.getNombreEmployeJPQL();
		List<Employe> listemp=es.getAllEmployes();

		assertEquals(listemp.size(), nb);
	}
	
	@Test
	public void testgetAllEmployeNamesJPQL() {
		List<String> listempname = es.getAllEmployeNamesJPQL();
		Employe e=new Employe( "khalil1", "sfar1", "khalil.sfar@esprit.tn", "1234",  true, Role.CHEF_DEPARTEMENT);
			es.addOrUpdateEmploye(e);
		List<Employe>listemp1=es.getAllEmployes();
		assertEquals(listemp1.size(), listempname.size()+1);
	}
	@Test
	public void testgetAllEmployeByEntreprise() {
		
	}
	
	
	@Test
	public void testmettreAjourEmailByEmployeIdJPQL() { 
		String mail="marwen.hnia11@gmail.com";
		int id=1;
		
		 es.mettreAjourEmailByEmployeId(mail,id);
		 assertEquals("marwen.hnia11@gmail.com",mail );		
	}

	@Test
	public void testdeleteAllContratJPQL() {
		
	    es.deleteAllContratJPQL();
		
	}
	
	@Test
	public void testgetSalaireByEmployeIdJPQL() throws ParseException {
		 
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		Date d = dateFormat.parse("2015-03-23");
		Contrat c=new Contrat(d,"CDI",900.0f);
		int idC= es.ajouterContrat(c);
		 Employe e=new Employe( "khalil", "sfar", "khalil.sfar@esprit.tn", "123",  true, Role.ADMINISTRATEUR);
		 int idE=es.addOrUpdateEmploye(e);
		 es.affecterContratAEmploye(c.getReference(),e.getId());		 
		double sal=es.getSalaireByEmployeIdJPQL(idE);
		assertEquals(c.getSalaire(), sal);
	}
	

	@Test 
	public void testgetAllEmployes() {
		List<Employe> listemp=es.getAllEmployes();
		System.err.println(listemp.size());
		Employe e=new Employe( "khalil1", "sfar1", "khalil.sfar@esprit.tn", "1234",  true, Role.CHEF_DEPARTEMENT);
	  	es.addOrUpdateEmploye(e);
	
	  	List<Employe> listemp1=es.getAllEmployes();
		System.err.println(listemp1.size());

		assertEquals(listemp1.size(), listemp.size()+1);
	}
	

	
	
	

}
