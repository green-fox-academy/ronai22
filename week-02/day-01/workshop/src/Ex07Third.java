public class Ex07Third {
  public static void main(String[] args) {

    // - Create an array variable named `q`
    //   with the following content: `[4, 5, 6, 7]`
    // - Print the third element of `q`
    int[] q = {4, 5, 6, 7};
    int third = chooseNum(q);
    System.out.println(third);

  }
  public static int chooseNum (int[] q){
    int third = q[2];
    return third;
    }
}
