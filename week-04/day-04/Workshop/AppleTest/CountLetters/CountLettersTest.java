package CountLetters;

import org.junit.BeforeClass;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class CountLettersTest {
  static CountLetters countLetters;

  @BeforeClass
  public static void init() {
    countLetters = new CountLetters();
  }

  @Test
  public void should_giveBack_sameHashMap() {
    Map<String, Integer> letterMap = new HashMap<>();
    String input = "abca";
    letterMap.put("a",2);
    letterMap.put("b",1);
    letterMap.put("c",1);
    assertEquals(letterMap, countLetters.letterCounter(input));
  }

  @Test
  public void should_giveBack_sameSize() {
    Map<String, Integer> letterMap = new HashMap<>();

    String input = "abcdefa";
    letterMap.put("a",2);
    letterMap.put("b",1);
    letterMap.put("c",1);
    letterMap.put("d",1);
    letterMap.put("e",1);
    letterMap.put("f",1);

    assertEquals(letterMap.size(), countLetters.letterCounter(input).size());
  }

}