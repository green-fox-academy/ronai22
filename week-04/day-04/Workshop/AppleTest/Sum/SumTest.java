package Sum;

import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class SumTest {

  static Sum sum;
  static ArrayList<Integer> list;

  @BeforeClass
  public static void init() {
    sum = new Sum();
  }

  @Test
  public void should_returnSum_when_multipleElementArraylistInput() {

    list = new ArrayList<>(Arrays.asList(1,2,3,4,5));
    int expectedSum = 15;
    int resultSum = sum.sum(list);

    assertEquals(expectedSum, resultSum);
  }

  @Test
  public void should_returnSum_when_oneElementArraylistInput() {

    list = new ArrayList<>(Arrays.asList(1));
    int expectedSum = 1;
    int resultSum = sum.sum(list);

    assertEquals(expectedSum, resultSum);
  }

  @Test
  public void should_return0_when_ArraylistEmpty() {

    list = new ArrayList<>();
    int expectedSum = 0;
    int resultSum = sum.sum(list);

    assertEquals(expectedSum, resultSum);
  }

  @Test
  public void should_return0_when_ArraylistNull() {

    list = null;
    Integer expectedSum = 0;
    Integer resultSum = sum.sum(list);

    assertEquals(expectedSum, resultSum);
  }
}