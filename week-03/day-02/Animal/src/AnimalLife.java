public class AnimalLife {
  public static void main(String[] args) {

    Animal cow1 = new Animal();
    Animal cow2 = new Animal();
    Animal cow3 = new Animal();
    Animal cow4 = new Animal();
    Animal cow5 = new Animal();

    Farm farm = new Farm();

    farm.animals.add(cow1);
    farm.animals.add(cow2);
    farm.animals.add(cow3);
    farm.animals.add(cow4);
    farm.animals.add(cow5);

    for (int i = 0; i <20 ; i++) {
      cow1.drink();
    }

    for (int i = 0; i <20 ; i++) {
      cow1.eat();
    }

    for (int i = 0; i <20 ; i++) {
      cow2.play();
    }

    for (int i = 0; i <10 ; i++) {
      cow1.play();
    }

    farm.slaughter();
    farm.breed();

    System.out.println();
  }
}
