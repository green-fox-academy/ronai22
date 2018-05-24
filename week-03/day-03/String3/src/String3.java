public class String3 {
  public static void main(String[] args) {

    String sentence = "Given a string, compute recursively a new string, where all the adjacent chars are now separated by a *";
    System.out.println(xChanger(sentence));
  }

  private static String xChanger(String sentence) {
    char first;
    if (sentence.length() < 1) {
      return sentence;
    } else {
      first = sentence.charAt(0);
      return first + "*" + xChanger(sentence.substring(1));
    }
  }
}