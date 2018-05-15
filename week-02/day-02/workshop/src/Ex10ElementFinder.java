import java.util.*;

public class Ex10ElementFinder {
  public static void main(String... args){
    ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
    System.out.println(containsSeven(arrayList));
    System.out.println(containsSeven2(arrayList));
    // Write a method that checks if the arrayList contains "7" if it contains return "Hoorray" otherwise return "Noooooo"
    // The output should be: "Noooooo"
    // Do this again with a different solution using different list methods!
  }
  public static String containsSeven (ArrayList arrayList){
    String checkingResult = "";
    if (arrayList.contains(7)) {
      checkingResult = "Hoorray";
    } else {
      checkingResult = "Nooooooooooooo";
    }
    return checkingResult;
  }

  public static String containsSeven2 (ArrayList arrayList){
    String checkingResult = "";
    boolean sevenInTheList = false;

    for (int i = 0; i < arrayList.size() ; i++) {
     sevenInTheList = (Integer)arrayList.get(i) == 7;
    }
    if (sevenInTheList == true) {
      checkingResult = "Hoorray";
    } else {
      checkingResult = "Nooooooooooooo";
    }

    return checkingResult;
  }

}