package com.udev.service;

import java.util.List;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import com.udev.model.Etape;
import com.udev.model.EtapeDto;

public interface EtapeService {

	Etape getEtape(@PathVariable("etapeId") long etapeId);

	List<Etape> getAllEtapes();

	void addEtape(@RequestBody EtapeDto etapeDto);

	void updateEtape(@RequestBody EtapeDto etapeDto);

	void deleteEtape(@PathVariable("etapeId") long etapeId);

}
