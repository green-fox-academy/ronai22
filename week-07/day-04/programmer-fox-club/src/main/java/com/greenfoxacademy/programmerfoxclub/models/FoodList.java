package com.greenfoxacademy.programmerfoxclub.models;

import org.springframework.stereotype.Component;

@Component
public class FoodList {

  private String[] foodlist;

  public FoodList() {
    foodlist = new String[]{"hamburger", "sushi", "sausage", "gulash", "salad"};
  }

  public String[] getFoodlist() {
    return foodlist;
  }

  public void setFoodlist(String[] foodlist) {
    this.foodlist = foodlist;
  }
}
