package com.greenfoxacademy.programmerfoxclub.Service;

import com.greenfoxacademy.programmerfoxclub.models.Fox;
import com.greenfoxacademy.programmerfoxclub.models.FoxList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FoxServiceImpl implements FoxService {

  FoxList foxlist;

  @Autowired
  public FoxServiceImpl(FoxList foxlist) {
    this.foxlist = foxlist;
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
}
