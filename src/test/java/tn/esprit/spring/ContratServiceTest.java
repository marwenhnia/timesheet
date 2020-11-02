package tn.esprit.spring;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.text.ParseException;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import tn.esprit.spring.entities.Contrat;
import tn.esprit.spring.services.IContratService;
@SpringBootTest
public class ContratServiceTest {
	@Autowired
	IContratService cs;
	
	@Test 
	public void testGetAllContrat() throws ParseException {
		List<Contrat> listContact = cs.getAllContrats(); 
		// if there are 5 users in DB : 
		assertEquals(0, listContact.size());

	}
}
