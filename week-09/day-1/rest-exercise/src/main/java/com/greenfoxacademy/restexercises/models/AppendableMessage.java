package com.greenfoxacademy.restexercises.models;

public class AppendableMessage implements MessageInterface {

  private String appended;

  public AppendableMessage(String appendable) {
    this.appended = appendable + "a";
  }

  public String getAppended() {
    return appended;
  }

  public void setAppended(String appended) {
    this.appended = appended;
  }
}
