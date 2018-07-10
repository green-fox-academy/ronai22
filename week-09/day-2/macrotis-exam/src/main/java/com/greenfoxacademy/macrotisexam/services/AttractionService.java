package com.greenfoxacademy.macrotisexam.services;

import com.greenfoxacademy.macrotisexam.models.Attractions;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface AttractionService {

  List<Attractions> findAllAttractions();
  void saveAttraction (Attractions attraction);
  Attractions findByIdAttraction(long id);
  List<Attractions> findFilteredAttractions(String category, String city);

}
