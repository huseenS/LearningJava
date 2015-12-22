
// Include the libraries necessary for graphics
import java.awt.*;
import java.awt.image.*;
import javax.swing.*;
import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;



// Create a subclass of JComponent
// This will allow us to draw graphics
class Photoshopper extends JComponent {

    BufferedImage img;
    int width = 0;
    int height = 0;

    public void loadImage(String filename) {
        img = null;
        try {
            img = ImageIO.read(new File(filename));
            width = img.getWidth();
            height = img.getHeight();
        } catch (IOException e) {
            System.out.println("Could not read image! " + filename);
        }
    }

    public int getImageWidth() {
        return width;
    }

    public int getImageHeight() {
        return height;
    }


    /*
        Write in your functions just below this comment.
    */
        public static int converToBWPixelAverage(int r, int g, int b) {
            return (r+g+b)/3;
        }
        public static int convertoBWPixelRed (int r, int g, int b) {
            return r;
        }
        public static int convertoBWPixelGReen(int r, int g, int b) {
            return g;
        }
        public static int convertoBWPixeBlue(int r, int g, int b) {
            return b;
        }
        public static int convertoBWPixelInterpolated( int r, int g, int b, double weightR, double weightG, double weightB) {
            int newPixelRGB = (int)((r * weightR) + (g * weightG) + (b * weightB));
            return newPixelRGB;
        }
        public static int convertoBWPixelMax(int r, int g, int b) {
            int maxRGB = (Math.max(r, Math.max(g,b)));
            return maxRGB;
        }
         public static int convertoBWPixelMin(int r, int g, int b) {
            int minRGB = (Math.min(r, Math.min(g,b)));
            return minRGB;
        }
        public static int convertoBWPixelDesaturation(int r, int g, int b) {
            int desRGB = ((Math.max(r, Math.max(g,b))) + (Math.min(r, Math.min(g,b))))/2;
            return desRGB;
        }






    // Your function definitions should be above this line! :P

    public void convertToBW() {
        BufferedImage newImage = new BufferedImage(img.getWidth(), img.getHeight(), BufferedImage.TYPE_BYTE_GRAY);
        for (int i = 0; i < img.getWidth(); i++) {
            for (int j = 0; j < img.getHeight(); j++) {
                int rgb = img.getRGB(i, j);
                Color c = new Color(rgb);
                int r = c.getRed();
                int g = c.getGreen();
                int b = c.getBlue();

                // r, g, and b are integer pixel values that you need to convert to a grayscale value
                //
                //
                // new_pixel should get the value calculated by your function
                // Update the next line to call one of your functions
                int new_pixel =converToBWPixelAverage(r,g,b);
                //
                //

                // Leave this part alone.  :)
                Color new_c = new Color(c.getAlpha(), new_pixel, new_pixel, new_pixel);
                int new_int = new_c.getRGB();
                newImage.setRGB(i, j, new_int);
            }
        }
        img = newImage;
    }
	
    // This special method is automatically called when the scene needs to be drawn.
    public void paintComponent(Graphics g) {
        g.drawImage(img, 0, 0, null);
    }
	
    public static void main(String[] args) {

        Photoshopper my_photoshopper = new Photoshopper();
        my_photoshopper.loadImage(args[0]);
        my_photoshopper.convertToBW();

        JFrame frame = new JFrame();

        // Set the size of the window
        frame.add(my_photoshopper);

        // Set the title of the window
        frame.setTitle("Photoshopper: " + args[0]);
        frame.setSize(my_photoshopper.getImageWidth(), my_photoshopper.getImageHeight());
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}