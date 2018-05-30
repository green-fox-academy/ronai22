import main.java.flyable.Flyable;

public class Helicopter extends Vehicle implements Flyable {


  @Override
  public void land() {
    System.out.println("I can land on a small surface too");
  }

  @Override
  public void fly() {
    System.out.println("I can fly!");
  }
}
