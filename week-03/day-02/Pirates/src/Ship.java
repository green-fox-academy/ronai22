import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Ship {

  List<Pirate> pirateShip;

  public Ship() {
    pirateShip = new ArrayList<>();
  }

  public List<Pirate> fillShip() {
    Pirate captain = new Pirate();
    pirateShip.add(captain);
    Random random = new Random();
    int pirateNumber = 25 + random.nextInt(76);
    for (int i = 0; i < pirateNumber; i++) {
      Pirate pirate = new Pirate();
      pirateShip.add(pirate);
    }
    if (pirateShip.get(0).healthIndex == 0) {
      System.out.println("Captain on this ship is dead, and there are " + (pirateShip.size() - 1) + " pirates without a single fuck given");
    } else if (pirateShip.get(0).healthIndex == 1) {
      System.out.println("Captain is passed out, and there are " + (pirateShip.size() - 1) + " more pirates having some rum on this ship");
    } else if (pirateShip.get(0).drunkIndex == 0) {
      System.out.println("Captain is alive, and completely sober" + (pirateShip.size() - 1) + " more pirates are ready to drink, or fight");
    } else if (pirateShip.get(0).drunkIndex == 1) {
      System.out.println("Captain is alive, and a little bit drunk" + (pirateShip.size() - 1) + " more pirates are ready to drink, or fight");
    } else if (pirateShip.get(0).drunkIndex == 2) {
      System.out.println("Captain is alive, and a bit drunk" + (pirateShip.size() - 1) + " more pirates are ready to drink, or fight");
    } else if (pirateShip.get(0).drunkIndex == 3) {
      System.out.println("Captain is alive, and drunk" + (pirateShip.size() - 1) + " more pirates are ready to drink, or fight");
    } else if (pirateShip.get(0).drunkIndex == 4) {
      System.out.println("Captain is alive, and very drunk" + (pirateShip.size() - 1) + " more pirates are ready to drink, or fight");
    }
    return pirateShip;
  }

  public boolean battle(Ship ship) {
    Random random = new Random();
    int scoreThis = 0;
    int scoreOther = 0;

    if (this.pirateShip.get(0).healthIndex == 2) {
      scoreThis = this.pirateShip.size() - this.pirateShip.get(0).drunkIndex;
    } else {
      scoreThis = this.pirateShip.size();
    }

    if (ship.pirateShip.get(0).healthIndex == 2) {
      scoreOther = ship.pirateShip.size() - ship.pirateShip.get(0).drunkIndex;
    } else {
      scoreOther = ship.pirateShip.size();
    }

    if (scoreThis > scoreOther) {
      int dieUntil = random.nextInt(ship.pirateShip.size());
      for (int i = dieUntil - 1; i > 0; i--) {
        ship.pirateShip.get(i).die();
      }
      for (int i = 0; i < random.nextInt(4) ; i++) {
        for (int j = 0; j < this.pirateShip.size() ; j++) {
          this.pirateShip.get(i).drinkSomeRum();
        }
      }
      return true;
    } else {
      int dieUntil = random.nextInt(this.pirateShip.size());
      for (int i = dieUntil - 1; i > 0; i--) {
        this.pirateShip.get(i).die();
      }
      for (int i = 0; i < random.nextInt(4) ; i++) {
        for (int j = 0; j < ship.pirateShip.size() ; j++) {
          ship.pirateShip.get(i).drinkSomeRum();
        }
      }
    }
    return false;
  }
}
