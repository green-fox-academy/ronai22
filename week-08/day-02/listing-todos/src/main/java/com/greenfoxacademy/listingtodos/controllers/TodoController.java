package com.greenfoxacademy.listingtodos.controllers;

import com.greenfoxacademy.listingtodos.repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value="/todo")
public class TodoController {

  TodoRepository todoRepository;

  @Autowired
  public TodoController(TodoRepository todoRepository) {
    this.todoRepository = todoRepository;
  }

  @RequestMapping(value="", method=RequestMethod.GET)
  public String list2(Model model) {
    return "redirect:/todo/list";
  }

  @RequestMapping(value="/list", method=RequestMethod.GET)
  public String list(Model model) {
    return "todolist";
  }
}
