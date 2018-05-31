package Fibonacci;

public class Fibonacci {

  public int fibonacci(int n) {
    if ( n >= 0 && n < 47) {
      if (n == 0) {
        return 0;
      } else if (n == 1) {
        return 1;
      }
    } else if(n < 0) {
      System.out.println("The input number was negative");
      return 0;
    } else {
      System.out.println("The calculated fibonacci number was bigger then the limit of an integer");
      return 0;
    }
    return fibonacci(n - 1) + fibonacci(n - 2);
  }
}
