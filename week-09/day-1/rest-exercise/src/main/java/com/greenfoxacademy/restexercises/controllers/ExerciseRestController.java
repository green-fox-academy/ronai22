package com.greenfoxacademy.restexercises.controllers;


import com.greenfoxacademy.restexercises.models.*;
import com.greenfoxacademy.restexercises.services.ExService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ExerciseRestController {

  ExService service;

  @Autowired
  public ExerciseRestController(ExService service) {
    this.service = service;
  }

  @GetMapping("/doubling")
  public MessageInterface doubling(@RequestParam(value = "input", required = false) Integer number) {
    if (number != null) {
      return (new Doubler(number));
    }
    return new ErrorClass("Please provide an input!");
  }

  @GetMapping("/greeter")
  public MessageInterface greeting(@RequestParam(value = "name", required = false) String name, @RequestParam(value = "title", required = false) String title) {
    if (title != null && name != null) {
      return (new WelcomeMessage(name, title));
    } else if (title == null && name != null) {
      return new ErrorClass("Please provide a title!");
    }
    return new ErrorClass("Please provide a name!");
  }

  @GetMapping("/appenda/{appendable}")
  public MessageInterface appenda(@PathVariable(value = "appendable") String appendable) {
    return new AppendableMessage(appendable);
  }

  @PostMapping("/dountil/{what}")
  public MessageInterface dountil(@PathVariable(value = "what", required = false) String what, @RequestBody(required = false) Until until) {
    if (until == null) {
      return new ErrorClass("Please provide a number!");
    }
    return new Result(service.untilChecker(what, until));
  }

  @PostMapping("/arrays")
  public MessageInterface arrayCalculator(@RequestBody(required = false) Arrays arrays) {
    if (arrays != null) {
      return service.getArrayCalculation(arrays);
    }
    return new ErrorClass("Please provide what to do with the numbers!");
  }

}
