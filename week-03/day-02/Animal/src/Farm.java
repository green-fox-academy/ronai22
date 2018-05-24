import java.util.List;

public class Farm {

  List<Animal> animals;
  int freePlaces;

  public void breed () {
    if (freePlaces > 0) {
      Animal animal = new Animal();
    }
  }

  public List slaughter () {
    int hungerIndex = animals.get(0).hunger;
    int fatAnimalIndex = 0;
    for (int i = 0; i < animals.size() ; i--) {
      if (animals.get(i).hunger < hungerIndex) {
        hungerIndex = animals.get(i).hunger;
        fatAnimalIndex = i;
      }
    }
    animals.remove(fatAnimalIndex);
    return animals;
  }
}
