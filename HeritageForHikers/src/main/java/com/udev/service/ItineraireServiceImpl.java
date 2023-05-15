package com.udev.service;

import java.util.*;
import java.util.Optional;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.udev.dao.ItineraireDao;
import com.udev.model.Itineraire;
import com.udev.model.ItineraireDto;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class ItineraireServiceImpl implements ItineraireService {

	@Autowired
	private ItineraireDao itineraireDao;

	@Override
	public Optional<ItineraireDto> getItineraire(long itineraireId) {
		Optional<Itineraire> itineraire = itineraireDao.getItineraire(itineraireId);
		
		return itineraire.map(iti -> {
			ItineraireDto itineraireDto = new ItineraireDto();
			itineraireDto.setDescription(iti.getDescription());
			itineraireDto.setItineraire_id(iti.getItineraire_id());
			itineraireDto.setNiveau_id(iti.getNiveau_id());
			itineraireDto.setNom(iti.getNom());
			return itineraireDto;			
		});

	}

	@Override
	public List<ItineraireDto> getAllItineraires() {
		List<Itineraire> itineraires = itineraireDao.getAllItineraires();
		return itineraires.stream().map(
				iti -> {
					ItineraireDto itiDto = new ItineraireDto();
					itiDto.setDescription(iti.getDescription());
					itiDto.setItineraire_id(iti.getItineraire_id());
					itiDto.setNiveau_id(iti.getNiveau_id());
					itiDto.setNom(iti.getNom());
					return itiDto;
					
				}).collect(Collectors.toList());
	}

	@Override
	public Itineraire addItineraire(ItineraireDto itineraireDto) {
			Itineraire itineraire = new Itineraire();
			itineraire.setDescription(itineraireDto.getDescription());
			itineraire.setItineraire_id(itineraireDto.getItineraire_id());
			itineraire.setNiveau_id(itineraireDto.getNiveau_id());
			itineraire.setNom(itineraireDto.getNom());
			return itineraireDao.saveItineraire(itineraire);
	}

	@Override
	public void deleteItineraire(Long id) {
		itineraireDao.deleteItineraire(id);
	}

	@Override
	public Itineraire updateItineraire(Long id, ItineraireDto itineraireDto) {
		Itineraire itineraire = new Itineraire();
		itineraire.setDescription(itineraireDto.getDescription());
		itineraire.setItineraire_id(id);
		itineraire.setNiveau_id(itineraireDto.getNiveau_id());
		itineraire.setNom(itineraireDto.getNom());
		//itineraire.setItineraire_id(id);
		return itineraireDao.saveItineraire(itineraire);
	}

}
