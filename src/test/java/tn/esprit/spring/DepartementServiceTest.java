package tn.esprit.spring;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.text.ParseException;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import tn.esprit.spring.entities.Contrat;
import tn.esprit.spring.entities.Departement;
import tn.esprit.spring.services.IDepartementService;

@SpringBootTest
public class DepartementServiceTest {
	@Autowired
	IDepartementService ds;
	@Test 
	public void testGetAllDep() throws ParseException {
		List<Departement> listDep = ds.getAllDepartements();
		// if there are 5 users in DB : 
		assertEquals(1, listDep.size());

	}
	

}
