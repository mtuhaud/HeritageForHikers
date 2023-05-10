package com.udev.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.udev.dao.ItineraireDao;
import com.udev.model.Itineraire;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class ItineraireServiceImpl implements ItineraireService {

	@Autowired
	private ItineraireDao itineraireDao;

	@Override
	public Optional<Itineraire> getItineraire(long itineraireId) {
		return itineraireDao.getItineraire(itineraireId);
	}

	@Override
	public List<Itineraire> getAllItineraires() {
		return itineraireDao.getAllItineraires();
	}

	@Override
	public Itineraire addItineraire(Itineraire itineraire) {
		return itineraireDao.saveItineraire(itineraire);
	}

	@Override
	public void deleteItineraire(Long id) {
		itineraireDao.deleteItineraire(id);
	}

	@Override
	public Itineraire updateItineraire(Long id, Itineraire itineraire) {
		itineraire.setItineraire_id(id);
		return itineraireDao.saveItineraire(itineraire);
	}

}
