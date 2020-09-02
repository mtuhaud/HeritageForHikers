package com.udev.model;

import java.util.List;

public class ItineraireDto {
	
	private Long itineraire_id;
	private String nom;
	private String description;
	private List<Etape> etapes;
	
	
	public Long getItineraire_id() {
		return itineraire_id;
	}
	public void setItineraire_id(Long itineraire_id) {
		this.itineraire_id = itineraire_id;
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
	public List<Etape> getEtapes() {
		return etapes;
	}
	public void setEtapes(List<Etape> etapes) {
		this.etapes = etapes;
	}
	
	
	
	

}
