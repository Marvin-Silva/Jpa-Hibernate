package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.model.Agence;

public interface AgenceInter {
	
	public List <Agence> findAll() throws Exception;
	
//	public Agence getById(Long idAgence, Agence agence);
	
	public Optional <Agence> findById(Long idAgence);
	
//	Agence insert (Agence agence);
	
	
//	public Agence agencefindById(Long idAgence) throws Exception;
	
//	public List <Vehicule>findAllVehicules() throws Exception;
//	public List <Agence>findByAdresse(String adresse) throws Exception;
}
