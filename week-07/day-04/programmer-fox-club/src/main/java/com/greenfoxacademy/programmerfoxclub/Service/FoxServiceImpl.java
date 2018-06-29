package com.greenfoxacademy.programmerfoxclub.Service;

import com.greenfoxacademy.programmerfoxclub.models.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.stream.Collectors;

@Service
public class FoxServiceImpl implements FoxService {

  FoxList foxlist;
  DrinkList drinkList;
  FoodList foodList;
  TrickList trickList;


  @Autowired
  public FoxServiceImpl(FoxList foxlist, DrinkList drinkList, FoodList foodList, TrickList trickList) {
    this.foxlist = foxlist;
    this.drinkList = drinkList;
    this.foodList = foodList;
    this.trickList = trickList;
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
  public String[] getTrickList() {
    return trickList.getTrickList();
  }

  @Override
  public void setNewDrink(String drink, String name) {
    foxlist.getFoxFromList(name).setDrink(drink);
  }

  @Override
  public void setNewFood(String food, String name) {
    foxlist.getFoxFromList(name).setFood(food);
  }

  @Override
  public void addNewTrick(String trick, String name) {
    if (foxlist.getFoxFromList(name).getTricks().isEmpty() || foxlist.getFoxFromList(name).getTricks().stream().filter(a -> a.equals(trick)).collect(Collectors.toList()).isEmpty()){
      foxlist.getFoxFromList(name).getTricks().add(trick);
    }
  }

  @Override
  public void addNewFoodAction(String food, String drink, String name) {
    foxlist.getFoxFromList(name).getActionHistory().add(LocalDateTime.now() + " : Food has been changed from: "
            + foxlist.getFoxFromList(name).getFood() + " to: " + food );
    foxlist.getFoxFromList(name).getActionHistory().add(LocalDateTime.now() + " : Drink has been changed from: "
            + foxlist.getFoxFromList(name).getDrink() + " to: " + drink );
  }

  @Override
  public void addNewLearnAction(String trick, String name) {
    foxlist.getFoxFromList(name).getActionHistory().add(LocalDateTime.now() + " : Learned: " + trick );
  }
}
