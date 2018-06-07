import java.util.Random;

public class Cat extends Animal {

  Random random = new Random();

  public Cat() {
    this("Cat");
  }

  public Cat(String name) {
    setName(name);
    setHealCost(random.nextInt(7));
  }
}
