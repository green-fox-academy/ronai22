public class Power {
  public static void main(String[] args) {

    int number = 10;
    int n = 3;
    System.out.println(powerN(number, n));
  }

  private static int powerN(int number, int n) {
    if (n == 0) {
      return 1;
    } else {
      return number * powerN(number, n-1);
    }
  }
}
