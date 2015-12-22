
public class IQ {

	public static void main(String[] args) {
   String userResponse = JOptionPane.showInputDialog("What is your IQ?");
  
   
   if (userResponse.equals("hello")) {
      JOptionPane.showMessageDialog("You're a Genius!");
    }
      else {
         System.out.println("Sorry, Not a genius!");
         }
   }
   
}
