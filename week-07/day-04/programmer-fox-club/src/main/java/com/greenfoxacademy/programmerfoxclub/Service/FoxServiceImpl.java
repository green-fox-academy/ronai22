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
  public void loginNewFox(String name) {
    foxlist.getFoxList().add(new Fox(name));
  }

  @Override
  public void getFox(String name) {

  }
}
