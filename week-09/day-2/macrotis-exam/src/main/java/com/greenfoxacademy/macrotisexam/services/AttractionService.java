package com.greenfoxacademy.macrotisexam.services;

import com.greenfoxacademy.macrotisexam.models.Attractions;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface AttractionService {

  List<Attractions> findAllAttractions();

}
