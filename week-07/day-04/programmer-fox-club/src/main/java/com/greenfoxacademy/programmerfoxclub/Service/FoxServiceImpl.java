package com.greenfoxacademy.programmerfoxclub.Service;

import com.greenfoxacademy.programmerfoxclub.models.DrinkList;
import com.greenfoxacademy.programmerfoxclub.models.FoodList;
import com.greenfoxacademy.programmerfoxclub.models.Fox;
import com.greenfoxacademy.programmerfoxclub.models.FoxList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FoxServiceImpl implements FoxService {

  FoxList foxlist;
  DrinkList drinkList;
  FoodList foodList;

  @Autowired
  public FoxServiceImpl(FoxList foxlist, DrinkList drinkList, FoodList foodList) {
    this.foxlist = foxlist;
    this.drinkList = drinkList;
    this.foodList = foodList;
  }

  @Override
  public void loginFox(String name) {
    if (foxlist.getFoxFromList(name) == null){
      foxlist.getFoxList().add(new Fox(name));
    }
  }

  @Override
  public Fox getFox(String name) {
    return foxlist.getFoxFromList(name);
  }

  @Override
  public String[] getDrinkList() {
    return drinkList.getDrinkList();
  }

  @Override
  public String[] getFoodList() {
    return foodList.getFoodlist();
  }

  @Override
  public void setNewDrink(String drink, String name) {
    foxlist.getFoxFromList(name).setDrink(drink);
  }

  @Override
  public void setNewFood(String food, String name) {
    foxlist.getFoxFromList(name).setFood(food);
  }
}
