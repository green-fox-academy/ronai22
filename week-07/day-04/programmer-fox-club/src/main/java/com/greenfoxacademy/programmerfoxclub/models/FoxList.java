package com.greenfoxacademy.programmerfoxclub.models;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class FoxList {

  private List<Fox> foxList;

  public FoxList() {
    this.foxList = new ArrayList<>();
  }

  public List<Fox> getFoxList() {
    return foxList;
  }

  public void setFoxList(List<Fox> foxList) {
    this.foxList = foxList;
  }

  public Fox getFoxFromList(String name) {
    if(!foxList.isEmpty() && !foxList.stream().filter(a -> a.getName().equals(name)).collect(Collectors.toList()).isEmpty() ) {
      return foxList.stream().filter(a -> a.getName().equals(name)).collect(Collectors.toList()).get(0);
    }
    return null;
  }



}
