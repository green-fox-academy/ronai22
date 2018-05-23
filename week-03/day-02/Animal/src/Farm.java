import java.util.ArrayList;
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
    int[] hungerArray = new int[animals.size()];
    int hungerIndex = 1000;
    for (int i = 0; i <animals.size() ; i++) {
      hungerArray[i] = animals.get(i).hunger;
      if (hungerArray[i] < hungerIndex){
        hungerIndex = hungerArray[i];
      }
    }

    int fatAnimalIndex = 0;
    for (int i = 1; i >= 0 ; i--) {
      if (animals.get(i).hunger < hungerIndex) {
        hungerIndex = animals.get(i).hunger;
        fatAnimalIndex = i;
      }
    }
    animals.remove(fatAnimalIndex);
    return animals;
  }
}
