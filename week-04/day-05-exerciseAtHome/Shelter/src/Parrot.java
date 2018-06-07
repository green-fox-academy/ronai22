import java.util.Random;

public class Parrot extends Animal {

  Random random = new Random();

  public Parrot() {
    this("Parrot");
  }

  public Parrot(String name) {
    setName(name);
    setHealCost(4 + random.nextInt(7));
  }
}
