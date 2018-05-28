public class BattleApp {
  public static void main(String[] args) {

    Ship pirateShip1 = new Ship();
    Ship pirateShip2 = new Ship();

    pirateShip1.fillShip();
    pirateShip2.fillShip();

    System.out.println(pirateShip1.battle(pirateShip2));

  }
}
