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
      maxAmmo = maxAmmo + airCraft.getBaseDamage();
    }
    if (allAmmoAmount == 0) {
      System.out.println("Ammo is out of stock, this carrier is fucked");
    } else {
      if (allAmmoAmount < maxAmmo) {
        for (AirCraft airCraft : carrier) {
          if (airCraft.isPriority()) {
            airCraft.refill(allAmmoAmount);
          }
          airCraft.refill(allAmmoAmount);
        }
      } else {
        for (AirCraft airCraft : carrier) {
          airCraft.refill(allAmmoAmount);
        }
      }
    }
  }

  public void fight(Carrier carrier) {
    int damageMade = 0;
    for (AirCraft airCraft : (List<AirCraft>)carrier ) {
      airCraft.setCurrentAmmo(0);
    }
    for (AirCraft airCraft : this.carrier) {
      damageMade = damageMade + airCraft.getCurrentAmmo() * airCraft.getBaseDamage();
      carrier.healthPoint = carrier.healthPoint - damageMade;
    }
  }

  public void getStatus(Carrier carrier) {
    int totalDamage = 0;
    for (AirCraft airCraft : (List<AirCraft>)carrier) {
      totalDamage = totalDamage + airCraft.getCurrentAmmo() * airCraft.getBaseDamage();
    }
    System.out.println("HP: " + carrier.healthPoint + ", Aircraft count: " + carrier.getCarrier().size() + ", Ammo Storage: " +
    carrier.allAmmoAmount + ", Total damage: ");
    System.out.println("Aircrafts: ");
    for (AirCraft airCraft : (List<AirCraft>)carrier) {
      airCraft.getStatus();
    }
  }
}
