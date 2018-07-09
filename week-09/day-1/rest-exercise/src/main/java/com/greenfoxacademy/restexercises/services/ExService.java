package com.greenfoxacademy.restexercises.services;

import com.greenfoxacademy.restexercises.models.*;
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
      factor = number * factorizer(number - 1);
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


  public MessageInterface getArrayCalculation(Arrays arrays) {
    if(arrays.getWhat().equals("sum")) {
      return new Result(arraySummarizer(arrays.getNumbers()));
    } else if (arrays.getWhat().equals("multiply")) {
      return new Result(arrayMultiplier(arrays.getNumbers()));
    }
    return new ResultArray(java.util.Arrays.stream(arrays.getNumbers()).map(a -> a* 2).toArray());
  }

  private int arrayMultiplier(int[] numbers) {
    return java.util.Arrays.stream(numbers).reduce(1, (a, b) -> a * b);
  }

  private int arraySummarizer(int[] numbers) {
    return java.util.Arrays.stream(numbers).sum();
  }
}
