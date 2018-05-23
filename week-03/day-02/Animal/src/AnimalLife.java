public class AnimalLife {
  public static void main(String[] args) {
    Animal tiger = new Animal();

    for (int i = 0; i <20 ; i++) {
      tiger.drink();
    }

    for (int i = 0; i <20 ; i++) {
      tiger.eat();
    }

    tiger.play();

    System.out.println(tiger);
  }
}
