import javax.swing.*;

import java.awt.*;
import java.util.Random;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Ex01LinePlay {
  public static void mainDraw(Graphics graphics) {
    int stepsSize = 20;
    patternDrawer(stepsSize, graphics);
  }

  private static void patternDrawer(int stepSize, Graphics graphics) {
    for (int i = 0; i < WIDTH / stepSize ; i++) {
      lineDrawer(i, stepSize, graphics);
    }
  }

  private static void lineDrawer(int i, int stepSize, Graphics graphics) {
    Random random = new Random();
    graphics.setColor(new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256)));
    graphics.drawLine(i * stepSize, 0, HEIGHT, i * stepSize);
    graphics.setColor(new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256)));
    graphics.drawLine(0,i * stepSize, i * stepSize, WIDTH);
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