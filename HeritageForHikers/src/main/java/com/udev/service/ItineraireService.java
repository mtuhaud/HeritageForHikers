package com.udev.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.udev.dao.ItineraireDao;
import com.udev.model.Itineraire;

@Service
public class ItineraireService {
	
	  @Autowired
	  private ItineraireDao itineraireDao;
	  
	  public Optional<Itineraire> getItineraire(long itineraireId) {
		  return itineraireDao.getItineraire(itineraireId);
	  }
	  
	  public List<Itineraire> getAllItineraires() {
		  return itineraireDao.getAllItineraires();
	  }
	  
	  public Itineraire addItineraire(Itineraire itineraire) {
		  return itineraireDao.addItineraire(itineraire);
	  }
	  
	  public void deleteItineraire (Long id) {
		  itineraireDao.deleteItineraire(id);
	  }

}
