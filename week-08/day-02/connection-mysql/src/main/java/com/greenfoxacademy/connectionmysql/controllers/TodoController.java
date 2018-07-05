package com.greenfoxacademy.connectionmysql.controllers;
import com.greenfoxacademy.connectionmysql.models.Todo;
import com.greenfoxacademy.connectionmysql.repositories.TodoRepository;
import com.greenfoxacademy.connectionmysql.services.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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

  @RequestMapping(value="/add", method=RequestMethod.GET)
  public String addPage(Model model) {
    model.addAttribute("newTodo", new Todo());
    return "add";
  }

  @RequestMapping(value="/addtodo", method=RequestMethod.POST)
  public String addTodo(@ModelAttribute Todo todo) {
    todoRepository.save(todo);
    return "redirect:/todo/list";
  }

  @RequestMapping(value="/{id}/delete", method=RequestMethod.GET)
  public String deleteTodo(@PathVariable(value="id") long id ) {
    todoRepository.deleteById(id);
    return "redirect:/todo/list";
  }

  @RequestMapping(value="/{id}/edit", method=RequestMethod.GET)
  public String editTodoPage(@PathVariable(value="id") long id, Model model) {
    model.addAttribute("todo", todoRepository.findById(id).get());
    return "edit";
  }

  @RequestMapping(value="/{id}/edit", method=RequestMethod.POST)
  public String editTodo(@ModelAttribute Todo todo) {
    todoRepository.save(todo);
    return "redirect:/todo/list";
  }
}