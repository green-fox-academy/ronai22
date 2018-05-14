public class Ex16AppendA {
  public static void main(String[] args) {
    // - Create an array variable named `animals`
    //   with the following content: `["kuty", "macsk", "cic"]`
    // - Add all elements an `"a"` at the end
    String[] animals = {"kuty", "macsk", "cic"};

    appendA(animals);

  } public static void appendA (String[] animals){
    int until = animals.length;
    for (int i = 0; i < until ; i++) {
      animals[i] = animals[i] + "a";
      System.out.println(animals[i]);
    }
  }
}
