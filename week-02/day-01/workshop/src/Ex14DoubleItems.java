import java.util.Arrays;

public class Ex14DoubleItems {
  public static void main(String[] args) {
    // - Create an array variable named `numList`
    //   with the following content: `[3, 4, 5, 6, 7]`
    // - Double all the values in the array
    int[] numList = {3, 4, 5, 6, 7};
    System.out.println(Arrays.toString(doubler(numList)));
  }

  public static int[] doubler (int[] numList){
    for (int i = 0; i < numList.length ; i++) {
      numList[i] = numList [i] * numList[i];
    }
    return numList;
  }
}
