public class Ex08CompareLength {
  public static void main(String[] args) {
    // - Create an array variable named `p1`
    //   with the following content: `[1, 2, 3]`
    // - Create an array variable named `p2`
    //   with the following content: `[4, 5]`
    // - Print if `p2` has more elements than `p1`

    int[] p1 = {1, 2, 3};
    int[] p2 = {4, 5};

    compareLength(p1, p2);
  }
  public static void compareLength(int[] p1, int[] p2){
    if (p2.length == p1.length){
      System.out.println("P2 has the same size, than P1!");
    } else if (p2.length < p1.length) {
      System.out.println("P1 is bigger, than P2!");
    } else {
      System.out.println("P2 is bigger, than P1!");
    }
  }
}
