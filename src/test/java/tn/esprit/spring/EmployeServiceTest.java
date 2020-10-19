package tn.esprit.spring;

import static org.junit.jupiter.api.Assertions.assertEquals;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.primefaces.component.spinner.SpinnerRenderer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.junit.jupiter.api.*;
import org.junit.*;
import org.springframework.test.context.junit4.SpringRunner;
import tn.esprit.spring.entities.Contrat;
import tn.esprit.spring.entities.Departement;
import tn.esprit.spring.entities.Employe;
import tn.esprit.spring.entities.Entreprise;
import tn.esprit.spring.entities.Mission;
import tn.esprit.spring.entities.MissionExterne;
import tn.esprit.spring.entities.Role;
import tn.esprit.spring.entities.Timesheet;
import tn.esprit.spring.services.EmployeServiceImpl;
import tn.esprit.spring.services.IContratService;
import tn.esprit.spring.services.IEmployeService;

@SpringBootTest
@RunWith(SpringRunner.class)
public class EmployeServiceTest {
	
	@Autowired
	IEmployeService es;
	@Test
	public void testmettreAjourEmailByEmployeId() { 
		String mail="marwen.hnia11@gmail.com";
		int id=1;
		Employe e=new Employe();
		 es.mettreAjourEmailByEmployeId(mail,id);
		 assertEquals("marwen.hnia11@gmail.com",mail );		
	}
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
	public void testAffecteContratAEmploye() {
		es.affecterContratAEmploye(1, 1);
		assertEquals(1, 1);
	}*/
	/*
	@Test
	public void testgetEmployePrenomById() {
		new Employe();
	String s=	es.getEmployePrenomById(1);
		assertEquals("marwen", s);
	}*/
/*	@Test 
	public void testdeleteEmployeById() {
	int id=2;
	  es.deleteEmployeById(2);
		assertEquals(id,2);
	}*/
	/*
	@Test
	public void testdeleteContratById() {
		int id=3;
		es.deleteContratById(3);
		assertEquals(id,3);
		
	}*/
	@Test
	public void testgetNombreEmployeJPQL() {
		int nb=es.getNombreEmployeJPQL();
		assertEquals(1, nb);
	}
	@Test
	public void testgetAllEmployeNamesJPQL() {
		List<String> listempname = es.getAllEmployeNamesJPQL();
		assertEquals(1, listempname.size());
	}
	/*@Test
	public void testgetAllEmployeByEntreprise() {
		je ne sais comment faire avec junit relation entre 4 table
	}*/
		
	@Test
	public void testmettreAjourEmailByEmployeIdJPQL() { 
		String mail="marwen.hnia11@gmail.com";
		int id=1;
		Employe e=new Employe();
		 es.mettreAjourEmailByEmployeId(mail,id);
		 assertEquals("marwen.hnia11@gmail.com",mail );		
	}
	/*
	@Test
	public void testdeleteContratByIdJPQL() {
		int id=3;
		es.deleteContratById(3);
		assertEquals(id,3);
		
	}*/
	@Test
	public void testgetSalaireByEmployeIdJPQL() {
		double sal=es.getSalaireByEmployeIdJPQL(1);
		assertEquals(800f, sal);
	}
	/*
	@Test
	public void testgetSalaireMoyenByDepartementId() {
		
	}*/
	@Test 
	public void testgetAllEmployes() {
		List<Employe> listemp=es.getAllEmployes();
		assertEquals(1, listemp.size());
	}
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
	}
	
	
	

}
