package com.greenfoxacademy.restexercises.models;

public class WelcomeMessage implements MessageClass {

  String welcome_message;

  public WelcomeMessage(String name, String title) {
    this.welcome_message = "Oh, hi there " + name + ", my dear " + title + "!";
  }

  public String getWelcome_message() {
    return welcome_message;
  }

  public void setWelcome_message(String welcome_message) {
    this.welcome_message = welcome_message;
  }
}
