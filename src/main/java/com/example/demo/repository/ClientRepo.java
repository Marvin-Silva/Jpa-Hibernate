package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Client;


@Repository
public interface ClientRepo extends JpaRepository <Client, Long>{

	List <Client> findAll();
	
}
