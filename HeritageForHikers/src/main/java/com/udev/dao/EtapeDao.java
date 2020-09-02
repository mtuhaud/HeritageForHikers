package com.udev.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

import com.udev.model.Etape;
import com.udev.model.EtapeDto;
import com.udev.model.Itineraire;
import com.udev.model.ItineraireDto;


@Repository
public class EtapeDao {
	
	@PersistenceContext
	private EntityManager em;
	
	public Etape getEtape(long etapeId) {
		return em.find(Etape.class, etapeId);
	}
	
	public List<Etape> getAllEtapes() {
		return em.createQuery("select e from Etape e order by e.nom", Etape.class).getResultList();
	}

	public void addEtape(EtapeDto etapeDto) {
		Etape etape = new Etape(etapeDto);
		em.persist(etape);
	}
	
    public void updateEtape(EtapeDto etapeDto) {
    	Etape etape = this.getEtape(etapeDto.getEtape_id());
        if(etape!= null)  {
        	etape.setNom(etapeDto.getNom());
        	etape.setDescription(etapeDto.getDescription());
        	etape.setQrCode(etapeDto.getQrCode());
        	etape.setCommentaires(etapeDto.getCommentaires());
        	etape.setLikes(etapeDto.getLikes());
        	etape.setPhotos(etapeDto.getPhotos());
        }  
    }

	public void deleteEtape(long etapeId) {
		em.createQuery("delete from Etape e where e.etape_id = :idetape")
		  .setParameter("idetape", etapeId)
		  .executeUpdate();
	}

}
