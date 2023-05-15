package com.udev.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class ItineraireDto {
	
	@JsonProperty("itineraire_id")
	private long itineraire_id;
	@JsonProperty("nom")
	private String nom;
	@JsonProperty("description")
	private String description;
	@JsonProperty("niveau_id")
	private long niveau_id;
	// private List<Etape> etapes;
	
	
	
	

}
