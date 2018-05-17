import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Ex06CenteredSquare {

  public static void mainDraw(Graphics graphics) {
    // Draw a green 10x10 square to the canvas' center.
    graphics.setColor(Color.GREEN);
    graphics.fillRect((WIDTH / 2) - 10, (HEIGHT / 2) - 10, 10, 10);
  }

  // Don't touch the code below
  static int WIDTH = 600;
  static int HEIGHT = 600;

  public static void main(String[] args) {
    JFrame jFrame = new JFrame("Ex06CenteredSquare");
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
