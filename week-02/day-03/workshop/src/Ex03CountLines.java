import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Ex03CountLines {
  public static void main(String[] args) {
    // Write a function that takes a filename as string,
    // then returns the number of lines the file contains.
    // It should return zero if it can't open the file, and
    // should not raise any error.
    //Scanner scanner = new Scanner(System.in);
    //String fileName = scanner.nextLine();
    String fileName = "my-file.txt";
    System.out.println(lineCount(fileName));
  }
  public static int lineCount (String fileName){
    int lineNum = 0;
    try {
      Path filePath = Paths.get(fileName);
      List<String> lines = Files.readAllLines(filePath);
      lineNum = lines.size();
    }
    catch (Exception e){
    }
    return lineNum;
  }
}
