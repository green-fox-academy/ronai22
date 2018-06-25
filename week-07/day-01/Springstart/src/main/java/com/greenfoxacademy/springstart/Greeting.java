package com.greenfoxacademy.springstart;

public class Greeting {
  private long id;
  private String content;

  public Greeting() {
    this("default", 1);
  }

  public Greeting(String content, long id) {
    this.id = id;
    this.content = content;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }
}
