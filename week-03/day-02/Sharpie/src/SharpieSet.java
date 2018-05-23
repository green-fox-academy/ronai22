import java.util.ArrayList;
import java.util.List;

public class SharpieSet {

  List<Sharpie> sharpies;

  public SharpieSet() {
    sharpies = new ArrayList<>();
  }

  public int countUsable () {
    int numberOfGoodOnes = 0;
    for (Sharpie element: sharpies) {
      if (element.inkAmount > 0) {
        numberOfGoodOnes++;
      }
    }
    return numberOfGoodOnes;
  }

  public List removeTrash () {
    for (int i = sharpies.size() -1 ; i >=0; i--) {
      if (sharpies.get(i).inkAmount < 0) {
        sharpies.remove(i);
      }
    }

    return sharpies;
  }
}