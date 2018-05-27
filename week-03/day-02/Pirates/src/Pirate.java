import java.util.Random;

public class Pirate {

  int drunkIndex;
  int healthIndex;

  public Pirate() {
    Random random = new Random();
    drunkIndex = random.nextInt(4);
    healthIndex = 2;
  }

  public void drinkSomeRum(){
    if (healthIndex == 0) {
    } else if (healthIndex == 1) {
    } else {
      drunkIndex++;
    }
    if (drunkIndex < 4) {
      healthIndex = 1;
    }
  }

  public void howsItGoingMate(){
    if (drunkIndex <=4)
      System.out.println("Pour me anudder");
    else  {
      System.out.println("Arghh, I'ma Pirate. How d'ya d'ink its goin?");
      healthIndex--;
    }
  }

  public void die() {
    healthIndex = 0;
  }

  public void brawl (Pirate pirate){
    if (pirate.healthIndex == 2) {
      Random random = new Random();
      int fightResult = random.nextInt(3);
      if (fightResult == 0) {
        pirate.healthIndex = 0;
        } else if (fightResult == 1) {
        this.healthIndex = 0;
      } else {
        pirate.healthIndex = 1;
        this.healthIndex = 1;
      }
    } else if (pirate.healthIndex == 1) {
      System.out.println("He is passed out.");
    } else {
      System.out.println("He is dead.");
    }
  }

  public void parrot (String string) {
    System.out.println(string);
  }
}
