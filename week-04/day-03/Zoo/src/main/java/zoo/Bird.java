package main.java.zoo;

public class Bird extends Animal implements Flyable  {

  private String breed;
  private int numberOfWings;

  public Bird(String name) {
    this(name, 5, "female", 4, false);
  }

  public Bird(String name,int age, String gender, int legNumber, boolean predator) {
    setName(name);
    setAge(age);
    setGender(gender);
    setLegNumber(legNumber);
    setPredator(predator);
    setNumberOfWings(2);
    setBreed("Laying Eggs");
  }

  public String getBreed() {
    return breed;
  }

  public void setBreed(String breed) {
    this.breed = breed;
  }

  public int getNumberOfWings() {
    return numberOfWings;
  }

  public void setNumberOfWings(int numberOfWings) {
    this.numberOfWings = numberOfWings;
  }

  @Override
  public String getname() {
    return getName();
  }

  @Override
  public String breed() {
    return "laying eggs.";
  }

  @Override
  public void land() {
    System.out.println("I can land!");
  }

  @Override
  public void fly() {
    System.out.println("I can fly!");
  }
}
