import java.util.Arrays;
import java.util.stream.Collector;

public class Exercise05 {
  public static void main(String[] args) {

    String text = "are you smart enough to Find UpperCase characters in this text, Kiddo?";
    System.out.println(getUppercaseCharacters(text));
  }

  private static String getUppercaseCharacters(String text) {
    String[] splittedText = text.split("");
    return Arrays.stream(splittedText)
            .map(c -> c.charAt(0))
            .filter(c -> Character.isUpperCase(c))
            .map(c -> Character.toString(c))
            .reduce((uppercase, letter) -> uppercase + letter)
            .get();
  }
}
