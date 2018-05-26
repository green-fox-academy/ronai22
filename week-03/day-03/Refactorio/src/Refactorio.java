public class Refactorio {
  public static void main(String[] args) {
    int n = 6;
    System.out.println(refactorio(n));
  }

  private static int refactorio(int n) {
    if (n == 0){
      return 1;
    }
    return n * refactorio(n - 1);
  }
}
