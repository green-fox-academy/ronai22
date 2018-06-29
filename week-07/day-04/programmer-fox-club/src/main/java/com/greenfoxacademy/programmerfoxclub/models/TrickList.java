package com.greenfoxacademy.programmerfoxclub.models;

import org.springframework.stereotype.Component;

@Component
public class TrickList {

  private String[] trickList;

  public TrickList() {
    trickList = new String[]{"Write Html", "Flying", "Teleport", "Ride a bike", "Swim"};
  }

  public String[] getTrickList() {
    return trickList;
  }

  public void setTrickList(String[] trickList) {
    this.trickList = trickList;
  }
}
