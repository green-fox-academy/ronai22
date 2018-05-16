import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Ex08Logs {
  public static void main(String[] args) {
    // Read all data from 'log.txt'.
    // Each line represents a log message from a web server
    // Write a function that returns an array with the unique IP adresses.
    // Write a function that returns the GET / POST request ratio.
    try {
      Path filePath = Paths.get("log.txt");
      List<String> list = Files.readAllLines(filePath);
      ArrayList<String> uniqueList;
      uniqueList = uniqueIpCheck(list);

      for (int i = 0; i <uniqueList.size() ; i++) {
        System.out.println(uniqueList.get(i));
      }
      System.out.println("A Get/Post request ratio: " + ratioChecker(list));

    } catch (Exception e) {
      System.out.println("Unable to read the file");
    }
  }

  public static ArrayList uniqueIpCheck(List list) {
    ArrayList<String> uniqueList = new ArrayList<>();
    for (int i = 0; i < list.size(); i++) {
      String temp = (String) list.get(i);
      String[] temp2 = temp.split("   ");
        if (uniqueList.contains(temp2[1])) {
        } else {
          uniqueList.add(temp2[1]);
        }
    }return uniqueList;
  }
  public static double ratioChecker (List list) {
    double post = 0;
    double get = 0;
    for (int i = 0; i <list.size() ; i++) {
      String temp = (String) list.get(i);
      String[] temp2 = temp.split("   ");
      if (temp2[2].contains("P")) {
        post = post + 1;
      } else if (temp2[2].contains("G")) {
        get = get + 1;
      }
    } return get/post;
  }
}
