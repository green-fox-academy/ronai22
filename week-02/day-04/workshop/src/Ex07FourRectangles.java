import javax.swing.*;

import java.awt.*;
import java.util.Random;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Ex07FourRectangles {

  public static void mainDraw(Graphics graphics){
    // draw four different size and color rectangles.
    // avoid code duplication.
    for (int i = 0; i <4 ; i++) {
      rectangleDrawer(graphics);
    }

  }
  public static void rectangleDrawer (Graphics graphics) {
    Random random = new Random();
    graphics.setColor(new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256)));
    graphics.fillRect(random.nextInt(300), random.nextInt(300), random.nextInt(300), random.nextInt(300));
  }

  //    Don't touch the code below
  static int WIDTH = 600;
  static int HEIGHT = 600;
  public static void main(String[] args) {
    JFrame jFrame = new JFrame("Ex07FourRectangles");
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