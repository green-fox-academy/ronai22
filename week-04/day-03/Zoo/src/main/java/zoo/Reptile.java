package main.java.zoo;

public class Reptile extends Animal {

  private boolean isItColdblooded;
  private String breed;

  public Reptile(String name) {
    this(name, 5, "female", 4, false);
  }

  public Reptile(String name, int age, String gender, int legNumber, boolean predator) {
    setName(name);
    setAge(age);
    setGender(gender);
    setLegNumber(legNumber);
    setPredator(predator);
    setItColdblooded(true);
    setBreed("Laying eggs");
  }

  public boolean isItColdblooded() {
    return isItColdblooded;
  }

  public void setItColdblooded(boolean itColdblooded) {
    isItColdblooded = itColdblooded;
  }

  public String getBreed() {
    return breed;
  }

  public void setBreed(String breed) {
    this.breed = breed;
  }

  @Override
  public String getname() {
    return getName();
  }

  @Override
  public String breed() {
    return "laying eggs.";
  }
}
