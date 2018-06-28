package com.greenfoxacademy.programmerfoxclub.controllers;

import com.greenfoxacademy.programmerfoxclub.Service.FoxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

  private FoxService foxservice;

  @Autowired
  public MainController(FoxService foxservice) {
    this.foxservice = foxservice;
  }

  @GetMapping("")
  public String indexPageRender() {
    return "index";
  }

  @GetMapping("/login")
  public String loginPageRender() {
    return "login";
  }

  @PostMapping("/login")
  public String login(@RequestParam String name) {
    foxservice.loginNewFox(name);
    return "redirect:/profile/" + name;
  }

  @GetMapping("/profile/{username}")
  public String userPageRender() {
    return "index";
  }

}
