import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Circles {

  public static void mainDraw(Graphics graphics){
    int n = 5;
    int startpointX = 0;
    int startpointY = 0;
    //drawCircle(n, WIDTH, startpointX, startpointY, graphics);



    graphics.drawOval(0, 0, 600, 600);
    graphics.drawOval(150, 0, 300, 300);
    graphics.drawOval(, 300 , 300, 300);

  }

  private static void drawCircle(int n, int width, int startpointX, int startpointY, Graphics graphics) {
    if (n == 0) {

    } else {

      graphics.drawOval(200, 200, 100, 100);
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
