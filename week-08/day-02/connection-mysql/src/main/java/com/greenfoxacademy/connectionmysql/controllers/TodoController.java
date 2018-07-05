package com.greenfoxacademy.connectionmysql.controllers;
import com.greenfoxacademy.connectionmysql.models.Assignee;
import com.greenfoxacademy.connectionmysql.models.Todo;
import com.greenfoxacademy.connectionmysql.repositories.AssigneeRepository;
import com.greenfoxacademy.connectionmysql.repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(value="/todo")
public class TodoController {

  TodoRepository todoRepository;
  AssigneeRepository assigneeRepository;

  @Autowired
  public TodoController(TodoRepository todoRepository, AssigneeRepository assigneeRepository) {
    this.todoRepository = todoRepository;
    this.assigneeRepository = assigneeRepository;
  }

  @RequestMapping(value="", method=RequestMethod.GET)
  public String list2(@RequestParam(value= "isActive", required=false) Boolean isActive , Model model) {
    if (isActive == null) {
      return "redirect:/todo/list";
    }
    model.addAttribute("newTodo", new Todo());
    model.addAttribute("todos", todoRepository.findByDoneFalse());
    return "todolist";
  }

  @RequestMapping(value="/list", method=RequestMethod.GET)
  public String list(Model model) {
    model.addAttribute("newTodo", new Todo());
    model.addAttribute("todos", todoRepository.findAllByIdIsNotNullOrderByIdAsc());
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

  @RequestMapping(value="/search", method=RequestMethod.POST)
  public String searchTodo(@RequestParam("search") String search, Model model) {
    model.addAttribute("todos", todoRepository.findByTitleContaining(search));
    model.addAttribute("newTodo", new Todo());
    return "todolist";
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

  @RequestMapping(value="/assignees", method=RequestMethod.GET)
  public String renderAssignees(Model model) {
    model.addAttribute("assigneeList", assigneeRepository.findAllByIdIsNotNullOrderByIdAsc());
    model.addAttribute("newAssignee", new Assignee());
    return "assigneeList";
  }

  @RequestMapping(value="/addAssignee", method=RequestMethod.POST)
  public String addTodo(@ModelAttribute Assignee assignee) {
    assigneeRepository.save(assignee);
    return "redirect:/todo/assignees";
  }

  @RequestMapping(value="/assignees/{id}/delete", method=RequestMethod.GET)
  public String deleteAssignee(@PathVariable(value="id") long id ) {
    assigneeRepository.deleteById(id);
    return "redirect:/todo/assignees";
  }

  @RequestMapping(value="/assignees/{id}/edit", method=RequestMethod.GET)
  public String editAssignee(@PathVariable(value="id") Long id, Model model) {
    model.addAttribute("editId", id);
    model.addAttribute("editAssignee", assigneeRepository.findById(id).get());
    return "redirect:/todo/assignees";
  }

  @RequestMapping(value="/assignees/{id}/edit", method=RequestMethod.POST)
  public String editAssignee(@ModelAttribute Assignee assignee) {
    assigneeRepository.save(assignee);
    return "redirect:/todo/assignees";
  }



}