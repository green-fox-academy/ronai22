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

    Sharpie sharpie1 = new Sharpie("Red", 0.5);
    Sharpie sharpie2 = new Sharpie("Green", 0.7);
    Sharpie sharpie3 = new Sharpie("Black", 1);
    Sharpie sharpie4 = new Sharpie("Blue", 1.5);


    sharpie1.use();
    sharpie2.use();

    System.out.println(sharpie1);
  }

  @Override
  public String toString() {
    return "Color: " + this.color + ", " + "Width: " + this.width + ", " + "Ink Amount: " + this.inkAmount;
  }
}
