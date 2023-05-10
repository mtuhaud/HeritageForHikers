package com.udev.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

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
	
	public Etape() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Etape(EtapeDto etapeDto) {
		this.nom = etapeDto.getNom();
		this.description = etapeDto.getDescription();
		this.qrCode = etapeDto.getQrCode();
//		this.commentaires = etapeDto.getCommentaires();
//		this.likes = etapeDto.getLikes();
//		this.photos = etapeDto.getPhotos();
	}
	

}
