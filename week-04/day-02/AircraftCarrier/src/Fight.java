import java.util.List;

public class Fight {

  public static void main(String[] args) {

    AirCraft F35one = new F35();
    AirCraft F35two = new F35();
    AirCraft F35three = new F35();

    AirCraft F16one = new F16();
    AirCraft F16two = new F16();
    AirCraft F16three = new F16();

    Carrier carrier1 = new Carrier(2000, 5000);
    Carrier carrier2 = new Carrier(2000, 5000);

    carrier1.addAircraft(F16one);
    carrier1.addAircraft(F16two);
    carrier1.addAircraft(F35one);

    carrier2.addAircraft(F35two);
    carrier2.addAircraft(F35three);
    carrier2.addAircraft(F16three);

    carrier1.fight(carrier2);



  }
}
