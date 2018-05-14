public class Ex04Sum {
  public static void main(String[] args) {

  //  Create the usual class wrapper
  //  and main method on your own.

  // - Write a function called `sum` that sum all the numbers
  //   until the given parameter and returns with an integer
    int until = 5;
    int sum = 0;
    sum = summary(until);
    System.out.println(sum);

  }
  public static int summary (int until) {
    int sum = 1;
    for (int i = 2; i <= until ; i++) {
      sum = sum + i;
    } return sum;
  }
}
