package tn.esprit.spring;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.text.ParseException;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import tn.esprit.spring.entities.Departement;
import tn.esprit.spring.services.IDepartementService;
import tn.esprit.spring.services.IEntrepriseService;

@SpringBootTest
public class DepartementServiceTest {
	@Autowired
	IDepartementService ds;
	@Autowired
	IEntrepriseService es;
	@Test 
	public void testGetAllDep() throws ParseException {
		List<Departement> listDepin = ds.getAllDepartements();

		Departement d  = new Departement();
		d.setId(5);
		d.setName("Mobile");
		
	      es.ajouterDepartement(d);
		List<Departement> listDepfin = ds.getAllDepartements();
		// if there are 5 users in DB : 
		assertEquals(listDepfin.size(), listDepin.size()+1);

	}
	

}
