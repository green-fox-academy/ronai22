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
    return "nutritionStore";
  }
  @GetMapping("/eating")
  public String eating(@RequestParam(value= "name") String name, @RequestParam(value= "drink") String drink, @RequestParam(value= "food") String food, Model model) {
    foxservice.addNewFoodAction(food, drink, name);
    foxservice.setNewDrink(drink, name);
    foxservice.setNewFood(food, name);
    model.addAttribute("fox", foxservice.getFox(name));
    return "index";
  }

  @GetMapping("/learning")
  public String learning(@RequestParam(value= "name") String name, @RequestParam(value= "trick") String trick, Model model) {
    foxservice.addNewTrick(trick, name);
    foxservice.addNewLearnAction(trick, name);
    model.addAttribute("fox", foxservice.getFox(name));
    return "index";
  }

  @GetMapping("/trickCenter")
  public String trickCenter(@RequestParam(value = "name") String name, Model model) {
    model.addAttribute("fox", foxservice.getFox(name));
    model.addAttribute("trickList", foxservice.getTrickList());
    return "trickCenter";
  }

  @GetMapping("/actionHistory")
  public String actionHistory(@RequestParam(value = "name") String name, Model model) {
    model.addAttribute("fox", foxservice.getFox(name));
    return "actionHistory";
  }

}
