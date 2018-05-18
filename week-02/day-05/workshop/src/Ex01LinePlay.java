import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Ex01LinePlay {
  public static void mainDraw(Graphics graphics) {
    int steps = 20;
    patternDrawer(steps, graphics);
  }

  private static void patternDrawer(int steps, Graphics graphics) {
    for (int i = 0; i < WIDTH / steps ; i++) {
      graphics.setColor(Color.GREEN);
      graphics.drawLine(0 + i * steps, 0, WIDTH, 0 + i * steps);
      graphics.setColor(Color.MAGENTA);
      graphics.drawLine(0, 0 + i * steps, 0 + i * steps, WIDTH);
    }
  }

  // Don't touch the code below
  static int WIDTH = 400;
  static int HEIGHT = 400;

  public static void main(String[] args) {
    JFrame jFrame = new JFrame("Ex01LinePlay");
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