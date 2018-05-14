public class DrawPyramid {
    public static void main(String[] args) {
        int pyrLines = 5;
        for (int rowIndex = 1; rowIndex <= pyrLines ; rowIndex++) {
            for (int columnIndex = 1; columnIndex <= (pyrLines + (pyrLines - 1)) ; columnIndex++) {
                if (((pyrLines - rowIndex) < columnIndex) && (columnIndex < (pyrLines + rowIndex)))  {
                    System.out.print("*");
                } else System.out.print(" ");
            }
            System.out.println();
        }
    }
}
