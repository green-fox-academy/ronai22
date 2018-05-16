import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex05WriteMultipleLines {
  public static void main(String[] args) {
    // Create a function that takes 3 parameters: a path, a word and a number,
    // than it should write to a file.
    // The path parameter should be a string, that describes the location of the file.
    // The word parameter should be a string, that will be written to the file as lines
    // The number paramter should describe how many lines the file should have.
    // So if the word is "apple" and the number is 5, than it should write 5 lines
    // to the file and each line should be "apple"
    // The function should not raise any error if it could not write the file.
    Scanner scanner = new Scanner(System.in);

    System.out.println("Please type in the Path, you have your file, you want to write in:");
    String inputPath = scanner.nextLine();
    System.out.println("Please type in the line, you want to store in the file");
    String inputWord = scanner.nextLine();
    System.out.println("Please type in a number, how many times you want to have your line in the file:");
    int linesNum = scanner.nextInt();

    fileWriter(inputPath, inputWord, linesNum);

  }
  public static void fileWriter (String inputPath, String inputWord, int linesNum) {
    List<String> content = new ArrayList<>();
    for (int i = 0; i < linesNum ; i++) {
      content.add(inputWord);
    }
    try {
      Path filePath = Paths.get(inputPath);
      Files.write(filePath, content);
    }
    catch (Exception e){
      System.out.println("Something was wrong, and the file could not be written. Check the path, and try again.");
    }
  }
}
