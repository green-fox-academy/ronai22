package com.example.greenfoxacademy.themoviedatabaseandroidapplication.model;

import java.util.List;

public class Result {

  private List<Movie> results;

  public Result() {
  }

  public Result(List<Movie> results) {
    this.results = results;
  }

  public List<Movie> getResults() {
    return results;
  }

  public void setResults(List<Movie> results) {
    this.results = results;
  }
}
