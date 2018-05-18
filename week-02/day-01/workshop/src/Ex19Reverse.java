import java.util.Arrays;

public class Ex19Reverse {
  public static void main(String[] args) {

    int[] aj = {3, 4, 5, 6, 7};
    int[] temp = Arrays.copyOf(aj, aj.length);
    for (int i = 0; i < aj.length ; i++) {
      aj[i] = temp[(aj.length - 1) - i];
    } System.out.println(Arrays.toString(aj));
  }
}
