package main.java.zoo;

public abstract class Animal {

  private String name;
  private int age;
  private String gender;
  private int legNumber;
  private boolean isPredator;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }

  public int getLegNumber() {
    return legNumber;
  }

  public void setLegNumber(int legNumber) {
    this.legNumber = legNumber;
  }

  public boolean isPredator() {
    return isPredator;
  }

  public void setPredator(boolean predator) {
    isPredator = predator;
  }

  public abstract String getname();
  public abstract String breed();

}
