package com.greenfoxacademy.restexercises.services;

import com.greenfoxacademy.restexercises.models.Until;
import org.springframework.stereotype.Service;

@Service
public class ExService {

  public int untilChecker(String what, Until number) {
    if (what.equals("sum")) {
      return summarizer(number.getUntil());
    }
    return factorizer(number.getUntil());
  }

  private int factorizer(int number) {
    int factor = 1;
    if(number == 1) {
      return factor;
    } else {
      factor = number * factorizer(number -1);
    }
    return factor;
  }

  public int summarizer(int number) {
    int sum = 1;
    if (number == 1){
      return sum;
    } else {
      sum = number + summarizer(number - 1);
    }
    return sum;
  }



}
