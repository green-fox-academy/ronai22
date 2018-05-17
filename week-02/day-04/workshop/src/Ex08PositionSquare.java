import javax.swing.*;

import java.awt.*;
import java.util.Random;
import java.util.Scanner;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Ex08PositionSquare {

  public static void mainDraw(Graphics graphics){
    // create a square drawing function that takes 2 parameters:
    // the x and y coordinates of the square's top left corner
    // and draws a 50x50 square from that point.
    // draw 3 squares with that function.
    // avoid code duplication.
    Scanner scanner = new Scanner(System.in);

    for (int i = 0; i <3 ; i++) {
      System.out.println("Please type in two numbers:");
      int coordinateX = scanner.nextInt();
      int coordinateY = scanner.nextInt();
      drawSquares(coordinateX, coordinateY, graphics);
    }
  }
  public static void drawSquares (int coordinateX, int coordinateY, Graphics graphics) {

    graphics.setColor(Color.GREEN);
    graphics.fillRect(coordinateX, coordinateY, 50, 50);
  }

  //    Don't touch the code below
  static int WIDTH = 600;
  static int HEIGHT = 600;

  public static void main(String[] args) {
    JFrame jFrame = new JFrame("Ex08PositionSquare");
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