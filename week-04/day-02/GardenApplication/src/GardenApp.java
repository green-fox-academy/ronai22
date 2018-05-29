import java.util.ArrayList;
import java.util.Arrays;

public class GardenApp {

  public static void main(String[] args) {

    Plant flower1 = new Flower("yellow");
    Plant flower2 = new Flower("blue");
    Plant tree1 = new Tree("purple");
    Plant tree2 = new Tree("orange");

    ArrayList<Plant> garden = new ArrayList<>(Arrays.asList(
            flower1,
            flower2,
            tree1,
            tree2
    ));

    statusCheck(garden);
    wateringGarden(40, garden);
    statusCheck(garden);
    wateringGarden(70, garden);
    statusCheck(garden);

  }

  public static void wateringGarden(int wateringAmount, ArrayList<Plant> garden) {
    System.out.println("\nWatering with " + wateringAmount);
    for (Plant plants : garden) {
     plants.watering(wateringAmount / garden.size());
    }
  }

  public static void statusCheck(ArrayList<Plant> garden) {
    for (Plant plants : garden) {
      plants.needsWater();
    }
  }
}
