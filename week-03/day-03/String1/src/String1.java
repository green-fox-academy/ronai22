public class String1 {
  public static void main(String[] args) {

    String sentence = "Generation x has to xell more to xellow xards";
    char from = 'x';
    char to = 'y';
    System.out.println(xChanger(sentence, from, to));
  }

  private static String xChanger(String s, char from, char to) {
    char first;
    if (s.length() < 1) {
      return s;
    } else {
      if (from == s.charAt(0)) {
        first = to;
      } else {
        first = s.charAt(0);
      }
      return first + xChanger(s.substring(1), from, to);
    }
  }
}