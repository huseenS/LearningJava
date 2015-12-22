//Start your animation program with this program skeleton. You will need to add you code into the block of code under "public void playAnimation() {".

//In particular, you will need to add in a for loop that will control the actual running of your animation.
// Think of each iteration of the for loop as the change of the animation from one frame to the next. That is, the ith time through the for loop will display the ith frame in the animation.

//To change the position of where the ball will be drawn, you'll need to change the ball's position variables: 
//ballX and ballY. These are already declared for you, so you can just use them without declaring them yourself.

//You will also need to think about the animation timing. 
//If you simply run the for loop as fast as possible, then the animation will be much too fast to see. Instead make use of the pause method to make the animation play back at an appropriate speed.

//What happens when the ball reaches the edge of the screen? It would be nice if it would bounce, right? To detect a bounce you'll need to use an if statement.
// How can you change the direction of the ball after it bounces? 
//Maybe you'll need to define a variable that holds the current direction the ball is moving and then that variable will have its value changed after a bounce. 



// Include the libraries necessary for graphics
import java.awt.*;
import java.awt.image.*;
import javax.swing.*;


class Animation extends JComponent {

    // Instance variables that define the current characteristics
    // of your animated object.
    int ballX = 50;
    int ballY = 0;

    final int BALL_SIZE = 52;


    // This special method is automatically called when the scene needs to be drawn.
    public void paintComponent(Graphics g) {
       
        // Clear the background to white
        g.setColor(Color.WHITE);
        g.fillRect(0, 0, 800, 600);


        // Draw the ball at the current ballX, ballY position
        //g.setColor(Color.ORANGE);  // Orange like a basketball?
            int red = (int)(Math.random() * 245);
            int green = (int)(Math.random() * 255);
            int blue = (int)(Math.random() * 255);
        g.setColor(new Color(red, green, blue));  
        g.fillRect(ballX, ballY, BALL_SIZE, BALL_SIZE);

    }


    // Pause the program for ms milliseconds so the animation doesn't go too fast
    public void pause(int x) {
        try {
            Thread.sleep(x);
        }
        catch (InterruptedException ie) {
            System.out.println("Error occurred!");
        }
    }

    public void playAnimation() {

        // Put in your animation loopcode here!!!!!!!!!!!!!!!!

          // Inside the loop you should do 4 things:
        //     - Update the ball position variables (ballX and ballY)
        //     - Check the new position to see if a bounce occurs
        //     - Use repaint() to draw the ball in the new location
        //     - Use pause(x) to pause the program's execution for x milliseconds (you should fill in a value for x)

        // Each iteration through the loop is like showing one frame of the animation
        // How many times do you want to go through the loop?
        //int ballLocation = (ballX + ballY);
        int ballDirectionX = 5;
        int ballDirectionY = 5; 
        //int ballColor = 5;
        //int frames = 10;

        for (int i = 0; i<2000; i++) {
            ballX += ballDirectionX;
            ballY += ballDirectionY;
                repaint();
                pause(41);

            if ((ballY >= 550) 
                || (ballY <= 0)) {                  
              ballDirectionY = -ballDirectionY;
                
            }

            if ((ballX >= 750)
                || (ballX <= 0))  {
                ballDirectionX = -ballDirectionX;
                
            }

            //if (frames % 10) {
                //g.setColor(new Color(red, green, blue));
            //}

            
           

        }
            
       
    }
	

    public static void main(String[] args) {

        Animation my_animation = new Animation();
        JFrame frame = new JFrame();

        // Set the size of the window
        frame.add(my_animation);

        // Set the title of the window
        frame.setTitle("My Animation");
        frame.setSize(800, 600);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Launch your animation!
        my_animation.playAnimation();
    }
}



