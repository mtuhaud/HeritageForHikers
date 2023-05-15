package com.udev.dao;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.udev.model.Itineraire;
import lombok.AllArgsConstructor;

@Repository
@AllArgsConstructor
public class ItineraireDao {
	
	@Autowired
	private ItineraireRepository itineraireRepository;
	
	public Optional<Itineraire> getItineraire(long itineraireId) {
		return itineraireRepository.findById(itineraireId);
	}
	
	public List<Itineraire> getAllItineraires() {
		return itineraireRepository.findAll();
	}
	
	public Itineraire saveItineraire(Itineraire itineraire) {
		return itineraireRepository.save(itineraire);
	}
	
	public void deleteItineraire(Long id) {
		itineraireRepository.deleteById(id);
	}

}
