import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
//import java.util.Scanner;

public class Ex06CopyFile {
  public static void main(String[] args) {
    // Write a function that copies a file to an other
    // It should take the filenames as parameters
    // It should return a boolean that shows if the copy was successful
    //Scanner scanner = new Scanner(System.in);
    //String fileName = scanner.nextLine();
    String fileName = "my-file.txt";
    System.out.println(fileCopyCheck(fileName));
  }

  public static boolean fileCopyCheck (String fileName) {
    try {
      Path sourceFilepath = Paths.get(fileName);
      Path copyFilepath = Paths.get("target.txt");
      Files.copy(sourceFilepath, copyFilepath);
    }
    catch (Exception e) {
    return false;
    }
    return true;
  }
}
