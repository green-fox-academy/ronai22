package com.greenfoxacademy.restexercises.models;

public class ErrorClass implements MessageClass {

  String error;

  public ErrorClass(String error) {
    this.error = error;
  }

  public String getError() {
    return error;
  }

  public void setError(String error) {
    this.error = error;
  }
}
