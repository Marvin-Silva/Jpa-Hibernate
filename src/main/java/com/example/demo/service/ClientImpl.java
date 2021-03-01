package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Client;
import com.example.demo.repository.ClientRepo;


@Service
public class ClientImpl implements ClientInter{

	@Autowired
	ClientRepo clientRepo;
	
	@Override
	public List <Client>findAll(){
		return clientRepo.findAll();
	}
	
	
//	public ResponseEntity<?> addClient (Client client) {
//		return clientRepo.save(client);
//	}
}
