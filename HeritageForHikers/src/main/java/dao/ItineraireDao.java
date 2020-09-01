package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

import model.Etape;
import model.Itineraire;

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

	public void addItineraire(Itineraire itineraire) {
		em.persist(itineraire);
	}

	public void deleteItineraire(long itineraireId) {
		em.createQuery("delete from Itineraire i where i.id = :iditineraire")
		  .setParameter("iditineraire", itineraireId)
		  .executeUpdate();
	}

}
