import java.util.Arrays;

public class Exercise05 {
  public static void main(String[] args) {

    String text = "GIVING, Are you smart enough to Find UpperCase characters in this text, Kiddo?";
    System.out.println(getUppercaseCharacters(text));
  }

  private static String getUppercaseCharacters(String text) {
    String[] splittedText = text.split("");
    return Arrays.stream(splittedText)
            .map(c -> c.charAt(0))
            .filter(Character::isUpperCase)
            .map(c -> Character.toString(c))
            .reduce((uppercase, letter) -> uppercase + letter)
            .get();
  }
}
