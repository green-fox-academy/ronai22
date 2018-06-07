import java.util.Random;

public class Dog extends Animal {

  Random random = new Random();

  public Dog() {
    this("Dog");
  }

  public Dog(String name) {
    setName(name);
    setHealCost(1 + random.nextInt(8));
  }


}
