package tn.esprit.spring.services;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.entities.Contrat;
import tn.esprit.spring.repository.ContratRepository;

@Service
public class ContratServiceImpl implements IContratService {


	@Autowired
	ContratRepository contratRepository;

	public static final Logger l=LogManager.getLogger(ContratServiceImpl.class);

	public List<Contrat> getAllContrats() {
		l.info("In  Affichage Contrats ");

		return (List<Contrat>) contratRepository.findAll();
	}

}
