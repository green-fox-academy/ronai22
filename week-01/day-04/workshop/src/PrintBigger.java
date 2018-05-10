import java.util.Scanner;

public class PrintBigger {
    public static void main(String[] args) {
        // Write a program that asks for two numbers and prints the bigger one

        Scanner scanner = new Scanner(System.in);

        System.out.println("Type in one number");
        int input1 = scanner.nextInt();
        System.out.println("Type in an other number");
        int input2 = scanner.nextInt();

        if (input1 == input2) {
            System.out.println("The numbers are equal");
        } else if (input1 > input2) {
            System.out.println("The bigger number is " + input1);
        } else {
            System.out.println("The bigger number is " + input2);
        }
    }
}
