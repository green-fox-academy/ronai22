import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SwearWords {

  public static void main(String[] args) {

    ArrayList<String> offensiveWords = new ArrayList<> (Arrays.asList("fuck", "bloody", "cock", "shit", "fucker", "fuckstick", "asshole", "dick", "piss"));
    System.out.println(familyFriendlizer("content.txt", offensiveWords));
  }

  public static int familyFriendlizer(String s, ArrayList<String> offensiveWords) {
    List<String> lines;
    lines = readFile();
    int offensiveWordsNum = offensiveWordCounter(lines, offensiveWords);
    writeFile(s, wordChanger(lines, offensiveWords));
    return offensiveWordsNum;
  }

  public static int offensiveWordCounter(List<String> lines, ArrayList<String> offensiveWords) {
    int offensiveWordNum = 0;
    for (String oneLine : lines) {
        String[] oneLineArray = oneLine.split(" ");
      for (String words : oneLineArray) {
        for (String swearWords: offensiveWords) {
          if (words.toLowerCase().equals(swearWords) || words.toLowerCase().equals(swearWords + ".") || words.toLowerCase().equals(swearWords + ",")) {
            offensiveWordNum++;
          }
        }
      }
    }
    return offensiveWordNum;
  }

  public static List<String> wordChanger(List<String> lines, ArrayList<String> offensiveWords) {
    List<String> newLines = new ArrayList<>();
    for (int i = 0; i < lines.size() ; i++) {
      String[] oneLineArray = lines.get(i).split(" ");
      String safeLine = "";
        for (String word : oneLineArray) {
          safeLine = safeLine + wordchecker(word, offensiveWords);
        }
      newLines.add(safeLine);
    }
    return newLines;
  }

  private static String wordchecker(String word, ArrayList<String> offensiveWords) {
    for (String swearWords: offensiveWords) {
      if (word.toLowerCase().equals(swearWords) || word.toLowerCase().equals(swearWords + ".") || word.toLowerCase().equals(swearWords + ",")) {
        return "";
      }
    }
    return word + " ";
  }

  public static void writeFile(String inputPath, List<String> newLines) {
    try {
      Path filePath = Paths.get("safecontent.txt");
      Files.write(filePath, newLines);
    }
    catch (Exception e){
      System.out.println("Something was wrong, and the file could not be written. Check the path, and try again.");
    }
  }

  public static List<String> readFile() {
    List<String> lines = new ArrayList<>();
    try {
      Path filePath = Paths.get("content.txt");
      lines = Files.readAllLines(filePath);
    } catch (IOException e) {
      System.out.println("Unable to read file");
    }
    return lines;
  }
}