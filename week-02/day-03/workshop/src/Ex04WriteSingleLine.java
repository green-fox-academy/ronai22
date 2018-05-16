
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

public class Ex04WriteSingleLine {
  public static void main(String[] args) {
    // Open a file called "my-file.txt"
    // Write your name in it as a single line
    // If the program is unable to write the file,
    // then it should print an error message like: "Unable to write file: my-file.txt"
    List<String> content = new ArrayList<>();
    content.add("This is my first line in my-file.txt");
    try {
      Path filepath = Paths.get("/Users/ronaipeter/greenfox/ronai22/week-02/day-03/workshop/my-file-2.txt");
      Files.write(filepath, content);
    }
    catch (Exception e) {
      System.out.println("Unable to write file: my-file-2.txt");
    }
  }
}