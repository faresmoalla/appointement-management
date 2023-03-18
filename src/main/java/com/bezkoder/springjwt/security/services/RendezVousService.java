package com.bezkoder.springjwt.security.services;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bezkoder.springjwt.models.RendezVous;
import com.bezkoder.springjwt.repository.RendezVousRepository;


@Service
public class RendezVousService {

	@Autowired
	RendezVousRepository rendezvousRepo;
	
	
	public RendezVous addRendezVous(RendezVous r) {
		
		return rendezvousRepo.save(r);
	}
	
	
	
	public List<RendezVous> ListRendezVous(){
		
		
		return rendezvousRepo.findAll();
				
		
	}
	
	public void deleteRendezVous(Long idRendezVous) {
		RendezVous r = rendezvousRepo.findById(idRendezVous).orElse(null);
		
		
		rendezvousRepo.delete(r);
	
	}
	
	
	public RendezVous getRendezVousById(Long idRendezVous) {
		return rendezvousRepo.findById(idRendezVous).orElse(null);
	}
	
	
	
	
	
	
}
