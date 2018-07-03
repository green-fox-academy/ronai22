package com.greenfoxacademy.listingtodos.repositories;

import com.greenfoxacademy.listingtodos.models.Todo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoRepository extends CrudRepository<Todo, Long> {

}
