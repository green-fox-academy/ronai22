import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exercise10 {

  public static void main(String[] args) {

    List<Fox> foxList = Arrays.asList(
            new Fox("Vuk", "vulpes vulpes", "red"),
            new Fox("Cubist", "vulpes ferrilata", "green"),
            new Fox("Ruppel", "vulpes rueppellii", "khaki"),
            new Fox("Softy", "pallida", "light grey"),
            new Fox("Kit", "vulpes macrotis", "burgundy")
    );
    getGreenColourFox(foxList);
    List<Fox> filteredFoxList = getFilteredFoxes(foxList);
  }

  private static List<Fox> getFilteredFoxes(List<Fox> foxList) {
    return foxList.stream()
            .filter(fox -> fox.getColor().equals("green") || fox.getType().equals("pallida"))
            .collect(Collectors.toList());
  }

  private static void getGreenColourFox(List<Fox> foxList) {
    foxList.stream()
          .filter(fox -> fox.getColor().equals("green"))
          .map(Fox::getName)
          .forEach(System.out::println);
  }
}
