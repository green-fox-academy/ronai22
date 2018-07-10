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
}
