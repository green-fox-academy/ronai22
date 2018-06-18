import java.util.Arrays;

public class Exercise09 {

  public static void main(String[] args) {

    Character[] charArray = new Character[] {'J', 'O', 'I', 'N', ' ', 'T', 'H', 'I', 'S'};
    System.out.println(charJoiner(charArray));
  }

  private static String charJoiner(Character[] charArray) {
    return Arrays.stream(charArray)
            .map(c -> Character.toString(c))
            .reduce((word, letter) -> word + letter)
            .get();
  }
}
