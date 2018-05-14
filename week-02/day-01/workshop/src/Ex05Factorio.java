public class Ex05Factorio {
  public static void main(String[] args) {

    //  Create the usual class wrapper
    //  and main method on your own.

    // - Create a function called `factorio`
    //   that returns it's input's factorial
    int inputNum = 5;
    int factorial = 0;
    factorial = factorio(inputNum);
    System.out.println(factorial);

  }
  public static int factorio (int inputNum) {
    int factorNum = inputNum;
    for (int i = inputNum - 1; i > 0 ; i--) {
      factorNum = factorNum * i;
    }
    return factorNum;
  }
}
