public class DrawChessTable {
    public static void main(String[] args) {
        int tableSize = 8;

        for (int rowChess = 0; rowChess < tableSize ; rowChess++) {
            for (int columnChess = 0; columnChess < tableSize ; columnChess++) {
                if ((columnChess + rowChess) % 2 == 0 ) {
                    System.out.print("%");
                } else {
                    System.out.print(" ");
                }
            } System.out.println();
        }

    }
}
