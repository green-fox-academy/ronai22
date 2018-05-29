public class AirCraft {

  private int currentAmmo;
  private int maxAmmo;
  private int baseDamage;
  private String type;
  private boolean priority;

  public int getCurrentAmmo() {
    return currentAmmo;
  }

  public void setCurrentAmmo(int currentAmmo) {
    this.currentAmmo = currentAmmo;
  }

  public int getMaxAmmo() {
    return maxAmmo;
  }

  public void setMaxAmmo(int maxAmmo) {
    this.maxAmmo = maxAmmo;
  }

  public int getBaseDamage() {
    return baseDamage;
  }

  public void setBaseDamage(int baseDamage) {
    this.baseDamage = baseDamage;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public boolean isPriority() {
    return priority;
  }

  public void setPriority(boolean priority) {
    this.priority = priority;
  }

  public int refill(int allAmmoAmount) {
    if (maxAmmo > allAmmoAmount) {
      currentAmmo = allAmmoAmount;
    } else {
      currentAmmo = maxAmmo;
    }
    return allAmmoAmount - currentAmmo;
  }

  public int fight() {
    int damage = this.currentAmmo * this.baseDamage;
    this.currentAmmo = 0;
    return damage;
  }

  public String getStatus() {
    return "Type" + type + ", Ammo: " + currentAmmo + ", Base Damage: " + baseDamage + ", All Damage: "
            + currentAmmo * baseDamage;
  }

}
