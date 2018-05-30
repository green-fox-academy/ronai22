package main.java.zoo;

public class Mammal extends Animal {

  private boolean isItWarmblooded;

  public Mammal(String name) {
    this(name, 10, "male", 4, false);
  }

  public Mammal(String name, int age, String gender, int legNumber, boolean isPredator) {
    setName(name);
    setAge(age);
    setGender(gender);
    setLegNumber(legNumber);
    setPredator(isPredator);
    setItWarmblooded(true);
  }

  public boolean isItWarmblooded() {
    return isItWarmblooded;
  }

  public void setItWarmblooded(boolean itWarmblooded) {
    isItWarmblooded = itWarmblooded;
  }

  public String heart() {
    return "Du-dumm, du-dumm...";
  }

  @Override
  public String getname() {
    return getName();
  }

  @Override
  public String breed() {
    return "pushing miniature versions out.";
  }
}
