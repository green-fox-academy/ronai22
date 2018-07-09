package com.greenfoxacademy.restexercises.models;

public class ErrorClass extends MessageClass {

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
