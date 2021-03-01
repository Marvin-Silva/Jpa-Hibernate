package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Vehicule;
import com.example.demo.repository.VehiculeRepo;

@RestController
@RequestMapping("/home")
public class VehiculeController {

	@Autowired
	VehiculeRepo vehiculeRepo;
	
	@GetMapping("/vehicules")
	public List <Vehicule> findAll(){
		return vehiculeRepo.findAll();
	}
}
