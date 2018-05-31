package Fibonacci;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class FibonacciTest {
  static Fibonacci fibonacci;

  @BeforeClass
  public static void init() {
    fibonacci = new Fibonacci();
  }

  @Test
  public void should_calculateFibonacciNumber_whenIntInput() {
    int input = 5;
    int expectedResult = 5;
    assertEquals(expectedResult, fibonacci.fibonacci(input));
  }

  @Test
  public void should_calculateFibonacciNumber_when0Input() {
    int input = 0;
    int expectedResult = 0;
    assertEquals(expectedResult, fibonacci.fibonacci(input));
  }

  @Test
  public void should_calculateFibonacciNumber_whenNegativeInput() {
    int input = -1;
    int expectedResult = 0;
    assertEquals(expectedResult, fibonacci.fibonacci(input));
  }

  @Test
  public void should_calculateFibonacciNumber_whenTooBigInput() {
    int input = 47;
    int expectedResult = 0;
    assertEquals(expectedResult, fibonacci.fibonacci(input));
  }

}