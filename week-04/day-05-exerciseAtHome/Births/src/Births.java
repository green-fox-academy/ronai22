import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Births {
  // Create a function that
  // - takes a filename as a parameter,
  // - reads a csv file which rows contains data in the following format: <person name>;<birthdate in YYYY-MM-DD format>;<city name>
  // - returns the year when the most births happend.

  // You can find such a csv file in this directory: births.csv
  // If you pass births.csv to your function, the result should be 2006.

  public static void main(String[] args) {
    Map<String, Integer> letterMap = hashMapTransformer(readFile());
    System.out.println(getMostBirthsYear(letterMap));
  }
  
  public static String getMostBirthsYear(Map<String,Integer> letterMap) {
    int maxBirths = 0;
    for (Integer max: letterMap.values()) {
      if (max > maxBirths) {
        maxBirths = max;
      }
    }

    for (Object birthyears:letterMap.keySet()) {
      if (letterMap.get(birthyears).equals(maxBirths)) {
        return (String) birthyears;
      }
    }
    return "";
  }

  public static Map<String, Integer> hashMapTransformer(List<String> lines) {
    Map<String, Integer> hashmap = new HashMap<>();
    for (int i = 0; i < lines.size() ; i++) {
      if (hashmap.containsKey(lines.get(i).split(";")[1].split("-")[0])) {
        int count = hashmap.getOrDefault(lines.get(i).split(";")[1].split("-")[0], 0);
        hashmap.put(lines.get(i).split(";")[1].split("-")[0], count + 1);
      } else {
        hashmap.put(lines.get(i).split(";")[1].split("-")[0], 1);
      }
    }
    return hashmap;
  }


  public static List<String> readFile() {
    List<String> lines = new ArrayList<>();
    try {
      Path filePath = Paths.get("births.csv");
      lines = Files.readAllLines(filePath);
    } catch (IOException e) {
      System.out.println("Unable to read file");
    }
    return lines;
  }
}
