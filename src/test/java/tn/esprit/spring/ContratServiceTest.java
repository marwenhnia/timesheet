package tn.esprit.spring;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import tn.esprit.spring.entities.Contrat;
import tn.esprit.spring.entities.Employe;
import tn.esprit.spring.services.IContratService;
import tn.esprit.spring.services.IEmployeService;
@SpringBootTest
public class ContratServiceTest {
	@Autowired
	IContratService cs;
	@Autowired
	IEmployeService es;
	
	@Test 
	public void testGetAllContrat() throws ParseException {
		List<Contrat> listContactInit = cs.getAllContrats(); 
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		Date d = dateFormat.parse("2015-03-23");
		Contrat c=new Contrat(d,"CDI",800.0f);

		
	es.ajouterContrat(c);
	List<Contrat> listContactFinal = cs.getAllContrats(); 

		assertEquals(listContactFinal.size(), listContactInit.size()+1);

	}
}
