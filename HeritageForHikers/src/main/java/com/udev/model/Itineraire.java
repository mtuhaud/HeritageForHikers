package com.udev.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



@Entity
public class Itineraire implements Serializable {
	
	private static final long serialVersionUID = -3067996720739431656L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long itineraire_id;
	private String nom;
	private String description;
	private long niveau_id;

	public Itineraire() {
		super();
	}	

	public Long getItineraire_id() {
		return itineraire_id;
	}
	public void setItineraire_id(long id) {
		this.itineraire_id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	public Long getNiveau_id() {
		return niveau_id;
	}

	public void setNiveau_id(Long niveau_id) {
		this.niveau_id = niveau_id;
	}
	
	public Itineraire(ItineraireDto itineraireDto) {
		this.nom = itineraireDto.getNom();
		this.description = itineraireDto.getDescription();
		this.niveau_id = itineraireDto.getNiveau_id();
//		this.etapes = itineraireDto.getEtapes();
	}
	
	// @OneToMany
//	private List<Etape> etapes;
//	public List<Etape> getEtapes() {
//		return etapes;
//	}
//	public void setEtapes(List<Etape> etapes) {
//		this.etapes = etapes;
//	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Itineraire [itineraire_id=");
		builder.append(itineraire_id);
		builder.append(", nom=");
		builder.append(nom);
		builder.append(", description=");
		builder.append(description);
		builder.append(", niveau_id=");
		builder.append(niveau_id);
		builder.append("]");
		return builder.toString();
	}
	
	
	
	

}
