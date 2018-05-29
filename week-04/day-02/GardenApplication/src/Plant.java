public class Plant {

  protected String color;
  protected String family;
  protected double waterIndex;
  protected int waterNeed;
  protected double waterAbsorb;

  public void needsWater() {
    if (this.waterIndex < waterNeed) {
      System.out.println("The " + this.color + " " + this.family + " needs water.");
    } else {
      System.out.println("The " + this.color + " " + this.family + " doesn't need water.");
    }
  }

  public void watering(int watering) {
    this.waterIndex = this.waterIndex + waterAbsorb * watering;
  }
}
