public class Ex06PrintParams {
  public static void main(String[] args) {
    //  Create the usual class wrapper
    //  and main method on your own.

    // - Create a function called `printParams`
    //   which prints the input String parameters
    // - It can have any number of parameters

    // Examples
     printParams("first");
     printParams("first", "second");
     printParams("first", "second", "third", "fourh");
    // ...


  }
  public static void printParams (String... params){
    for (String param : params) {
      System.out.println(param);
    }
  }
}
