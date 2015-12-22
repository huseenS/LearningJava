package pokemon101;
// Include the libraries necessary for graphics
import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;

// Create a subclass of JComponent
// This will allow us to draw graphics
public class Tree extends JComponent{
	
    // This method will actually do the drawing
    // You'll need to update this method to draw your tree
    // Remember that this should be done recursively,
    // so you'll have to have paintTree call itself at some point
    // You'll also need to include a check to make sure your program
    // doesn't go into infinite recursion.
    // This method will almost surely need more input parameters...
    public void paintTree(Graphics g){
	    // Draw a line using the current color
	    // Line extends from point (50, 50) to point (150, 150)
	    // Remember: y-coordinates start at 0 at the TOP of the screen, so 
	    // this line goes down and to the right
	    g.drawLine(50, 50, 150, 150);
    }
	
    // This special method is automatically called when displaying the component.
    // This method only needs to contain the initial call to your paintTree method.
    // Remember: if you update the input parameter requirements for paintTree, then
    // you'll also have to update this initial method call.
    public void paintComponent(Graphics g) {
	    paintTree(g);
    }
	
    public static void main(String[] args) {
	    // Graphics window size
	    int WINDOW_WIDTH = 640;
	    int WINDOW_HEIGHT = 480;
	
	    JFrame frame = new JFrame();

	    // Set the size of the window
	    frame.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
	
	    // Set the title of the window
	    frame.setTitle("My Beautiful Recursive Tree!");
		
	    // Make a new Drawing, add it to the window, and make it visible
	    Tree rt = new Tree();
	    frame.add(rt);
	    frame.setVisible(true);
    }
}