import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Ex12FunctionToCenter {
  public static void mainDraw(Graphics graphics) {
    // Create a line drawing function that takes 2 parameters:
    // The x and y coordinates of the line's starting point
    // and draws a line from that point to the center of the canvas.
    // Fill the canvas with lines from the edges, every 20 px, to the center.
    int startCoordinateX = 23;
    int startCoordinateY = 45;
    drawLinesToCenter(graphics);
    drawOneLineToCenter(startCoordinateX, startCoordinateY,graphics);

  }

  private static void drawOneLineToCenter(int startCoordinateX, int startCoordinateY, Graphics graphics) {
    graphics.setColor(Color.RED);
    graphics.drawLine(startCoordinateX, startCoordinateY, WIDTH/2, HEIGHT / 2);

  }

  private static void drawLinesToCenter(Graphics graphics) {
      for (int columnStep = 0; columnStep <= 20 ; columnStep++) {
        graphics.drawLine(0, columnStep * 20, WIDTH/2, HEIGHT / 2);
        graphics.drawLine(WIDTH, columnStep * 20, WIDTH/2, HEIGHT / 2);
        graphics.drawLine(columnStep * 20,0, WIDTH/2, HEIGHT / 2);
        graphics.drawLine(columnStep * 20, WIDTH, WIDTH/2, HEIGHT / 2);
      }

  }


  // Don't touch the code below
  static int WIDTH = 400;
  static int HEIGHT = 400;
  public static void main(String[] args) {
    JFrame jFrame = new JFrame("Ex12FunctionToCenter");
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