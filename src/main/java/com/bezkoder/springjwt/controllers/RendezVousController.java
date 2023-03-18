package com.bezkoder.springjwt.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.bezkoder.springjwt.models.RendezVous;
import com.bezkoder.springjwt.security.services.RendezVousService;



@RestController
@RequestMapping("/rendezvous")
public class RendezVousController {
	@Autowired
	RendezVousService rendezvousService;
	
	

@PostMapping("/add-rendezvous")
@ResponseBody
public RendezVous addRendezVous(@RequestBody RendezVous r)
{
	 return rendezvousService.addRendezVous(r);

}


@GetMapping("/listRendezVous")
@ResponseBody
public List<RendezVous> listRendezVous(){
	return rendezvousService.ListRendezVous();
}

@DeleteMapping("/deleteRendezVous/{idRendezVous}")
@ResponseBody
public void deleteRendezVous(@PathVariable("idRendezVous") Long idRendezVous){
	rendezvousService.deleteRendezVous(idRendezVous);
}


@GetMapping("/getRendezVous/{idRendezVous}")
@ResponseBody
public RendezVous getidRendezVousByiD(@PathVariable("idRendezVous") Long idRendezVous){
	return rendezvousService.getRendezVousById(idRendezVous);
}	
	
}
