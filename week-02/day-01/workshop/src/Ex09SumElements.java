public class Ex09SumElements {
  public static void main(String[] args) {
    // - Create an array variable named `r`
    //   with the following content: `[54, 23, 66, 12]`
    // - Print the sum of the second and the third element
    int[] r = {54, 23, 66, 12};
    System.out.println("Summary of the second and the third element: " + sumElements(r));

  }
  public static int sumElements (int[] r) {
    int summary = r[1] + r[3];
    return summary;
  }

}
