import javax.swing.*;

import java.awt.*;
import java.util.Scanner;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Ex09CenterBoxFunction {

  public static void mainDraw(Graphics graphics){
    // create a square drawing function that takes 1 parameter:
    // the square size
    // and draws a square of that size to the center of the canvas.
    // draw 3 squares with that function.
    // avoid code duplication.
    Scanner scanner = new Scanner(System.in);

    for (int i = 0; i <3 ; i++) {
      System.out.println("Please type in the size of the square (max 300 px): ");
      int squareSize = scanner.nextInt();
      centeredSquareDrawer(squareSize, graphics);
  }

  }
  public static void centeredSquareDrawer (int squareSize, Graphics graphics) {
    graphics.setColor(new Color(0,255,0,50));
    graphics.fillRect(WIDTH / 2 - squareSize, WIDTH / 2 -squareSize, squareSize, squareSize);
  }

  //    Don't touch the code below
  static int WIDTH = 600;
  static int HEIGHT = 600;

  public static void main(String[] args) {
    JFrame jFrame = new JFrame("Ex09CenterBoxFunction");
    jFrame.setSize(new Dimension(WIDTH, HEIGHT));
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