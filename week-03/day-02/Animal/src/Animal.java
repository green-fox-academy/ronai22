public class Animal {

  int hunger;
  int thirst;

  public Animal() {
    hunger = 50;
    thirst = 50;
  }

  public void eat () {
    hunger--;
  }
  public void drink () {
    thirst--;
  }

  public void play () {
    hunger++;
    thirst++;
  }

  @Override
  public String toString() {
    return "Hunger Index: " + this.hunger + "\n" + "Thirst Index: " + this.thirst ;
  }
}
