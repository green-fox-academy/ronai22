package com.greenfoxacademy.restexercises.models;

public class ResultArray implements MessageInterface {

  private int[] result;

  public ResultArray() {
  }

  public ResultArray(int[] result) {
    this.result = result;
  }

  public int[] getResult() {
    return result;
  }

  public void setResult(int[] result) {
    this.result = result;
  }
}
