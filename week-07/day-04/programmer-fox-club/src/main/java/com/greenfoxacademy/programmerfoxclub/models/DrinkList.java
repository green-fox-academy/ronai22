package com.greenfoxacademy.programmerfoxclub.models;

import org.springframework.stereotype.Component;

@Component
public class DrinkList {

  private String[] drinkList;

  public DrinkList() {
    drinkList = new String[]{"water", "beer", "juice", "coffee", "energydrink"};
  }

  public String[] getDrinkList() {
    return drinkList;
  }

  public void setDrinkList(String[] drinkList) {
    this.drinkList = drinkList;
  }
}
