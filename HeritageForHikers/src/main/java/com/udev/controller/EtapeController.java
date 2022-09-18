package com.udev.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.udev.dao.EtapeDao;
import com.udev.dao.ItineraireDao;
import com.udev.model.Etape;
import com.udev.model.EtapeDto;
import com.udev.model.Itineraire;
import com.udev.model.ItineraireDto;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:4200")
public class EtapeController {
	
	  @Autowired
	  private EtapeDao etapeDao;
	
		@GetMapping(path="/etapes/{etapeId}", produces="application/json" )
		public Etape getEtape(@PathVariable("etapeId") long etapeId) {
			return etapeDao.getEtape(etapeId);
		}
	  
	    @GetMapping(path="/etapes", produces="application/json")
	    public List<Etape> getAllEtapes() {
	    	return etapeDao.getAllEtapes();
	    }
	    
	    @PostMapping(path="/etape", consumes="application/json")
	    public void addEtape(@RequestBody EtapeDto etapeDto) {
	    	etapeDao.addEtape(etapeDto);
	    }
		
		@PostMapping(path="/etapes/{etapeId}/update", consumes="application/json")
		public void updateEtape(@RequestBody EtapeDto etapeDto) {
			etapeDao.updateEtape(etapeDto);
		}
		
		@PostMapping(path="/etapes/{etapeId}/delete", consumes="application/json")
		public void deleteEtape(@PathVariable("etapeId") long etapeId) {
			etapeDao.deleteEtape(etapeId);
		}

}
