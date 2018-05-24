public class Bunny2 {
  public static void main(String[] args) {

    System.out.println(bunnyEarCounter(4));
  }

  private static int bunnyEarCounter(int bunnyNumber) {
    int bunnyEars = 2;
    if (bunnyNumber == 1) {
      return bunnyEars;
    } else {
      if (bunnyNumber % 2 == 0) {
        return bunnyEars + 1 + bunnyEarCounter(bunnyNumber - 1);
      } else {
        return bunnyEars + bunnyEarCounter(bunnyNumber - 1);
      }
    }
  }
}
