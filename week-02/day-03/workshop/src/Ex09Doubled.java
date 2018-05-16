import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Ex09Doubled {
  public static void main(String[] args) {

    ArrayList<String> decodedLines;
    decodedLines = encriptedChars();
    for (String s: decodedLines) {
      System.out.println(s);
    }
  }


  public static ArrayList encriptedChars () {
    ArrayList<String> decodedLines = new ArrayList<>();
    try {
      Path filepath = Paths.get("duplicated-chars.txt");
      List<String> lines = Files.readAllLines(filepath);
      for (int i = 0; i < lines.size(); i++) {
        String temp = lines.get(i);
        String temp2 = "";
        for (int j = 0; j < temp.length() ; j++) {
          if (j % 2 == 0)
          temp2 = temp2 + String.valueOf(temp.charAt(j));
        } decodedLines.add(i, temp2);
      }
    }
      catch (IOException e) {
      e.printStackTrace();
    }
    return decodedLines;
  }
}
