public class Bunny1 {
  public static void main(String[] args) {

    System.out.println(bunnyEarCounter(100));
  }

  private static int bunnyEarCounter(int bunnyNumber) {
    int bunnyEars = 2;
    if (bunnyNumber == 1) {
      return bunnyEars;
    } else {
      return bunnyEars + bunnyEarCounter(bunnyNumber - 1);
    }
  }
}


