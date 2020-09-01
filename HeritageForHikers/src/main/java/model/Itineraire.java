package model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class Itineraire {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long itineraire_id;
	private String nom;
	private String description;
	// @OneToMany(mappedBy = "enclos")
	private List<Etape> etapes;

	public Itineraire() {
		super();
		// TODO Auto-generated constructor stub
	}
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
