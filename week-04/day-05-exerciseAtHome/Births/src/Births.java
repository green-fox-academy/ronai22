import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Births {

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

    for (Object birthYear:letterMap.keySet()) {
      if (letterMap.get(birthYear).equals(maxBirths)) {
        return (String) birthYear;
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
