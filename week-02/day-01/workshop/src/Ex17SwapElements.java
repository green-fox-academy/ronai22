public class Ex17SwapElements {
  public static void main(String[] args) {
    // - Create an array variable named `abc`
    //   with the following content: `["first", "second", "third"]`
    // - Swap the first and the third element of `abc`
    String[] abc = {"first", "second", "third"};
    String temp = abc[0];

    abc[0] = abc[2];
    abc[2] = temp;

    System.out.println("First Element: " + abc[0]);
    System.out.println("Third Element: " + abc[2]);

  }
}
