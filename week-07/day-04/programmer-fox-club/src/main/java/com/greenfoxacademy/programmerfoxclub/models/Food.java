package com.greenfoxacademy.programmerfoxclub.models;

public class Food {

  private String food;

  public Food() {
    this("bread");
  }

  public Food(String food) {
    this.food = food;
  }

  public String getFood() {
    return food;
  }

  public void setFood(String food) {
    this.food = food;
  }
}
