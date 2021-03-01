package com.example.demo.service;

import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Agence;
import com.example.demo.repository.AgenceRepository;

@Service
public class AgenceImpl implements AgenceInter {
	
	@Autowired 
	AgenceRepository agenceRepository;
	
	@Override
	public List <Agence> findAll() throws Exception {
		return agenceRepository.findAll();
	}
	
//	@Override
//	Optional <Agence> getId (Long idAgence, Agence agence){
//		if (getId.isPresent()) {
//		
//		
//		return agenceRepository.findById(idAgence, agence);
//		
//		}
//	}
	
	@Override
	public Optional <Agence> findById (Long idAgence)  {
		
		Optional <Agence> getId = this.findById(idAgence);
		
		if (getId.isPresent()) {
        return agenceRepository.findById(idAgence);
		}
		return null;
    }
	
//	@Override
//	public Agence insert (Agence agence) {
//		return agenceRepository.save(agence);
//	}
	
//	
//	@Override
//	public Agence agencefindById (Long idAgence ) throws Exception {
//		
//		return agenceRepository.agencefindById(idAgence );
//	}
	
//	@Override
//	public List <Vehicule> findAllVehicules(){
//		return agenceRepository.findAllVehicules();
//	}
//	@Override
//	public List <Agence> findByAdresse(String adresse) throws Exception{
//		return agenceRepository.findByAdresse(adresse);
//	}
	
}
