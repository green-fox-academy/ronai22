package com.greenfoxacademy.connectionmysql.services;
import com.greenfoxacademy.connectionmysql.models.Todo;
import java.util.List;

public interface TodoService {

  List<Todo> findActive(Boolean isActive);

}
