//drawing a checkerboard
// print one square
//print one row of squares (8 squares) via loop and anchor
// print mulitiple rows via another loop inside the first loop


import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.JOptionPane;


public class Checkerboard extends JComponent{
    
    public static final int WINDOW_WIDTH = 800;
    public static final int WINDOW_HEIGHT = 800;
    public static final int EMPTY = 0;
    public static final int RED = 1;
    public static final int BLACK = 2;


    public void paintComponent(Graphics g) {
        int numberSquares = 8;

        int[][] boardState = new int[numberSquares][numberSquares];

        boardState[3][4] = RED;
        boardState[3][3] = BLACK;
        boardState[4][4] = RED;
        boardState[4][3] = BLACK;

        g.setColor(Color.BLACK);

        int currentWidth = getWidth();
        int currentHeight = getHeight();



        int checkerWidth = currentWidth / numberSquares;
        int checkerHeight = currentHeight / numberSquares;

        for (int y = 0; y <= currentHeight - checkerHeight; y += checkerHeight) {
            for (int x = 0; x <= currentWidth - checkerWidth; x += checkerWidth) {
                int row = y / checkerHeight;
                int col = x / checkerWidth;
                if ((col + row) % 2 == 0) {
                    g.setColor(Color.WHITE);
                }
                else {
                    g.setColor(Color.BLACK);
                } 

                g.fillRect(x, y, checkerWidth, checkerHeight);
    
                // Do we draw a checker?
                if (boardState[row][col] == RED) {
                    g.setColor(Color.RED);
                    g.fillOval(x, y, checkerWidth, checkerHeight);
                }
                else if (boardState[row][col] == BLACK) {
                    g.setColor(Color.BLUE);
                    g.fillOval(x, y, checkerWidth, checkerHeight);
                }


            }  // inner for

        } // outer for



    }
    
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        frame.setTitle("Checkerboard!");

        Checkerboard checkers = new Checkerboard();

        frame.add(checkers);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}