package com.udev.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.udev.model.Etape;

@Repository
@CrossOrigin(origins = "http://localhost:4200")
public interface EtapeRepository extends JpaRepository<Etape, Long>{

}
