public class Sharpie {
  String color;
  double width;
  int inkAmount;

  public Sharpie(String color, double width) {
    this.color = color;
    this.width = width;
    this.inkAmount = 100;
  }

  public void use() {
    this.inkAmount--;
  }

  public static void main(String[] args) {

    SharpieSet sharpieSet = new SharpieSet();
    Sharpie sharpie1 = new Sharpie("Red", 0.5);
    Sharpie sharpie2 = new Sharpie("Green", 0.7);
    Sharpie sharpie3 = new Sharpie("Black", 1);
    Sharpie sharpie4 = new Sharpie("Blue", 1.5);

    sharpieSet.sharpies.add(sharpie1);
    sharpieSet.sharpies.add(sharpie2);
    sharpieSet.sharpies.add(sharpie3);
    sharpieSet.sharpies.add(sharpie4);

    for (int i = 0; i <100 ; i++) {
      sharpieSet.sharpies.get(2).use();
    }

    for (int i = 0; i <30 ; i++) {
      sharpieSet.sharpies.get(1).use();
    }

    sharpieSet.removeTrash();

    System.out.println(sharpieSet.countUsable());

  }

  @Override
  public String toString() {
    return "Color: " + this.color + ", " + "Width: " + this.width + ", " + "Ink Amount: " + this.inkAmount;
  }
}
