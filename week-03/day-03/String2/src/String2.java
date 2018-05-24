public class String2 {
  public static void main(String[] args) {

    String sentence = "Generation x has to xell more to xellow xards";
    char from = 'x';
    System.out.println(xChanger(sentence, from));
  }

  private static String xChanger(String sentence, char from) {
    char first;
    if (sentence.length() < 1) {
      return sentence;
    } else {
      if (from == sentence.charAt(0)) {
        return xChanger(sentence.substring(1), from);
      } else {
        first = sentence.charAt(0);
      }
      return first + xChanger(sentence.substring(1), from);
    }
  }
}
