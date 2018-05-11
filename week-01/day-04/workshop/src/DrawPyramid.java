public class DrawPyramid {
    public static void main(String[] args) {
        //((pyrLines - (j - 1)) <= i && i >= (pyrLines + (j - 1)))
        int pyrLines = 3;
        for (int j = 1; j <= pyrLines ; j++) {
            for (int i = 1; i <= (pyrLines + (pyrLines - 1)) ; i++) {
                if (((pyrLines - j) < i) && (i < (pyrLines + j)))  {
                    System.out.print("*");
                } else System.out.print(" ");
            }
            System.out.println();
        }
    }
}
