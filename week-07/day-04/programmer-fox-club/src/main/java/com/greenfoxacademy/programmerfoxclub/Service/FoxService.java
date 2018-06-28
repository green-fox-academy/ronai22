package com.greenfoxacademy.programmerfoxclub.Service;

import com.greenfoxacademy.programmerfoxclub.models.Fox;

public interface FoxService {

  void loginFox(String name);
  Fox getFox(String name);

}
