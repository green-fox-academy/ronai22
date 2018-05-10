import java.util.Scanner;

public class AnimalsAndLegs {
    public static void main(String[] args) {
        // Write a program that asks for two integers
        // The first represents the number of chickens the farmer has
        // The second represents the number of pigs owned by the farmer
        // It should print how many legs all the animals have

        Scanner scanner = new Scanner(System.in);
        System.out.println("How many chickens do you have on your farm? Please type in the number: ");
        int chickenNum = scanner.nextInt();
        System.out.println("How many pigs do you have on your farm? Please type in this number too: ");
        int pigNum = scanner.nextInt();

        int legsAll = 2 * chickenNum + 4 * pigNum;

        System.out.println("You need " + legsAll + " shoes for your animals");



    }
}