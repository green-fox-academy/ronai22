public class String1 {
  public static void main(String[] args) {

    String sentence = "We are the x generation, we need to learn coding in the primary school, xxxxxxxeah";
    System.out.println(xChanger(sentence));

  }

  private static String xChanger(String sentence) {
    if (!sentence.contains("x")) {
      return sentence;
    } else {
      return xChanger(sentence.replace("x", "y"));
    }
  }
}
