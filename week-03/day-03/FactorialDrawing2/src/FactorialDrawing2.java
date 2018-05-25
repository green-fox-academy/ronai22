import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FactorialDrawing2 {

  public static void mainDraw(Graphics graphics){
    int sideLength = 300;

    int addNumber = (int)((Math.sqrt(3) * sideLength) / 2);
    //sideLength / 2
    //sideLength - addNumber

    int hex1X = sideLength / 2;
    int hex1Y = sideLength - addNumber;

    int hex2X = sideLength / 2 + 3 * sideLength / 4;
    int hex2Y = sideLength - addNumber / 2;

    int hex3X = sideLength / 2;
    int hex3Y = sideLength;

    int n = 4;
    int[] coordinateX = {0, sideLength / 2, 3*sideLength/2, 2*sideLength, 3*sideLength/2, sideLength/2};
    int[] coordinateY = {300, 300 - addNumber, 300 - addNumber, 300, 300 + addNumber, 300 + addNumber};
    graphics.drawPolygon(coordinateX, coordinateY, 6);
    drawHexagon(n, sideLength, graphics);

  }

  private static void drawHexagon(int n, int sideLength, Graphics graphics) {
    if (n == 0) {
    } else {
      int addNumber = (int)((Math.sqrt(3) * sideLength) / 2);

      int[] coordinateX = {150, 150 + sideLength / 2, 150 + sideLength / 2 + sideLength / 4, 150 + sideLength / 2, 150, 150 - sideLength / 4};
      int[] coordinateY = {300 - addNumber, 300 - addNumber, 300 - addNumber / 2, 300, 300, 300 - addNumber / 2};

      int[] coordinateX2 = {0, sideLength / 2, 3*sideLength/2, 2*sideLength, 3*sideLength/2, sideLength/2};
      int[] coordinateY2 = {300, 300 - addNumber, 300 - addNumber, 300, 300 + addNumber, 300 + addNumber};

      int[] coordinateX3 = {0, sideLength / 2, 3*sideLength/2, 2*sideLength, 3*sideLength/2, sideLength/2};
      int[] coordinateY3 = {300, 300 - addNumber, 300 - addNumber, 300, 300 + addNumber, 300 + addNumber};

      graphics.drawPolygon(coordinateX, coordinateY, 6);
      drawHexagon(n - 1, sideLength / 2, graphics);

      graphics.drawPolygon(coordinateX2, coordinateY2, 6);
      drawHexagon(n - 1, sideLength / 2, graphics);

      graphics.drawPolygon(coordinateX3, coordinateY3, 6);
      drawHexagon(n -1 , sideLength / 2,  graphics);

   }
 }


  //    Don't touch the code below
  static int WIDTH = 600;
  static int HEIGHT = 600;

  public static void main(String[] args) {
    JFrame jFrame = new JFrame("Drawing");
    jFrame.setSize(new Dimension(WIDTH, HEIGHT + 23));
    jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    jFrame.add(new ImagePanel());
    jFrame.setLocationRelativeTo(null);
    jFrame.setVisible(true);
  }
  static class ImagePanel extends JPanel{
    @Override
    protected void paintComponent(Graphics graphics) {
      super.paintComponent(graphics);
      mainDraw(graphics);
    }
  }
}
