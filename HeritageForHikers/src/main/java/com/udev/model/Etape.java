package com.udev.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
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
	
	public Long getEtape_id() {
		return etape_id;
	}
	public void setEtape_id(Long etape_id) {
		this.etape_id = etape_id;
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
	public String getQrCode() {
		return qrCode;
	}
	public void setQrCode(String qrCode) {
		this.qrCode = qrCode;
	}
//	public List<Commentaire> getCommentaires() {
//		return commentaires;
//	}
//	public void setCommentaires(List<Commentaire> commentaires) {
//		this.commentaires = commentaires;
//	}
//	public List<Like> getLikes() {
//		return likes;
//	}
//	public void setLikes(List<Like> likes) {
//		this.likes = likes;
//	}
//	public List<Photo> getPhotos() {
//		return photos;
//	}
//	public void setPhotos(List<Photo> photos) {
//		this.photos = photos;
//	}
	
	
	
	

	
	
	
	

}
