package com.udev.service;

import java.util.List;
import java.util.Optional;

import com.udev.model.Itineraire;
import com.udev.model.ItineraireDto;

public interface ItineraireService {
	
	 Optional<ItineraireDto> getItineraire(long itineraireId);
	 
	 List<ItineraireDto> getAllItineraires();
	 
	 Itineraire addItineraire(ItineraireDto itineraireDto);
	 
	 Itineraire updateItineraire(Long id, ItineraireDto itineraireDto);
	 
	 void deleteItineraire (Long id);
	 
	 

}
