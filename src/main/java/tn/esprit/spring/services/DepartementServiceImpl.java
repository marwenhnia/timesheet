package tn.esprit.spring.services;

import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.entities.Departement;
import tn.esprit.spring.repository.DepartementRepository;

@Service
public class DepartementServiceImpl implements IDepartementService {

	public static final Logger l=LogManager.getLogger(DepartementServiceImpl.class);

	@Autowired
	DepartementRepository deptRepoistory;


	public List<Departement> getAllDepartements() {

		return (List<Departement>) deptRepoistory.findAll();

	}

}
