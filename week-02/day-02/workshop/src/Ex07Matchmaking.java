import java.util.*;

public class Ex07Matchmaking {
  public static void main(String... args){
    ArrayList<String> girls = new ArrayList<String>(Arrays.asList("Eve","Ashley","Bözsi","Kat","Jane"));
    ArrayList<String> boys = new ArrayList<String>(Arrays.asList("Joe","Fred","Béla","Todd","Neef","Jeff"));

    // Write a method that joins the two lists by matching one girl with one boy into a new list
    // Exepected output: "Eve", "Joe", "Ashley", "Fred"...

    System.out.println(makingMatches(girls, boys));
  }
  public static ArrayList makingMatches (ArrayList girls, ArrayList boys) {
    ArrayList<String> merged = new ArrayList<String>();

    int until = 0;
    if (boys.size() < girls.size()) {
      until = boys.size();
    } else {
      until = girls.size();
    }
    for (int i = 0; i < until ; i++) {
      merged.add((String)girls.get(i));
      merged.add((String)boys.get(i));

    } return merged;
  }
}