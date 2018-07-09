package com.greenfoxacademy.restexercises.models;

public class Result implements MessageInterface {

  int result;

  public Result() {
  }

  public Result(int result) {
    this.result = result;
  }

  public int getResult() {
    return result;
  }

  public void setResult(int result) {
    this.result = result;
  }
}
