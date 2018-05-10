import java.util.Scanner;

public class MileToKmConverter {
    public static void main(String[] args) {
        // Write a program that asks for an integer that is a distance in kilometers,
        // then it converts that value to miles and prints it
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type in a distance in kilometers, and I will convert it to miles: ");

        int inputKm = scanner.nextInt();

        inputKm *= 0.621371192;

        System.out.println("That is around " + inputKm + " miles.");


    }
}