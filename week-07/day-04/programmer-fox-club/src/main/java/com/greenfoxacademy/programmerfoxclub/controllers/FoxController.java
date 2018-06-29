package com.greenfoxacademy.programmerfoxclub.controllers;

import com.greenfoxacademy.programmerfoxclub.Service.FoxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FoxController {

  private FoxService foxservice;

  @Autowired
  public FoxController(FoxService foxservice) {
    this.foxservice = foxservice;
  }

  @GetMapping("/nutritionStore")
  public String nutritionStore(@RequestParam(value = "name") String name, Model model) {
    model.addAttribute("fox", foxservice.getFox(name));
    model.addAttribute("drinkList", foxservice.getDrinkList());
    model.addAttribute("foodList", foxservice.getFoodList());
    model.addAttribute("name", name);
    return "nutritionStore";
  }
}
