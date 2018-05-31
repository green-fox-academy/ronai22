package Anagram;

import java.util.Arrays;

public class Anagram {

  public static void main(String[] args) {

    String input1 = "i am a God";
    String input2 = "idog Maa";

    boolean anagramResult = isAnagram(input1, input2);
    System.out.println(anagramResult);
  }

  private static boolean isAnagram(String input1, String input2) {

    if (orderedInput(input1).equals(orderedInput(input2))) {
      return true;
    }
      return false;
  }

  private static String orderedInput(String input) {
    String orderedInputString;

    char[] charArray = spaceRemover(input).toLowerCase().toCharArray();
    Arrays.sort(charArray);
    orderedInputString = new String(charArray);

    return orderedInputString;
  }

  private static String spaceRemover(String input) {
    String removedSpaces = "";

    for (int i = 0; i <input.length(); i++) {
      if (input.charAt(i) == 32) {
      } else {
        removedSpaces = removedSpaces + input.valueOf(input.charAt(i));
      }
    }
    System.out.println(removedSpaces);
    return removedSpaces;
  }
}
