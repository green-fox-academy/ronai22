package com.greenfoxacademy.connectionmysql.repositories;

import com.greenfoxacademy.connectionmysql.models.Todo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface TodoRepository extends CrudRepository<Todo, Long> {

  List<Todo> findByTitleContaining(String search);
  List<Todo> findByDoneFalse();
  List<Todo> findAllByIdIsNotNullOrderByIdAsc();

}
