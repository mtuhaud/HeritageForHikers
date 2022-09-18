package com.udev.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ItineraireDto {
	
	@JsonProperty("itineraire_id")
	private Long itineraire_id;
	@JsonProperty("nom")
	private String nom;
	@JsonProperty("description")
	private String description;
	@JsonProperty("niveau_id")
	private Long niveau_id;
	
	// private List<Etape> etapes;
	
	
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
	public Long getNiveau_id() {
		return niveau_id;
	}
	public void setNiveau_id(Long niveau_id) {
		this.niveau_id = niveau_id;
	}
	
//	public List<Etape> getEtapes() {
//		return etapes;
//	}
//	public void setEtapes(List<Etape> etapes) {
//		this.etapes = etapes;
//	}
	
	
	
	

}
