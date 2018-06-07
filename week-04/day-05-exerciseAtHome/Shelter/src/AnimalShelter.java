import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class AnimalShelter {

  private int budget;
  private List<Animal> animals;
  private List<String> adopterList;
  Random random = new Random();

  public AnimalShelter() {
    this.budget = 50;
    animals = new ArrayList<>();
    adopterList = new ArrayList<>();
  }

  public int getBudget() {
    return budget;
  }

  public void setBudget(int budget) {
    this.budget = budget;
  }

  public List<Animal> getAnimals() {
    return animals;
  }

  public void setAnimals(List<Animal> animals) {
    this.animals = animals;
  }

  public List<String> getAdopterList() {
    return adopterList;
  }

  public void setAdopterList(List<String> adopterList) {
    this.adopterList = adopterList;
  }

  public int rescue(Animal animal) {
    animals.add(animal);
    return animals.size();
  }

  public int heal() {
    for (Animal animal : animals) {
      if (!animal.isHealthy() && animal.getHealCost() < getBudget()) {
        animal.setHealthy(true);
        setBudget(getBudget() - animal.getHealCost());
        return 1;
      }
    }
    return 0;
  }

  public void addAdopter(String adopter) {
    adopterList.add(adopter);
  }

  public void findNewOwner() {
    if (!animals.isEmpty() && !adopterList.isEmpty()) {
      int num = random.nextInt(adopterList.size());
      while (!animals.get(num).isAdoptable()) {
        num = random.nextInt(adopterList.size());
      }
      animals.remove(num);
      adopterList.remove(random.nextInt(adopterList.size()));
    }
  }

  public String earnDonation(int donation) {
    setBudget(getBudget()+donation);
    return getBudget() + "";
  }

  public String toString () {
    String status = "Budget: " + getBudget() + "€, There are " + animals.size() + " animal(s) and " + adopterList.size() + " potential adopter(s)";
    for (Animal a : animals) {
      status = status + "\n" + a.toString();
    }
    return status + "\n";
  }
}
