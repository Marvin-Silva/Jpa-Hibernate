package com.example.demo.model;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "Client")
public class Client {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column (name = "idClient")
	private Long idClient;
	
	@Column (name = "nom")
	private String nom;

	public Client() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Client(Long idClient, String nom) {
		super();
		this.idClient = idClient;
		this.nom = nom;
	}

	public Long getIdClient() {
		return idClient;
	}

	public void setIdClient(Long idClient) {
		this.idClient = idClient;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
	
	
}
