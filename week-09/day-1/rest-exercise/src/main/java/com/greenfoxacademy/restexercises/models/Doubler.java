package com.greenfoxacademy.restexercises.models;


public class Doubler implements MessageInterface {

  int received;
  int result;

  public Doubler() {
  }

  public Doubler(int received) {
    this.received = received;
    this.result = 2 * received;
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
