public class SumDigit {
  public static void main(String[] args) {

    int number = 1829;
    int sumNumberDigit = numberDigitSum(number);
    System.out.println(sumNumberDigit);


  }

  private static int numberDigitSum(int number) {
    if (number == 0) {
      return 0;
    } else
      return (number % 10) + numberDigitSum(number / 10);
  }
}
