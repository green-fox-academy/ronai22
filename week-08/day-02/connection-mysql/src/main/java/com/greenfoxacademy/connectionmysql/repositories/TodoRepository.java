package com.greenfoxacademy.connectionmysql.repositories;

import com.greenfoxacademy.connectionmysql.models.Todo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface TodoRepository extends CrudRepository<Todo, Long> {

}
