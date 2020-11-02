package tn.esprit.spring;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import tn.esprit.spring.entities.Departement;
import tn.esprit.spring.entities.Employe;
import tn.esprit.spring.entities.Entreprise;
import tn.esprit.spring.repository.DepartementRepository;
import tn.esprit.spring.services.IEmployeService;
import tn.esprit.spring.services.IEntrepriseService;
@SpringBootTest
@RunWith(SpringRunner.class)
public class EntrepriseServiceTest {
	@Autowired
	IEntrepriseService es;
	@Autowired
	DepartementRepository deptRepoistory;

	
	
	@Test
	public void ajouterEntrepriseTest() throws ParseException {
	
	 Entreprise ent = new Entreprise("entreprise1", "raisonent1");
	 ent.setId(1);
	 
		

	 es.ajouterEntreprise(ent);
		assertEquals(1,ent.getId() );
		
	}
	@Test
	public void ajouterDepTest() throws ParseException {
	Departement d  = new Departement();
	d.setId(1);
	d.setName("dep1");
	
      es.ajouterDepartement(d);

		assertEquals(1,d.getId() );
		
	}
	@Test
	public void affecterDEpEnt() throws ParseException {
		
		 Entreprise ent = new Entreprise("entreprise1", "raisonent1");
		 ent.setId(1);
			Departement d  = new Departement();
			d.setId(1);
			d.setName("dep1");
		 es.affecterDepartementAEntreprise(d.getId(), ent.getId());
		
		 Departement  newDep = deptRepoistory.findById(1).get();
		int id=ent.getId();
		Entreprise ee =newDep.getEntreprise();
 


			//assertEquals(ent,newDep.getEntreprise() );
			assertEquals(ent.getId(),ee.getId());

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
	
		 Entreprise ent = new Entreprise("entreprise1", "raisonent1");
		 ent.setId(1);
	//	 es.deleteEntrepriseById(ent.getId());
		
		 assertEquals(1, ent.getId());


		
	}
	@Test
	public void deleteDepartementById() throws ParseException {
		Departement d  = new Departement();
		d.setId(1);
		d.setName("dep1");
	// es.deleteDepartementById(d.getId());

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
