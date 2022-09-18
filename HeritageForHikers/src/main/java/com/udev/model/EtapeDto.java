package com.udev.model;

import java.util.List;

public class EtapeDto {
	
	private Long etape_id;
	private String nom;
	private String description;
	private String qrCode;
	private List<Commentaire> commentaires;
	private List<Like> likes;
	private List<Photo> photos;
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
	public List<Commentaire> getCommentaires() {
		return commentaires;
	}
	public void setCommentaires(List<Commentaire> commentaires) {
		this.commentaires = commentaires;
	}
	public List<Like> getLikes() {
		return likes;
	}
	public void setLikes(List<Like> likes) {
		this.likes = likes;
	}
	public List<Photo> getPhotos() {
		return photos;
	}
	public void setPhotos(List<Photo> photos) {
		this.photos = photos;
	}
	
	

}
