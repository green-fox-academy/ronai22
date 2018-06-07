public class Animal {

  private String name;
  private boolean healthy;
  private int healCost;

  public Animal() {
    setHealthy(false);
  }


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public boolean isHealthy() {
    return healthy;
  }

  public void setHealthy(boolean healthy) {
    this.healthy = healthy;
  }

  public int getHealCost() {
    return healCost;
  }

  public void setHealCost(int healCost) {
    this.healCost = healCost;
  }

  public void heal() {
    setHealthy(true);
  }

  public boolean isAdoptable() {
    return isHealthy();
  }

  @Override
  public String toString() {
    if (isHealthy()) {
      return getName() + " is healthy, and adoptable";
    } else {
      return getName() + " is not healthy (" + getHealCost() + "€), and not adoptable";
    }
  }
}
