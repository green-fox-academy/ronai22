public class Ex05Reverse {
  public static void main(String[] args) {
    String reversed = ".eslaf eb t'ndluow ecnetnes siht ,dehctiws erew eslaf dna eurt fo sgninaem eht fI";
    // Create a method that can reverse a String, which is passed as the parameter
    // Use it on this reversed string to check it!
    // Try to solve this using charAt() first, and optionally anything else after.

    neworder(reversed);

  }
  public static void neworder (String reversed) {
    String reorder = "";
    for (int i = 0; i < reversed.length(); i++) {
      reorder += reversed.charAt(reversed.length() - 1 - i);
    }
    System.out.println(reorder);
  }
}
