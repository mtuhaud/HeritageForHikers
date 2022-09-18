package com.udev.dao;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.udev.model.Etape;
import com.udev.model.Itineraire;
import com.udev.model.ItineraireDto;

@Repository
public class ItineraireDao {
	
	@PersistenceContext
	private EntityManager em;
	
	@Autowired
	private ItineraireRepository itineraireRepository;
	
	public Optional<Itineraire> getItineraire(long itineraireId) {
		return itineraireRepository.findById(itineraireId);
	}
	
	public List<Itineraire> getAllItineraires() {
		return (List<Itineraire>) itineraireRepository.findAll();
	}
	
	public Itineraire addItineraire(Itineraire itineraire) {
		return itineraireRepository.save(itineraire);
	}
	
	public void deleteItineraire(Long id) {
		itineraireRepository.deleteById(id);
	}

}
