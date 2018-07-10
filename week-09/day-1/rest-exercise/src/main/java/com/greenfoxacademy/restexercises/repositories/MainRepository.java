package com.greenfoxacademy.restexercises.repositories;

import com.greenfoxacademy.restexercises.models.LogObject;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface MainRepository extends CrudRepository<LogObject, LocalDateTime> {

  List<LogObject> findAll();

}
