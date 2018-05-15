import java.util.*;

public class Ex11IsInList {
  public static void main(String... args){
    ArrayList<Integer> list = new ArrayList<>(Arrays.asList(2, 4, 6, 8, 10, 12, 14, 16));
    ArrayList<Integer> checkThis = new ArrayList<>(Arrays.asList(4, 8, 12, 16));
    System.out.println(checkNums(list, checkThis));
    // Check if list contains all of the following elements: 4,8,12,16
    // Create a method that accepts list as an input
    // it should return "true" if it contains all, otherwise "false"
  }
  public static boolean checkNums (ArrayList list, ArrayList checkThis) {
    boolean checkResult = true;
    for (int i = 0; i < checkThis.size() ; i++) {
      if (list.contains(checkThis.get(i)) == false) {
        checkResult = false;
      }
    }
    return checkResult;
  }
}