import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Circles {

  public static void mainDraw(Graphics graphics){
    int n = 5;
    int width = 300;

    double triangleSide = (300 * 0.86602540378);
    double triangleHeight = triangleSide * (Math.sqrt(3) / 2);

    int startpoint1X = 150;
    int startpoint1Y = 0;

    int startpoint2X = 20;
    int startpoint2Y = (int)triangleHeight;

    int startpoint3X = (int)triangleHeight + 57 ;
    int startpoint3Y = (int)triangleHeight;

    graphics.drawOval(0, 0, 600, 600);
    drawCircle(n, width, startpoint1X, startpoint1Y, startpoint2X, startpoint2Y, startpoint3X, startpoint3Y, graphics);

  }

  private static void drawCircle(int n, int width, int startpoint1X, int startpoint1Y, int startpoint2X, int startpoint2Y, int startpoint3X, int startpoint3Y, Graphics graphics) {
    if (n == 0) {

    } else {

      graphics.drawOval(startpoint1X,   startpoint1Y,  width,  width);
      drawCircle(n - 1, width / 2, startpoint1X + width / 4, startpoint1Y , startpoint2X + width / 20, startpoint2Y + startpoint2Y / 4, startpoint3X + width / 4, startpoint3Y, graphics);
      graphics.drawOval(startpoint2X, startpoint2Y , width, width);
      drawCircle(n - 1, width / 2, startpoint1X + width / 4, startpoint1Y, startpoint2X + width / 20, startpoint2Y + startpoint2Y / 4, startpoint3X + width / 4, startpoint3Y, graphics);
      graphics.drawOval(startpoint3X , startpoint3Y , width, width);
      drawCircle(n - 1, width / 2, startpoint1X + width / 4, startpoint1Y, startpoint2X + width / 20, startpoint2Y + startpoint2Y / 4, startpoint3X + width / 4, startpoint3Y, graphics);

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
