import java.util.Scanner;

public class CountFromTo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Create a program that asks for two numbers
        // If the second number is not bigger than the first one it should print:
        // "The second number should be bigger"
        //
        // If it is bigger it should count from the first number to the second by one
        //
        // example:
        //
        // first number: 3, second number: 6, should print:
        //
        // 3
        // 4
        // 5
        System.out.println("Please type in a number: ");
        int firstNum = scanner.nextInt();
        System.out.println("Please type in a second number: ");
        int secondNum = scanner.nextInt();

        if (secondNum < firstNum) {
            System.out.println("Please type in a bigger number then the " + firstNum);
        } else {
            for (int i = firstNum; i < secondNum ; i++) {
                System.out.println(i);
            }
        }

    }
}
