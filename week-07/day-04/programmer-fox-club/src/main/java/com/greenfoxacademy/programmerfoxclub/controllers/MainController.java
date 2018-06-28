package com.greenfoxacademy.programmerfoxclub.controllers;

import com.greenfoxacademy.programmerfoxclub.Service.FoxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class MainController {

  private FoxService foxservice;

  @Autowired
  public MainController(FoxService foxservice) {
    this.foxservice = foxservice;
  }

  @GetMapping("/login")
  public String loginPageRender() {
    return "login";
  }

  @GetMapping("")
  public String login(@RequestParam (value = "name", required = false) String name, Model model) {
    if (name == null) {
      return "redirect:/login";
    }
    foxservice.loginFox(name);
    model.addAttribute("fox", foxservice.getFox(name));
    return "index";
  }
}
