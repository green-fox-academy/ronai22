public class Bunny1V2 {
  public static void main(String[] args) {

    int bunnyNumber = 100;
    int bunnyEars = 0;

    System.out.println(bunnyEarCounter(bunnyNumber, bunnyEars));
  }

  private static int bunnyEarCounter(int bunnyNumber, int bunnyEars) {
    if (bunnyNumber == 0) {
      return bunnyEars;
    } else {
      return bunnyEarCounter(bunnyNumber - 1, bunnyEars + 2);
    }
  }
}


