package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Client;
import com.example.demo.repository.ClientRepo;


@RestController
@RequestMapping("/home")
public class ClientController {

	@Autowired 
	ClientRepo clientRepo;
	
	@GetMapping ("/client")
	public List <Client> findAll(){
		return clientRepo.findAll();
	}
	
	
//	@RequestMapping(value ="ajouterClient", method = RequestMethod.POST)
//	@ResponseBody
//	public ResponseEntity<?> addClient (@RequestBody Client client) {
//		Client resultClient = null;
//		String nom = client.getNom();
//		
//		if ((nom == null) || (nom.isEmpty()))
//			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("The firstname is not set !");
//		
//		try {
//			resultClient = ClientImpl.addClient(client);
//		} catch (Exception e) {
//			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.getMessage());
//		}
//		return ResponseEntity.status(HttpStatus.CREATED).body(resultClient);
//	}
	
}
