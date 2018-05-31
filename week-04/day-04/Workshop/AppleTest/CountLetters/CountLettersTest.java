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

  @Test
  public void should_beTheSame_withSpecialCharacters() {
    Map<String, Integer> letterMap = new HashMap<>();
    String input = ":--!:+";
    letterMap.put(":",2);
    letterMap.put("-",2);
    letterMap.put("!",1);
    letterMap.put("+",1);
    assertEquals(letterMap, countLetters.letterCounter(input));
  }

  @Test
  public void should_beTheSame_withEmptyHashmap() {
    Map<String, Integer> letterMap = new HashMap<>();
    String input = "";
    assertEquals(letterMap, countLetters.letterCounter(input));
  }

  @Test
  public void should_beTheSame_withSpacesInTheText() {
    Map<String, Integer> letterMap = new HashMap<>();
    String input = "ab ab ab";
    letterMap.put("a",3);
    letterMap.put("b",3);
    letterMap.put(" ",2);
    assertEquals(letterMap, countLetters.letterCounter(input));
  }

  @Test
  public void should_beTheSame_withCapitalLetters() {
    Map<String, Integer> letterMap = new HashMap<>();
    String input = "ab Ab ab";
    letterMap.put("a",2);
    letterMap.put("b",3);
    letterMap.put(" ",2);
    letterMap.put("A",1);
    assertEquals(letterMap, countLetters.letterCounter(input));
  }
}