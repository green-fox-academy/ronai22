public class String3 {
  public static void main(String[] args) {

    String sentence = "Given a string, compute recursively a new string, where all the adjacent chars are now separated by a *";
    System.out.println(starSeparatorAdder(sentence));
  }

  private static String starSeparatorAdder(String sentence) {
    char first;
    if (sentence.length() < 1) {
      return sentence;
    } 
    first = sentence.charAt(0);
    return first + "*" + starSeparatorAdder(sentence.substring(1));
  }
}