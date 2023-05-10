package com.udev.dao;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.udev.model.Etape;
import com.udev.model.EtapeDto;
import lombok.AllArgsConstructor;


@Repository
@AllArgsConstructor
public class EtapeDao {
	
	@Autowired
	private EtapeRepository etapeRepository;
	
	public Optional<Etape> getEtape(long etapeId) {
		return etapeRepository.findById(etapeId);
	}
	
	public List<Etape> getAllEtapes() {
		return etapeRepository.findAll();
	}

	public void addEtape(EtapeDto etapeDto) {
	}
	
    public void updateEtape(EtapeDto etapeDto) {
    	// TODO : deplacer logique metier dans le service qui contienr logique metier
    	// Etape etape = this.getEtape(etapeDto.getEtape_id());
//        if(etape!= null)  {
//        	etape.setNom(etapeDto.getNom());
//        	etape.setDescription(etapeDto.getDescription());
//        	etape.setQrCode(etapeDto.getQrCode());
//        	etape.setCommentaires(etapeDto.getCommentaires());
//        	etape.setLikes(etapeDto.getLikes());
//        	etape.setPhotos(etapeDto.getPhotos());
        // }  
    }

	public void deleteEtape(long etapeId) {
//		em.createQuery("delete from Etape e where e.etape_id = :idetape")
//		  .setParameter("idetape", etapeId)
//		  .executeUpdate();
	}

}
