package tn.esprit.spring;


import org.junit.runner.RunWith;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import org.springframework.test.context.junit4.SpringRunner;

import tn.esprit.spring.services.IContratService;
import tn.esprit.spring.services.IDepartementService;
import tn.esprit.spring.services.IEmployeService;

@SpringBootTest
@RunWith(SpringRunner.class)
public class EmployeServiceTest {
	
	@Autowired
	IEmployeService es;
	@Autowired
	IDepartementService ds;
	@Autowired
	IContratService cs;
	/*
	@Test
	public void testmettreAjourEmailByEmployeId() { 
		String mail="marwen.hnia12@gmail.com";
		int id=1;
		Employe e=new Employe();
		 es.mettreAjourEmailByEmployeId(mail,id);
		 assertEquals("marwen.hnia12@gmail.com",mail );		
	}*/
	
	/*
	@Test
	public void testaffecterEmployeADepartement() {
		List<Employe>le= es.getAllEmployes();
		int e=le.get(0).getId();
         List<Departement> l =ds.getAllDepartements();
		int l1= l.get(0).getId();
		 es.affecterEmployeADepartement(e, l1);
		 	assertEquals(l1, 2);
		
	}*/
	/*
	@Test
	public void testdesaffecterEmployeDuDepartement() {
		List<Employe>le= es.getAllEmployes();
		int e=le.get(0).getId();
		List<Departement> l =ds.getAllDepartements();
		int l1= l.get(0).getId();
		 es.desaffecterEmployeDuDepartement(e, l1);
		 	assertEquals(1, e);
	}*/
	
	
/*	
	@Test
	public void testAjouteContrat() throws ParseException {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		Date d = dateFormat.parse("2015-03-23");
		Contrat c=new Contrat(d,"CDI",800.0f);
		 es.ajouterContrat(c);
		assertEquals(c.getTypeContrat(), "CDI");
			
	}*/
	
	/*
	@Test
	public void testAffecteContratAEmploye() throws ParseException {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		Date d = dateFormat.parse("2015-03-23");
		Contrat c=new Contrat(d,"CDI",900.0f);
		 es.ajouterContrat(c);
		 Employe e=new Employe( "khalil", "sfar", "khalil.sfar@esprit.tn", "123",  true, Role.ADMINISTRATEUR);
		 es.addOrUpdateEmploye(e);
		 System.out.println("l id est "+e.getId());
		 es.affecterContratAEmploye(c.getReference(),e.getId());
		 assertEquals(c.getReference(),15);
	}*/
	
	
	/*
	@Test
	public void testdesAffecteContratAEmploye() throws ParseException {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		Date d = dateFormat.parse("2015-03-23");
		Contrat c=new Contrat(d,"CDI",900.0f);
		 es.ajouterContrat(c);
		 Employe e=new Employe( "khalil", "sfar", "khalil.sfar@esprit.tn", "123",  true, Role.ADMINISTRATEUR);
		 es.addOrUpdateEmploye(e);
		 System.out.println("l id est "+e.getId());
		 es.affecterContratAEmploye(c.getReference(),e.getId());
		 assertEquals(c.getReference(),15);
	}*/
	
	/*
	@Test
	public void testgetEmployePrenomById() {
		
	String s=	es.getEmployePrenomById(1);
		assertEquals("marwen", s);
	}*/
	/*
	@Test 
	public void testdeleteEmployeById() {
		List<Employe>le= es.getAllEmployes();
		int e=le.get(0).getId();
		System.out.println("l id "+e);
	     es.deleteEmployeById(e);
		assertEquals(1,e);
	}*/
	/*
	@Test()
	public void testdeleteContratById() {
		List<Contrat>lc= cs.getAllContrats();
		int c=lc.get(0).getReference();
	     es.deleteEmployeById(c);
		assertEquals(9,c);
	}*/
	/*
	@Test
	public void testgetNombreEmployeJPQL() {
		int nb=es.getNombreEmployeJPQL();
		assertEquals(1, nb);
	}*/
	/*
	@Test
	public void testgetAllEmployeNamesJPQL() {
		List<String> listempname = es.getAllEmployeNamesJPQL();
		assertEquals(1, listempname.size());
	}*/
	/*@Test
	public void testgetAllEmployeByEntreprise() {
		je ne sais comment faire avec junit relation entre 4 table
	}*/
	
	/*
	@Test
	public void testmettreAjourEmailByEmployeIdJPQL() { 
		String mail="marwen.hnia11@gmail.com";
		int id=1;
		Employe e=new Employe();
		 es.mettreAjourEmailByEmployeId(mail,id);
		 assertEquals("marwen.hnia11@gmail.com",mail );		
	}*/
/*	
	@Test
	public void testdeleteAllContratJPQL() {
		
	    es.deleteAllContratJPQL();
		
	}*/
	/*
	@Test
	public void testgetSalaireByEmployeIdJPQL() {
		double sal=es.getSalaireByEmployeIdJPQL(1);
		assertEquals(800f, sal);
	}*/
	/*
	@Test
	public void testgetSalaireMoyenByDepartementId() {
		
	}*/
	/*
	@Test 
	public void testgetAllEmployes() {
		List<Employe> listemp=es.getAllEmployes();
		assertEquals(1, listemp.size());
	}*/
	/*
	@Test
	public void testgetTimesheetsByMissionAndDat() throws ParseException{
		Employe e=new Employe("marwen","hnia","marwen.hnia@gmail.com","123",false,Role.CHEF_DEPARTEMENT);
		MissionExterne m=new MissionExterne("Hello World","bbb","marwen@esprit.tn",12);
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		Date d = dateFormat.parse("2020-10-13");
		SimpleDateFormat dateFormat1 = new SimpleDateFormat("yyyy-MM-dd");
		Date d1 = dateFormat1.parse("2020-10-14");
		List<Timesheet>listTime=es.getTimesheetsByMissionAndDate(e, m, d, d1);
		assertEquals(1, listTime.size());
	}*/
	
	
	

}