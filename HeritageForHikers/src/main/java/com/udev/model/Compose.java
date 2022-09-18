//package com.udev.model;
//
//import java.io.Serializable;
//
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.ManyToOne;
//import javax.persistence.Table;
//
//import org.hibernate.annotations.Cascade;
//import org.hibernate.annotations.CascadeType;
//
//
//@Entity
//@Table(name="compose")
//public class Compose implements Serializable {
//	
//	// @Cascade(CascadeType.DELETE)
//	@Id
//	@GeneratedValue(strategy=GenerationType.IDENTITY)
//	private Integer id;
//
//
//	//bi-directional many-to-one association to Etape
//	@ManyToOne
//	@JoinColumn(name="etape_id")
//	private Etape etape;
//
//	//bi-directional many-to-one association to Itineraire
//	@ManyToOne
//	@JoinColumn(name="itineraire_id")
//	private Itineraire itineraire;
//
//}
