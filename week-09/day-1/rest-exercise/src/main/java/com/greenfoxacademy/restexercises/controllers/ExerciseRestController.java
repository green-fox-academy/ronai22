package com.greenfoxacademy.restexercises.controllers;


import com.greenfoxacademy.restexercises.models.*;
import com.greenfoxacademy.restexercises.services.ExService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;

@RestController
public class ExerciseRestController {

  ExService service;

  @Autowired
  public ExerciseRestController(ExService service) {
    this.service = service;
  }

  public ExerciseRestController() {
  }

  @GetMapping("/doubling")
  public ResponseEntity<?> doubling(@RequestParam(value = "input", required = false) Integer number) {
    if (number != null) {
      service.addLog("/doubling", "input=" + number);
      return ResponseEntity.status(HttpStatus.OK).body(new Doubler(number));
    }
    return ResponseEntity.status(HttpStatus.NO_CONTENT).body(new ErrorClass("Please provide an input!"));
  }

  @GetMapping("/greeter")
  public ResponseEntity<?> greeting(@RequestParam(value = "name", required = false) String name, @RequestParam(value = "title", required = false) String title) {
    if (title != null && name != null) {
      service.addLog("/doubling", "input= name:" + name + ", title:" + title);
      return ResponseEntity.status(HttpStatus.OK).body(new WelcomeMessage(name, title));
    } else if (title == null && name != null) {
      return ResponseEntity.status(HttpStatus.NO_CONTENT).body(new ErrorClass("Please provide a title!"));
    }
    return ResponseEntity.status(HttpStatus.NO_CONTENT).body(new ErrorClass("Please provide a name!"));
  }

  @GetMapping("/appenda/{appendable}")
  public ResponseEntity<?> appenda(@PathVariable(value = "appendable") String appendable) {
    service.addLog("/appenda/{appendable}", "input=" + appendable);
    return ResponseEntity.status(HttpStatus.OK).body(new AppendableMessage(appendable));
  }

  @PostMapping("/dountil/{what}")
  public ResponseEntity<?> dountil(@PathVariable(value = "what", required = false) String what, @RequestBody(required = false) Until until) {
    if (until == null) {
      return ResponseEntity.status(HttpStatus.NO_CONTENT).body(new ErrorClass("Please provide a number!"));
    }
    service.addLog("/dountil/{what}", "input= what:" + what + ", until:" + until.getUntil() );
    return ResponseEntity.status(HttpStatus.OK).body(new Result(service.untilChecker(what, until)));
  }

  @PostMapping("/arrays")
  public ResponseEntity<?> arrayCalculator(@RequestBody(required = false) ArraysEx arrays) {
    if (arrays != null) {
      service.addLog("/arrays", "input= what:" + arrays.getWhat() + ", array:" + Arrays.toString(arrays.getNumbers()));
      return ResponseEntity.status(HttpStatus.OK).body(service.getArrayCalculation(arrays));
    }
    return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new ErrorClass("Please provide what to do with the numbers!"));
  }

  @GetMapping("/log")
  public ResponseEntity<?> getLogList() {
    return ResponseEntity.status(HttpStatus.OK).body(new LogAll(service.getAllLogs(), service.getLogCount()));
  }
}