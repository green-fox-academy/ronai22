package com.greenfoxacademy.restexercises.models;

public class WhatClass implements MessageInterface {

  int until;

  public WhatClass(int until) {
    this.until = until;
  }

  public int getUntil() {
    return until;
  }

  public void setUntil(int until) {
    this.until = until;
  }
}
