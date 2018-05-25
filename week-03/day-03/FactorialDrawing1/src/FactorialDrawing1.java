import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FactorialDrawing1 {

  public static void mainDraw(Graphics graphics){
    int smallestSquare = WIDTH;
    drawSquare(smallestSquare, graphics);

  }

  private static void drawSquare(int smallestSquare, Graphics graphics) {
    if (smallestSquare < 10) {
    } else {
      graphics.drawRect(smallestSquare/3, 0, smallestSquare/3, smallestSquare/3);

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
