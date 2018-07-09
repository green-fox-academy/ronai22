package com.greenfoxacademy.restexercises.models;

public class Arrays {

  String what;
  int[] numbers;

  public Arrays() {
  }

  public Arrays(String what, int[] numbers) {
    this.what = what;
    this.numbers = numbers;
  }

  public String getWhat() {
    return what;
  }

  public void setWhat(String what) {
    this.what = what;
  }

  public int[] getNumbers() {
    return numbers;
  }

  public void setNumbers(int[] numbers) {
    this.numbers = numbers;
  }
}
