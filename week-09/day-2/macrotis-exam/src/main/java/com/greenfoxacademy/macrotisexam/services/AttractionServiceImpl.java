package com.greenfoxacademy.macrotisexam.services;

import com.greenfoxacademy.macrotisexam.models.Attractions;
import com.greenfoxacademy.macrotisexam.repositories.AttractionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AttractionServiceImpl implements AttractionService {

  AttractionRepository repository;

  @Autowired
  public AttractionServiceImpl(AttractionRepository repository) {
    this.repository = repository;
  }

  @Override
  public List<Attractions> findAllAttractions() {
    return repository.findAll();
  }

  @Override
  public void saveAttraction(Attractions attraction) {
    repository.save(attraction);
  }

  @Override
  public Attractions findByIdAttraction(long id) {
    return repository.findById(id).get();
  }

  @Override
  public List<Attractions> findFilteredAttractions(String category, String city) {
    if(category == null && city == null) {
      return repository.findAll();
    } else if (category != null && city == null) {
      return repository.findByCategory(category);
    } else if (category == null) {
      return repository.findByCity(city);
    }
    return repository.findByCityAndCategory(city, category);
  }
}
