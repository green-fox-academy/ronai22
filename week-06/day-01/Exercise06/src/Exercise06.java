import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exercise06 {
  public static void main(String[] args) {

    ArrayList<String> cities = new ArrayList<>(Arrays.asList("ROME", "LONDON", "NAIROBI", "CALIFORNIA", "ZURICH", "NEW DELHI", "AMSTERDAM", "ABU DHABI", "PARIS"));
    System.out.println(getFilteredCities(cities));
  }

  private static List<String> getFilteredCities(ArrayList<String> cities) {
    return cities.stream()
            .filter(city -> city.startsWith("A") && city.endsWith("I"))
            .collect(Collectors.toList());
  }
}