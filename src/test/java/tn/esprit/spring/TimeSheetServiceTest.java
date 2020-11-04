package tn.esprit.spring;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import tn.esprit.spring.entities.Departement;
import tn.esprit.spring.entities.Employe;
import tn.esprit.spring.entities.Mission;
import tn.esprit.spring.entities.Role;
import tn.esprit.spring.entities.Timesheet;
import tn.esprit.spring.services.ITimesheetService;

@SpringBootTest
public class TimeSheetServiceTest {
	@Autowired
	ITimesheetService ts;
	@Test
	public void ajouterMissionTest() throws ParseException {
    Mission m = new Mission("name","desc");
   

    int  newMissionID = ts.ajouterMission(m);
	
		assertEquals(m.getId(),newMissionID);
		
	}
	@Test
	public void affecterMissionADepartementTest() throws ParseException {
		Mission m = new Mission("mission1","desc");
		int id = ts.ajouterMission(m);
		System.out.println(id);
		Departement d  = new Departement("dept1");
	
	ts.affecterMissionADepartement(id, 1);
		
		
		assertEquals(id, m.getId());
	}
	@Test
	public void ajouterTimesheetTest() throws ParseException {
		Mission m = new Mission("name","desc");
		m.setId(1);
        Employe e = new Employe("mustapha","majed", "mustaphamajed@esprit.tn", "mustapha" ,false ,Role.CHEF_DEPARTEMENT);
        e.setId(1);
		Timesheet timesheet= new Timesheet();
		timesheet.setEmploye(e);
		timesheet.setMission(m);
		timesheet.setTimesheetPK(null);
		timesheet.setValide(false);
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		Date dateDebut = dateFormat.parse("2015-03-23");
		Date dateFin = dateFormat.parse("2016-03-23");

		ts.ajouterTimesheet(m.getId(), e.getId(), dateDebut, dateFin);
		assertEquals(m.getId() , e.getId());
		
	}
	@Test
	public void validerTimesheetTest() throws ParseException {

		
	}
	@Test
	public void findAllMissionByEmployeJPQLTEst() throws ParseException {

		
	}
	@Test
	public void getAllEmployeByMissionTest() throws ParseException {

		
	}
}
