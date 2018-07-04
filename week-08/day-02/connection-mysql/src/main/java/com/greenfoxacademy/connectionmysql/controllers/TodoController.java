package com.greenfoxacademy.connectionmysql.controllers;
import com.greenfoxacademy.connectionmysql.repositories.TodoRepository;
import com.greenfoxacademy.connectionmysql.services.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping(value="/todo")
public class TodoController {

  TodoService service;
  TodoRepository todoRepository;

  @Autowired
  public TodoController(TodoService service, TodoRepository todoRepository) {
    this.service = service;
    this.todoRepository = todoRepository;
  }

  @RequestMapping(value="", method=RequestMethod.GET)
  public String list2(@RequestParam(value= "isActive", required=false) Boolean isActive , Model model) {
    if (isActive == null) {
      return "redirect:/todo/list";
    }
    model.addAttribute("todos", service.findActive(isActive));
    return "todolist";
  }

  @RequestMapping(value="/list", method=RequestMethod.GET)
  public String list(Model model) {
    model.addAttribute("todos", todoRepository.findAll());
    return "todolist";
  }
}