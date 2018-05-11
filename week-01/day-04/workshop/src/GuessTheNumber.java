import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numSet = 8;
        System.out.println("I am thinking on a number, type in your guess: ");
        int guessNum = scanner.nextInt();
        while (guessNum != numSet) {
        if (guessNum < numSet) {
            System.out.println("The stried number is higher");
            System.out.println("Guess again: ");
            guessNum = scanner.nextInt();
        } else {
            System.out.println("The stried number is lower");
            System.out.println("Guess again: ");
            guessNum = scanner.nextInt();
        }
        }
        System.out.println("You found the number: " + guessNum);
    }
}
