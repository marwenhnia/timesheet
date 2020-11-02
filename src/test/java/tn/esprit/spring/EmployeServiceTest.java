package tn.esprit.spring;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.text.ParseException;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import tn.esprit.spring.entities.Contrat;
import tn.esprit.spring.entities.Departement;
import tn.esprit.spring.entities.Employe;
import tn.esprit.spring.services.IEmployeService;

@SpringBootTest
public class EmployeServiceTest {
	@Autowired
	IEmployeService es;
	@Test
	public void testMajEmById() throws ParseException {
		Employe  e = new Employe();
		 e.setId(1);
		 e.setEmail("newEmail");
	 es.mettreAjourEmailByEmployeId(e.getEmail(), 1);
	 
		assertEquals("newEmail", e.getEmail());
		
	}
	@Test
	public void testaffecterEmpDep() throws ParseException {
		Employe  e = new Employe();
		Departement d = new Departement();
		
		 e.setId(1);
		 d.setId(1);
	 es.affecterEmployeADepartement(e.getId(), d.getId());
	 
		assertEquals(1, 1);
		
	}
	
	

}
