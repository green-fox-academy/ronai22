public class Counter {
  
  public static void main(String[] args) {

    int n = 100;
    countDownFromN(n);
  }

  private static int countDownFromN(int limit) {
    if (limit == 0) {
      return 0;
    } else  {
      System.out.println(limit);
      return countDownFromN(limit -1);
    }
  }
}
