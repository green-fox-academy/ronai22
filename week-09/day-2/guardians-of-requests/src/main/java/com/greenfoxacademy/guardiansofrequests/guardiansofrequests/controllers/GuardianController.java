package com.greenfoxacademy.guardiansofrequests.guardiansofrequests.controllers;

import com.greenfoxacademy.guardiansofrequests.guardiansofrequests.models.Groot;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GuardianController {
  @GetMapping("/groot")
  public ResponseEntity<?> groot (@RequestParam (value = "message", required = false) String message) {
    if (message == null) {
      return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new Error("I am Groot!"));
    }
    return ResponseEntity.status(HttpStatus.OK).body(new Groot(message));
  }
}
