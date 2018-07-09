package com.greenfoxacademy.restexercises.models;

public class Until implements MessageInterface {

  int until;

  public Until() {
  }

  public Until(int until) {
    this.until = until;
  }

  public int getUntil() {
    return until;
  }

  public void setUntil(int until) {
    this.until = until;
  }
}
