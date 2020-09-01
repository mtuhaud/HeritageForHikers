package model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Commentaire {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long commentaire_id;
	private String pseudo;
	private String message;
	private Date date;
	
	
	public Commentaire() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Long getCommentaire_id() {
		return commentaire_id;
	}
	public void setCommentaire_id(Long commentaire_id) {
		this.commentaire_id = commentaire_id;
	}
	public String getPseudo() {
		return pseudo;
	}
	public void setPseudo(String pseudo) {
		this.pseudo = pseudo;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
	

}
