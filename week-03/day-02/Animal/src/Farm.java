import java.util.ArrayList;
import java.util.List;

public class Farm {

  List<Animal> animals;
  int freePlaces;

  public Farm() {
    animals = new ArrayList<>();
    freePlaces = 1;
  }

  public void breed () {
    if (freePlaces >= 0) {
      Animal animal = new Animal();
      animals.add(animal);
    }
  }

  public List slaughter () {
    int hungerIndex = animals.get(0).hunger;
    int fatAnimalIndex = 0;
    for (int i = animals.size() - 1; i >= 0 ; i--) {
      if (animals.get(i).hunger < hungerIndex) {
        hungerIndex = animals.get(i).hunger;
        fatAnimalIndex = i;
      }
    }
    animals.remove(fatAnimalIndex);
    return animals;
  }
}
