package com.udev.controller;

import java.util.List;
import java.util.Optional;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.udev.dao.ItineraireDao;
import com.udev.dao.ItineraireRepository;
import com.udev.model.Itineraire;
import com.udev.model.ItineraireDto;
import com.udev.service.ItineraireService;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:4200")
public class ItineraireController {
	
	  @Autowired
	  private ItineraireRepository itineraireRepository;
	  @Autowired
	  private ItineraireService itineraireService;
	  	  
	  
		@GetMapping(path="/itineraire/{itineraireId}", produces="application/json")
		public Optional<Itineraire> getItineraire(@PathVariable("itineraireId") long itineraireId) {
			return itineraireService.getItineraire(itineraireId);
		}
		
	    @GetMapping(path="/itineraires", produces="application/json")
	    public List<Itineraire> getAllItineraires() {
	        return (List<Itineraire>) itineraireService.getAllItineraires();
	    }
	    
	    @PostMapping(path="/itineraire", consumes="application/json")
	    public Itineraire addItineraire(@RequestBody Itineraire itineraire) {
	    	return itineraireService.addItineraire(itineraire);
	    }	    

		@PutMapping(path="/{id}")
		public Itineraire updateItineraire(@RequestBody Itineraire itineraire, @PathVariable("id") long id) {
			itineraire.setItineraire_id(id);
			return itineraireService.addItineraire(itineraire);
		}		
		
		@DeleteMapping(path="/cancel/{id}")
		public List <Itineraire> deleteItineraire(@PathVariable Long id) {
			itineraireRepository.deleteById(id);
			return itineraireRepository.findAll();
		}    

}
