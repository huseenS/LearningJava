package vectors;

import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.JOptionPane;


public class VectorDrawer extends JComponent{
	
    public void paintComponent(Graphics g) {

        //decalre two new vectors
        Vector vector1 = new Vector(150,250);
        Vector vector2 = new Vector(100,100);
        Vector vector3 = vector1.add(vector2);
        //Vector vector4 = vector1.subtract(vector2);

        // Example line
        g.setColor(Color.BLUE);
        //g.drawLine(0, 0, 50, 100);
        g.drawLine(0, 800, vector1.getX(), 800 - vector1.getY());
        g.drawLine(vector1.getX(), 800 - vector1.getY(), vector1.getX() + vector2.getX(), 800 - vector1.getY() - vector2.getY());

        g.setColor(Color.RED);
        g.drawLine(0, 800, vector3.getX(), 800 - vector3.getY());

        //g.setColor(Color.GREEN);
        //g.drawLine(250,300, vector4.getX(), vector4.getY());

    }
	
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(800, 800);
        frame.setTitle("Vectors!");

        VectorDrawer drawer = new VectorDrawer();

        frame.add(drawer);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
