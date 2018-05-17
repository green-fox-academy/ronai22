import javax.swing.*;

import java.awt.*;
import java.util.Scanner;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Ex04GoToCenter {
  public static void mainDraw(Graphics graphics) {
    // Create a line drawing function that takes 2 parameters:
    // The x and y coordinates of the line's starting point
    // and draws a line from that point to the center of the canvas.
    // Draw 3 lines with that function. Use loop for that.
    drawLinesToTheCenter(graphics);

  }
  public static void drawLinesToTheCenter (Graphics graphics) {
    Scanner scanner = new Scanner(System.in);

    for (int i = 0; i < 3 ; i++) {
      System.out.println("Please type in two numbers between 0 and 600:");
      int inputCoordinateX = scanner.nextInt();
      int inputCoordinateY = scanner.nextInt();
      graphics.setColor(Color.RED);
      graphics.drawLine(inputCoordinateX, inputCoordinateY, WIDTH / 2, HEIGHT / 2);
    }

  }


  // Don't touch the code below
  static int WIDTH = 600;
  static int HEIGHT = 600;

  public static void main(String[] args) {
    JFrame jFrame = new JFrame("Drawing");
    jFrame.setSize(new Dimension(WIDTH, HEIGHT));
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
