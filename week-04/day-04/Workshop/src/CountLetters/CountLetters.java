package CountLetters;

import java.util.HashMap;
import java.util.Map;

public class CountLetters {

  static String input;

  public CountLetters() {
  }

  public static Map<String, Integer> countLetters(String input) {
    Map<String, Integer> letterMap = new HashMap<String, Integer>();

    for (int i = 0; i < input.length() ; i++) {
      if (letterMap.containsKey(input.valueOf(input.charAt(i)))) {
        int count = letterMap.containsKey(input.valueOf(input.charAt(i))) ? letterMap.get(input.valueOf(input.charAt(i))) : 0;
        letterMap.put(input.valueOf(input.charAt(i)), count + 1);
      } else {
        letterMap.put(input.valueOf(input.charAt(i)), 1);
      }
    }
    return letterMap;
  }
}
