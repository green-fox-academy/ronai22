import java.util.Scanner;
public class LoopExample {

    public static void main(String[] args) {

        // int hungerCounter = 1;
        Scanner userInout = new Scanner(System.in);
        System.out.println("Please give me a number");
        int hungerCounter =userInout.nextInt();

        while (hungerCounter > 0 ) {
            hungerCounter = hungerCounter - 1;
            System.out.println("[" + hungerCounter + "]" + " Éhes vagyok");
        }

        for (int i= 0; i < 10; i++) {

            System.out.print(i + " ");
        }

    }
}
