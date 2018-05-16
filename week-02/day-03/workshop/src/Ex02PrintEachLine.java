import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Ex02PrintEachLine {
  public static void main(String[] args) {
    // Write a program that opens a file called "my-file.txt", then prints
    // each of lines form the file.
    // If the program is unable to read the file (for example it does not exists),
    // then it should print an error message like: "Unable to read file: my-file.txt"
    try {
      Path filePath = Paths.get("/Users/ronaipeter/greenfox/ronai22/week-02/day-03/workshop/my-file.txt");
      List<String> lines = Files.readAllLines(filePath);
      for (String s: lines) {
        System.out.println(s);
      }
    } catch (IOException e) {
      System.out.println("Unable to read file: my-file.txt");
    }

  }
}
