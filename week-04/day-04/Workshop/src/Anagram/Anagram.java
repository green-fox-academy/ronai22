package Anagram;

import java.util.Arrays;

public class Anagram {

  public static boolean isAnagram(String input1, String input2) {
      return (orderedInput(input1).equals(orderedInput(input2)));
  }

  public static String orderedInput(String input) {
    String orderedInputString;
    char[] charArray = spaceRemover(input).toLowerCase().toCharArray();
    Arrays.sort(charArray);
    orderedInputString = new String(charArray);
    return orderedInputString;
  }

  public static String spaceRemover(String input) {
    String removedSpaces = "";

    for (int i = 0; i <input.length(); i++) {
      if (input.charAt(i) == 32) {
      } else {
        removedSpaces = removedSpaces + input.valueOf(input.charAt(i));
      }
    }
    return removedSpaces;
  }
}
