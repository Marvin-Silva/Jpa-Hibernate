package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Vehicule;
import com.example.demo.repository.VehiculeRepo;

@Service
public class VehiculeImpl implements VehiculeInter {

	@Autowired
	VehiculeRepo vehiculeRepo;
	
	@Override
	public List <Vehicule> findAll() throws Exception{
		return vehiculeRepo.findAll();
	}
}
