import java.util.ArrayList;
import java.util.List;

public class Carrier {

  private List<AirCraft> carrier;
  private int allAmmoAmount;
  private int healthPoint;

  public Carrier(int allAmmoAmount, int healthPoint) {
    carrier = new ArrayList<>();
    this.allAmmoAmount = allAmmoAmount;
    this.healthPoint = healthPoint;
  }

  public List<AirCraft> getCarrier() {
    return carrier;
  }

  public void setCarrier(List<AirCraft> carrier) {
    this.carrier = carrier;
  }

  public int getAllAmmoAmount() {
    return allAmmoAmount;
  }

  public void setAllAmmoAmount(int allAmmoAmount) {
    this.allAmmoAmount = allAmmoAmount;
  }

  public int getHealthPoint() {
    return healthPoint;
  }

  public void setHealthPoint(int healthPoint) {
    this.healthPoint = healthPoint;
  }

  public void addAircraft(AirCraft airCraft) {
    carrier.add(airCraft);
  }

  public void fill() {
    int maxAmmo = 0;
    for (AirCraft airCraft : carrier) {
      maxAmmo = maxAmmo + airCraft.getMaxAmmo();
    }
    if (allAmmoAmount == 0) {
      System.out.println("Ammo is out of stock, this carrier is fucked");
    } else {
      if (allAmmoAmount < maxAmmo) {
        for (AirCraft airCraft : carrier) {
          if (airCraft.isPriority()) {
            setAllAmmoAmount(airCraft.refill(allAmmoAmount));
          }
          setAllAmmoAmount(airCraft.refill(allAmmoAmount));
        }
      } else {
        for (AirCraft airCraft : carrier) {
          setAllAmmoAmount(airCraft.refill(allAmmoAmount));
        }
      }
    }
  }

  public void fight(Carrier carrier) {
    int damageMade = 0;
    for (AirCraft airCraft : this.getCarrier()) {
      damageMade = damageMade + airCraft.fight();
    }
    carrier.setHealthPoint(carrier.getHealthPoint() - damageMade);
    for (AirCraft airCraft : this.carrier) {
      airCraft.setCurrentAmmo(0);
    }
  }

  public void getStatus() {
    int totalDamage = 0;
    for (AirCraft airCraft : this.getCarrier()) {
      totalDamage = totalDamage + airCraft.getBaseDamage() * airCraft.getCurrentAmmo();
    }
    System.out.println("HP: " + getHealthPoint() + ", Aircraft count: " + this.getCarrier().size() + ", Ammo Storage: " +
    getAllAmmoAmount() + ", Total damage: " + totalDamage);
    System.out.println("Aircrafts: ");
    for (AirCraft airCraft : this.getCarrier()) {
      System.out.println(airCraft.getStatus());
    }
    System.out.println();
  }
}
