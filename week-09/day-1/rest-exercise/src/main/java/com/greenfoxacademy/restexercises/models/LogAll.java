package com.greenfoxacademy.restexercises.models;

import java.util.List;

public class LogAll implements MessageInterface {

  private List<LogObject> entries;
  private long entry_count;

  public LogAll() {
  }

  public LogAll(List<LogObject> entries, long entry_count) {
    this.entries = entries;
    this.entry_count = entry_count;
  }

  public List<LogObject> getEntries() {
    return entries;
  }

  public void setEntries(List<LogObject> entries) {
    this.entries = entries;
  }

  public long getEntry_count() {
    return entry_count;
  }

  public void setEntry_count(long entry_count) {
    this.entry_count = entry_count;
  }
}
