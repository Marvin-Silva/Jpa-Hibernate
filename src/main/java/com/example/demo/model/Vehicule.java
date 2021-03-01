package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table (name = "Vehicule")

public class Vehicule {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column (name = "idVehicule")
	private int id;
	
	@Column(name = "marque")
	private String marque;
	
	@Column(name = "typeEnergie")
	private String typeEnergie;
	
	@Column(name = "modele")
	private String modele;
	
	@Column(name = "geolocalisation")
	private String geolocalisation;
	
	
	@ManyToOne() 
	@JoinColumn(name = "id")
	Agence agence;

	public Vehicule() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Vehicule(int id, String marque, String typeEnergie, String modele, String geolocalisation,Agence agence) {
		super();
		this.id = id;
		this.marque = marque;
		this.typeEnergie = typeEnergie;
		this.modele = modele;
		this.geolocalisation = geolocalisation;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMarque() {
		return marque;
	}

	public void setMarque(String marque) {
		this.marque = marque;
	}

	public String getTypeEnergie() {
		return typeEnergie;
	}

	public void setTypeEnergie(String typeEnergie) {
		this.typeEnergie = typeEnergie;
	}

	public String getModele() {
		return modele;
	}

	public void setModele(String modele) {
		this.modele = modele;
	}

	public String getGeolocalisation() {
		return geolocalisation;
	}

	public void setGeolocalisation(String geolocalisation) {
		this.geolocalisation = geolocalisation;
	}

	public Agence getAgence() {
		return agence;
	}

	public void setAgence(Agence agence) {
		this.agence = agence;
	}
	
	
}
