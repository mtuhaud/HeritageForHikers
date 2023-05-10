package com.udev.service;

import java.util.List;
import java.util.Optional;

import com.udev.model.Itineraire;

public interface ItineraireService {
	
	 Optional<Itineraire> getItineraire(long itineraireId);
	 
	 List<Itineraire> getAllItineraires();
	 
	 Itineraire addItineraire(Itineraire itineraire);
	 
	 Itineraire updateItineraire(Long id, Itineraire itineraire);
	 
	 void deleteItineraire (Long id);
	 
	 

}
