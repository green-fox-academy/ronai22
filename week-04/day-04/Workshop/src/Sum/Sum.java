package Sum;

import java.util.ArrayList;
import java.util.Arrays;

public class Sum {

  ArrayList<Integer> list;

  public Sum() {
    list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
  }

  public int sum(ArrayList<Integer> list) {
    int summary = 0;
    if (list == null) {
    } else {
      for (int i = 0; i < list.size() ; i++) {
        summary += list.get(i);
      }
    }
    return summary;
  }
}
