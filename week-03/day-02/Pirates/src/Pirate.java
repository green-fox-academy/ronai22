import java.util.Random;
import java.util.Scanner;

public class Pirate {

  static int idCounter = 1;

  int pirateId;
  int drunkIndex;
  int healthIndex;
  String pirateGrade;

  public Pirate() {
    pirateId = idCounter++;
    drunkIndex = 0;
    healthIndex = 2;
  }

  public void drinkSomeRum(){
    if (healthIndex == 0) {
      System.out.println("He is dead.");
    } else {
      drunkIndex = drunkIndex++;
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
        this.healthIndex =1;
      }
    }
  }

  public void parrot (String string) {
    System.out.println(string);
  }
}
