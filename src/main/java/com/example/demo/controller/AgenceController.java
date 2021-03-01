package com.example.demo.controller;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Agence;
import com.example.demo.repository.AgenceRepository;
import com.example.demo.service.AgenceImpl;

@RestController
@RequestMapping ("/home")
public class AgenceController {

	@Autowired
	public  AgenceRepository agenceRepository;
	
	@Autowired
	AgenceImpl agenceImpl;
	
	@GetMapping("/agence")
	public List <Agence> getVehicules (){
		
		return agenceRepository.findAll();
	}
	
//	@PostMapping("/agence/ajouter")
//	@ResponseBody
//	ResponseEntity<Agence> insert(@RequestBody St){
//		return ResponseEntity.ok().body(agenceRepository.insert(nom));
//	}
	
	@GetMapping("/agence/{id}")
    public Optional <Agence> getId(@PathVariable(value="id") Long idAgence){
        return agenceRepository.findById(idAgence);
	}
	
	
	
	
//	@GetMapping ("/agence/{idAgence}")
//	public Agence getIdVehicules (@PathVariable Long idAgence){
//		return agenceRepository.agencefindById(idAgence);
//	}
	
	
//	@GetMapping("/agence")
//	Optional<Agence> findById(@Param("id") Long idagence){
//		return agenceRepository.findById(idagence);
//	}
	

	
//	@GetMapping("/adresse")
//	public List <Agence> getAllAdresse(@PathVariable String adresse){
//		return agenceRepository.findByAdresse(adresse);
//	}
}
