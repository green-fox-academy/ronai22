package Anagram;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class AnagramTest {

  static Anagram anagram;

  @BeforeClass
  public static void init() {
    anagram = new Anagram();
  }

  @Test
  public void should_returnTrue_whenSameWordWithMoreSpaces() {
    String input1 = "g o d";
    String input2 = "god";
    boolean expectation = true;

    assertTrue(anagram.isAnagram(input1, input2));
  }

  @Test
  public void should_returnTrue_whenSameWordWithUppercase() {
    String input1 = "GOD";
    String input2 = "god";
    boolean expectation = true;

    assertTrue(anagram.isAnagram(input1, input2));
  }

  @Test
  public void should_returnFalse_whenSameWordWithEmptyString() {
    String input1 = "";
    String input2 = "";
    boolean expectation = false;

    assertTrue(anagram.isAnagram(input1, input2));
  }

  @Test
  public void should_returnTrue_whenSameWordWithNumbers() {
    String input1 = "982 516";
    String input2 = "615 892";
    boolean expectation = true;

    assertTrue(anagram.isAnagram(input1, input2));
  }

  @Test
  public void should_returnTrue_whenSameWordWithSpecialCharacter() {
    String input1 = "God:";
    String input2 = ":god";
    boolean expectation = true;

    assertTrue(anagram.isAnagram(input1, input2));
  }
}