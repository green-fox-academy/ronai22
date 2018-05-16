import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Ex13Calculator {
  public static void main(String... args) {
    // Create a simple calculator application which reads the parameters from the prompt
    // and prints the result to the prompt.
    // It should support the following operations,
    // create a method named "calculate()":
    // +, -, *, /, % and it should support two operands.
    // The format of the expressions must be: {operation} {operand} {operand}.
    // Examples: "+ 3 3" (the result will be 6) or "* 4 4" (the result will be 16)

    // You can use the Scanner class
    // It should work like this:

    // Start the program
    // It prints: "Please type in the expression:"
    // Waits for the user input
    // Print the result to the prompt
    // Exit
    Scanner scanner = new Scanner(System.in);


    System.out.println("Please type in the expression:");
    String input = scanner.nextLine();


    char operation;
    int numberOne;
    int numberTwo;
    operation = input.charAt(0);
    String[] items = input.split(" ", 3);
    numberOne = Integer.valueOf(items[1]);
    numberTwo = Integer.valueOf(items[2]);

    System.out.println(calculator(numberOne, numberTwo, operation));

  }
  public static int calculator (int numberOne, int numberTwo, char operation){
    int sum = 0;
    if (operation == '+') {
      sum = numberOne + numberTwo;
    } else if (operation == '-') {
      sum = numberOne - numberTwo;
    } else if (operation == '*') {
      sum = numberOne * numberTwo;
    } else if (operation == '/') {
      sum = numberOne / numberTwo;
    } else if (operation == '%') {
      sum = numberOne % numberTwo;
    } else {
      System.out.println("Wrong input!");
    }
    return sum;
  }
}