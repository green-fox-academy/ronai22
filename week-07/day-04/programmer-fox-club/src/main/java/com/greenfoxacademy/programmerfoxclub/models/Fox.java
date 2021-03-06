package com.greenfoxacademy.programmerfoxclub.models;

import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class Fox {

  private String name;
  private String food;
  private String drink;
  private List<String> tricks;
  private List<String> actionHistory;

  public Fox() {
  }

  public Fox(String name) {
    this.name = name;
    food = "bread";
    drink = "water";
    tricks = new ArrayList<>();
    actionHistory = new ArrayList<>();
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getFood() {
    return food;
  }

  public void setFood(String food) {
    this.food = food;
  }

  public String getDrink() {
    return drink;
  }

  public void setDrink(String drink) {
    this.drink = drink;
  }

  public List<String> getTricks() {
    return tricks;
  }

  public void setTricks(List<String> tricks) {
    this.tricks = tricks;
  }

  public List<String> getActionHistory() {
    return actionHistory;
  }

  public void setActionHistory(List<String> actionHistory) {
    this.actionHistory = actionHistory;
  }
}
