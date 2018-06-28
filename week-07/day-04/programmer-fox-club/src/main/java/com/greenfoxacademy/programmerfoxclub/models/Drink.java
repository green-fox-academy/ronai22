package com.greenfoxacademy.programmerfoxclub.models;

public class Drink {

  private String drink;

  public Drink() {
    this("water");
  }

  public Drink(String drink) {
    this.drink = drink;
  }

  public String getDrink() {
    return drink;
  }

  public void setDrink(String drink) {
    this.drink = drink;
  }
}
