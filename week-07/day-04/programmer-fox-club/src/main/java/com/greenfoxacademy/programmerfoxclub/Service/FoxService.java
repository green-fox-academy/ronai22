package com.greenfoxacademy.programmerfoxclub.Service;

import com.greenfoxacademy.programmerfoxclub.models.Fox;

public interface FoxService {

  void loginFox(String name);
  Fox getFox(String name);
  String[] getDrinkList();
  String[] getFoodList();
  String[] getTrickList();
  void setNewDrink(String drink, String name);
  void setNewFood(String food, String name);
  void addNewTrick(String trick, String name);

}
