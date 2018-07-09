package com.greenfoxacademy.restexercises.controllers;


import com.greenfoxacademy.restexercises.models.Doubler;
import com.greenfoxacademy.restexercises.models.ErrorClass;
import com.greenfoxacademy.restexercises.models.MessageClass;
import com.greenfoxacademy.restexercises.services.ExService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
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
}
