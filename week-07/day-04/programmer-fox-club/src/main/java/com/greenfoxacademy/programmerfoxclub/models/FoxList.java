package com.greenfoxacademy.programmerfoxclub.models;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

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
}
