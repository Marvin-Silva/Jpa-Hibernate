package com.example.demo.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;



@Entity
@Table (name = "agence")
public class Agence {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column (name = "idagence", unique = true, nullable = false)
	private Long idAgence;
	
	
	@Column (name = "adresse")
	private String adresse;
	
	@OneToMany(mappedBy = "id", cascade = CascadeType.ALL,fetch=FetchType.EAGER)
	@JsonBackReference
	List<Vehicule> Vehicules;
	
	
	
	
	public Agence() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Agence (Long idagence, String adresse, List<Vehicule>Vehicules) {
		this.idAgence = idagence;
		this.adresse = adresse;
	}

	public List<Vehicule> getVehicules() {
		return Vehicules;
	}

	public void setVehicules(List<Vehicule> vehicules) {
		Vehicules = vehicules;
	}

	public Long getIdAgence() {
		return idAgence;
	}

	public void setIdAgence(Long idAgence) {
		this.idAgence = idAgence;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	
	
	
}
