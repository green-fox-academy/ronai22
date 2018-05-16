import java.util.Scanner;

public class Ex01DivideByZero {
  public static void main(String[] args) {
    // Create a function that takes a number
    // divides ten with it,
    // and prints the result.
    // It should print "fail" if the parameter is 0
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please type in a number, I am going to divide 10 with it.");
    int divisor = scanner.nextInt();
    int result = 0;
    divider(divisor, result);
  }
  public static int divider (int divisor, int result) {
    try {
      result = 10 / divisor;
      System.out.println(result);
    } catch (ArithmeticException e) {
      System.out.println("Can't divide by zero!");
    } return result;
  }
}
