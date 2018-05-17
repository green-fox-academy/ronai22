import javax.swing.*;

import java.awt.*;
import java.util.Random;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Ex10RainbowBoxFunction {
  public static void mainDraw(Graphics graphics) {
    // Create a square drawing function that takes 2 parameters:
    // The square size, and the fill color,
    // and draws a square of that size and color to the center of the canvas.
    // Create a loop that fills the canvas with rainbow colored squares.

    Random random = new Random();
    // int squareSizeStart = random.nextInt(200);
    // rainbowSquares(squareSizeStart, graphics);

    int rainbowSquaresFillSize = 10;
    rainbowSquaresFill (rainbowSquaresFillSize, graphics);

  }

  private static void rainbowSquaresFill(int rainbowSquaresFillSize, Graphics graphics) {
    Random random = new Random();
    for (int rowIndex = 0; rowIndex < WIDTH / rainbowSquaresFillSize ; rowIndex++) {
      for (int columnIndex = 0; columnIndex < WIDTH / rainbowSquaresFillSize ; columnIndex++) {
        graphics.setColor(new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256)));
        graphics.fillRect(
                rowIndex * rainbowSquaresFillSize ,
                columnIndex * rainbowSquaresFillSize,
                rainbowSquaresFillSize,
                rainbowSquaresFillSize
        );
      }
    }
  }

  private static void rainbowSquares(int squareSizeStart, Graphics graphics) {
    Random random = new Random();
    for (int i = 0; i < WIDTH / 2 - squareSizeStart / 2 ; i++) {
      graphics.setColor(new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256)));
      graphics.drawRect(
              WIDTH/2 - squareSizeStart/2 - i,
              HEIGHT/2 - squareSizeStart/2 - i,
              squareSizeStart + 2*i,
              squareSizeStart + 2*i
      );
    }
  }


  // Don't touch the code below
  static int WIDTH = 600;
  static int HEIGHT = 600;

  public static void main(String[] args) {
    JFrame jFrame = new JFrame("Ex10RainbowBoxFunction");
    jFrame.setSize(new Dimension(WIDTH, HEIGHT + 23));
    jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    jFrame.add(new ImagePanel());
    jFrame.setLocationRelativeTo(null);
    jFrame.setVisible(true);
  }

  static class ImagePanel extends JPanel {
    @Override
    protected void paintComponent(Graphics graphics) {
      super.paintComponent(graphics);
      mainDraw(graphics);
    }
  }
}
