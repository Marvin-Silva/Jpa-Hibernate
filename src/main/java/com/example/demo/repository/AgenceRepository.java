package com.example.demo.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Agence;

@Repository
@EnableJpaRepositories
public interface AgenceRepository extends JpaRepository <Agence, Long> {
	public List<Agence> findAll();
	
	Optional <Agence> findById(Long idAgence);
	
//	Agence insert(Agence agence);
	
	
//	public List <Vehicule> findAllVehicules();
// Optional<Agence> findById(@Param("idagence") Long idagence);

	
//	public List <Vehicule>Vehicules();
//	public List <Agence> findByAdresse(String adresse);

}
