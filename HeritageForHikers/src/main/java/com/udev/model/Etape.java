package com.udev.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Data;


@Entity
@Data
public class Etape {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long etape_id;
	private String nom;
	private String description;
	private String qrCode;
	// @OneToMany
	//	private List<Commentaire> commentaires;
	// @OneToMany
	//	private List<Like> likes;
	// @OneToMany
	//	private List<Photo> photos;



}
