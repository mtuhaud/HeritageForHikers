package com.udev.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Like {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long like_id;
	private String pseudo;
	
	
	public Like() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Long getLike_id() {
		return like_id;
	}
	public void setLike_id(Long like_id) {
		this.like_id = like_id;
	}
	public String getPseudo() {
		return pseudo;
	}
	public void setPseudo(String pseudo) {
		this.pseudo = pseudo;
	}
	
	

}
