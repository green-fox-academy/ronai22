import java.nio.CharBuffer;

public class Exercise09 {

  public static void main(String[] args) {

    char[] charArray = new char[] {'J', 'O', 'I', 'N', ' ', 'T', 'H', 'I', 'S'};
    System.out.println(charJoiner(charArray));
  }

  private static String charJoiner(char[] charArray) {
    return CharBuffer.wrap(charArray)
            .chars()
            .mapToObj(c -> (char) c)
            .map(c -> Character.toString(c))
            .reduce((word, letter) -> word + letter)
            .get();
  }
}
