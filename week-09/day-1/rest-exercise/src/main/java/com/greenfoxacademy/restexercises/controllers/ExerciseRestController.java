package com.greenfoxacademy.restexercises.controllers;


import com.greenfoxacademy.restexercises.models.*;
import com.greenfoxacademy.restexercises.services.ExService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExerciseRestController {

  ExService service;

  @Autowired
  public ExerciseRestController(ExService service) {
    this.service = service;
  }

  @GetMapping("/doubling")
  public MessageClass doubling(@RequestParam(value = "input", required = false) Integer number) {
    if (number != null) {
      return (new Doubler(number));
    }
    return new ErrorClass("Please provide an input!");
  }

  @GetMapping("/greeter")
  public MessageClass greeting(@RequestParam(value = "name", required = false) String name, @RequestParam(value = "title", required = false) String title) {
    if (title != null && name != null) {
      return (new WelcomeMessage(name, title));
    } else if (title == null && name != null) {
      return new ErrorClass("Please provide a title!");
    }
    return new ErrorClass("Please provide a name!");
  }

  @GetMapping("/appenda/{appendable}")
  public MessageClass appenda(@PathVariable(value = "appendable") String appendable) {
    return new AppendableMessage(appendable);
  }


  @GetMapping("/dountil/{what}")
  public MessageClass dountil(@PathVariable(value = "what", required = false) String what) {


    return null;
  }

}
