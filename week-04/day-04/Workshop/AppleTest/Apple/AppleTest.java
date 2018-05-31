package Apple;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class AppleTest {

  static Apple apple;

  @BeforeClass
  public static void init() {
    apple = new Apple();
  }

  @Test
  public void should_returnApple_withGetApple() {

    String expectedResult = "Apples";
    String result = apple.getApple();

    assertEquals(expectedResult, result);
  }
}