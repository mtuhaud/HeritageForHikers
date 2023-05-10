package com.udev.model;

import java.util.List;
import lombok.Data;


@Data
 public class EtapeDto {
	
	private Long etape_id;
	private String nom;
	private String description;
	private String qrCode;
	private List<Commentaire> commentaires;
	private List<Like> likes;
	private List<Photo> photos;
	
	

}
