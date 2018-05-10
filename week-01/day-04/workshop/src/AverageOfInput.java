import java.util.Scanner;

public class AverageOfInput {
    public static void main(String[] args) {

    // Write a program that asks for 5 integers in a row
    // then it should print the sum and the average of these numbers like:
    //
    // Sum: 22, Average: 4.4

        Scanner scanner = new Scanner(System.in);
        System.out.println("Which year did you born?");
        int birthYear = scanner.nextInt();
        System.out.println("Whats your favorite number");
        int favNum = scanner.nextInt();
        System.out.println("What is the speed limit in Budapest usually?");
        int speedLimit = scanner.nextInt();
        System.out.println("How old are you?");
        int age = scanner.nextInt();
        System.out.println("Whats the best note, you can get on an exam?");
        int bestNote = scanner.nextInt();

        int allSum = birthYear + favNum + speedLimit + age + bestNote;

        int average = allSum / 5;

        System.out.println("Sum: " + allSum + ", Average: " + average);


    }

}
