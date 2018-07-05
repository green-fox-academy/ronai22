package com.greenfoxacademy.connectionmysql.repositories;

import com.greenfoxacademy.connectionmysql.models.Assignee;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface AssigneeRepository extends CrudRepository<Assignee, Long> {


  List<Assignee> findAllByIdIsNotNullOrderByIdAsc();

}
