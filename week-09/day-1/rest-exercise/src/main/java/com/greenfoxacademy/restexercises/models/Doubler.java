package com.greenfoxacademy.restexercises.models;


public class Doubler {

  int received;
  int result;

  public Doubler() {
  }

  public Doubler(int received, int result) {
    this.received = received;
    this.result = 2 * result;
  }

  public int getReceived() {
    return received;
  }

  public void setReceived(int received) {
    this.received = received;
  }

  public int getResult() {
    return result;
  }

  public void setResult(int result) {
    this.result = result;
  }
}
