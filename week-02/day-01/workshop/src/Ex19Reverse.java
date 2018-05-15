import java.util.Arrays;

public class Ex19Reverse {
  public static void main(String[] args) {
    // - Create an array variable named `aj`
    //   with the following content: `[3, 4, 5, 6, 7]`
    // - Reverse the order of the elements in `aj`
    // - Print the elements of the reversed `aj`
    int[] aj = {3, 4, 5, 6, 7};
    // int[] temp = {3, 4, 5, 6, 7};
    int[] temp = aj;


    for (int i = 0; i < aj.length ; i++) {
      aj[i] = temp[(aj.length - 1) - i];
    } System.out.println(Arrays.toString(aj));
  }
}
