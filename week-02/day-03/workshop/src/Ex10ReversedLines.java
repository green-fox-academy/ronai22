import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Ex10ReversedLines {
  public static void main(String[] args) {

    List<String> encryptedText = fileToList();
    List<String> decryptedText = decryption(encryptedText);
    print(decryptedText);

  }
  public static List fileToList () {
    List<String> list = new ArrayList<>();
    try {
      Path filePath = Paths.get("reversed-lines.txt");
      list = Files.readAllLines(filePath);
    }
    catch (Exception e) {
      System.out.println("I could not read the file");
    } return list;
  }

  public static List decryption (List<String> encryptedText ){
    List<String> decryptedText = new ArrayList<>();
    for (int i = 0; i < encryptedText.size(); i++) {
      String temp = encryptedText.get(i);
      String temp2 = "";
      for (int j = 0; j < temp.length() ; j++) {
        temp2 += String.valueOf(temp.charAt(temp.length() - 1 -j));
      } decryptedText.add(i, temp2);
    } return decryptedText;
  }

  public static void print (List<String> decryptedText){
    for (String s: decryptedText) {
      System.out.println(s);
    }
  }
}
