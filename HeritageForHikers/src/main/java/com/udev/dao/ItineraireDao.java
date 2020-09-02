package com.udev.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

import com.udev.model.Etape;
import com.udev.model.Itineraire;
import com.udev.model.ItineraireDto;

@Repository
public class ItineraireDao {
	
	@PersistenceContext
	private EntityManager em;
	
	public Itineraire getItineraire(long itineraireId) {
		return em.find(Itineraire.class, itineraireId);
	}
	
	public List<Itineraire> getAllItineraires() {
		return em.createQuery("select i from Itineraire i order by i.nom", Itineraire.class).getResultList();
	}

	public void addItineraire(ItineraireDto itineraireDto) {
		Itineraire itineraire = new Itineraire(itineraireDto);
		em.persist(itineraire);
	}

	public void deleteItineraire(long itineraireId) {
		em.createQuery("delete from Itineraire i where i.itineraire_id = :iditineraire")
		  .setParameter("iditineraire", itineraireId)
		  .executeUpdate();
	}
	
    public void updateItineraire(ItineraireDto itineraireDto) {
        Itineraire iti = this.getItineraire(itineraireDto.getItineraire_id());
        if(iti!= null)  {
            iti.setNom(itineraireDto.getNom());
            iti.setDescription(itineraireDto.getDescription());
            iti.setEtapes(itineraireDto.getEtapes());
        }  
    }

}
