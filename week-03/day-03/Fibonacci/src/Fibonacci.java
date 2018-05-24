public class Fibonacci {
  public static void main(String[] args) {
    int n = 6;
    System.out.println(fibonacci(n));
  }

  private static int fibonacci(int n) {
    if (n == 0) {
      return 0;
    } else if (n == 1) {
      return 1;
    }
    return fibonacci(n - 1) + fibonacci(n - 2);
  }
}
