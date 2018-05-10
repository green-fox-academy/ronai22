public class Swap {
    public static void main(String[] args) {
        // Swap the values of the variables
        int a = 123;
        int b = 526;

        int temp = b * a;

        a = temp / a;

        b = temp / b;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}