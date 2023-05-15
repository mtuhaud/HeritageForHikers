package com.udev.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.udev.model.Itineraire;


@CrossOrigin(origins = "http://localhost:4200")
public interface ItineraireRepository extends JpaRepository<Itineraire, Long> {

}






