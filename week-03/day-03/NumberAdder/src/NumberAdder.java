public class NumberAdder {
  public static void main(String[] args) {

    int limit = 10;
    int sumNumberAdder = numberAdder(limit);
    System.out.println(sumNumberAdder);
  }

  private static int numberAdder(int limit) {
    if (limit == 1) {
      return 1;
    } else {
      return limit + numberAdder(limit - 1);
    }
  }
}
