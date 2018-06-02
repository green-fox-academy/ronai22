import java.util.ArrayList;
import java.util.Arrays;

public class SymmetricMatrix {

  public static void main(String[] args) {

    ArrayList<ArrayList<Integer>> symmetricMatrix = new ArrayList<ArrayList<Integer>>();

    symmetricMatrix.add(new ArrayList<Integer> (Arrays.asList(1, 0, 1, 1)));
    symmetricMatrix.add(new ArrayList<Integer> (Arrays.asList(0, 2, 2, 1)));
    symmetricMatrix.add(new ArrayList<Integer> (Arrays.asList(1, 2, 5, 1)));
    symmetricMatrix.add(new ArrayList<Integer> (Arrays.asList(1, 1, 1, 1)));
    int n = symmetricMatrix.size();

    System.out.println(isSymmetric(symmetricMatrix, n));
  }

  public static boolean isSymmetric(ArrayList<ArrayList<Integer>> symmetricMatrix, int n) {
    if (n == 1) {
      return true;
    } else {
      for (int i = 0; i < n; i++) {
        if (symmetricMatrix.get(i).get(n - 1) != symmetricMatrix.get(n - 1).get(i) ) {
          return false;
        }
      }
    } return isSymmetric(symmetricMatrix, n-1);
  }
}