package com.udev.controller;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.udev.model.Itineraire;
import com.udev.model.ItineraireDto;
import com.udev.service.ItineraireService;
import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:4200")
@AllArgsConstructor
public class ItineraireController {

	@Autowired
	private ItineraireService itineraireService;

	@GetMapping(path = "/itineraire/{itineraireId}", produces = "application/json")
	public Optional<ItineraireDto> getItineraire(@PathVariable("itineraireId") long itineraireId) {
		return itineraireService.getItineraire(itineraireId);
	}

	@GetMapping(path = "/itineraires", produces = "application/json")
	public List<ItineraireDto> getAllItineraires() {
		return itineraireService.getAllItineraires();
	}

	@PostMapping(path = "/itineraire", consumes = "application/json")
	public Itineraire addItineraire(@RequestBody ItineraireDto itineraireDto) {
		return itineraireService.addItineraire(itineraireDto);
	}

	@PutMapping(path = "/{id}")
	public Itineraire updateItineraire(@RequestBody ItineraireDto itineraireDto, @PathVariable("id") long id) {
		return itineraireService.updateItineraire(id, itineraireDto);
	}

	@DeleteMapping(path = "/cancel/{id}")
	public void deleteItineraire(@PathVariable Long id) {
		itineraireService.deleteItineraire(id);
	}

}
