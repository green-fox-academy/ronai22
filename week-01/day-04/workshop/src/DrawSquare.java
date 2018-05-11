public class DrawSquare {
    public static void main(String[] args) {

        int squareNum = 6;

        for (int i = 0; i < squareNum; i++) {
            if (i % (squareNum - 1) == 0) {
                for (int j = 0; j <= (squareNum - 1) ; j++) {
                    System.out.print("%");
                }
                System.out.println();

            } else {
                for (int k = 0; k <= squareNum ; k++) {
                    if ( k % (squareNum - 1) == 0) {
                        System.out.print("%");
                    } else {
                        System.out.print(" ");
                    }
                } System.out.println();
            }
        }

    }
}
