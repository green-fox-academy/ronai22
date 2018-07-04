package com.greenfoxacademy.connectionmysql.services;

import com.greenfoxacademy.connectionmysql.models.Todo;
import com.greenfoxacademy.connectionmysql.repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class TodoServiceImpl implements TodoService {

  @Autowired
  TodoRepository todoRepository;

  @Override
  public List<Todo> findActive(Boolean isActive) {
    List<Todo> todos = new ArrayList<>();
    todoRepository.findAll().iterator().forEachRemaining(todos::add);
    return todos.stream().filter(a -> a.isDone() == !isActive).collect(Collectors.toList());
  }
}
