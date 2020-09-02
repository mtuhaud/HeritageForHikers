package com.udev.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.udev.dao.ItineraireDao;
import com.udev.model.Itineraire;
import com.udev.model.ItineraireDto;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:4200")
public class ItineraireController {
	
	  @Autowired
	  private ItineraireDao itineraireDao;
	  	  
	  	// faire confirmer pour le DTO
	  
		@GetMapping(path="/itineraires/{itineraireId}", consumes="application/json")
		public Itineraire getItineraire(@PathVariable("itineraireId") long itineraireId) {
			return itineraireDao.getItineraire(itineraireId);
		}
	  
	    @GetMapping(path="/itineraires", consumes="application/json")
	    public List<Itineraire> getAllItineraires(@RequestBody Itineraire itineraire) {
	    	return itineraireDao.getAllItineraires();
	    }
	    
	  
	    @PostMapping(path="/itineraire", consumes="application/json")
	    public void addItineraire(@RequestBody ItineraireDto itineraireDto) {
	    	itineraireDao.addItineraire(itineraireDto);
	    }
		
		@PostMapping(path="/itineraires/{itineraireId}/update", consumes="application/json")
		public void updateItineraire(@RequestBody ItineraireDto itineraireDto) {
			itineraireDao.updateItineraire(itineraireDto);
		}
		
		@PostMapping(path="/itineraires/{itineraireId}/delete", consumes="application/json")
		public void deleteItineraire(@PathVariable("itineraireId") long itineraireId) {
			itineraireDao.deleteItineraire(itineraireId);
		}
	    
	    

}
