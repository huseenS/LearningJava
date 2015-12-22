


import javax.swing.JOptionPane;
 public class Military {

	public static void main(String[] args) {
   //Splitting this up into basically two problems
   //Prompt box one and Prompt box 2

String prompt1 = "Enter your first military time";   
String word1 = JOptionPane.showInputDialog(prompt1);
String hours = word1.substring(0, 2);
String minutes = word1.substring(2, 4);
int hours1 = Integer.parseInt(hours);
int minutes1 = Integer.parseInt(minutes); 
int totalHours1 = hours1 *60;
int totalMinutes1 = minutes1;
int totalTimeinMinutes1 = totalHours1 + totalMinutes1;


//This makes it so that Whatever word they entered is defined as a prompt
//Then split into 2 seperate strings of hours which is the first 2 characters, and minutes which is the last 2 characters
//Afterword I make whatever the new hours string is an integer and the minutes string into an integer



//exact same steps for the second military time, except that:
// string hours2 becomes an integer hours22 and string minutes2 becomes integer minutes22

String prompt2 = "Enter your second military time";
String word2 = JOptionPane.showInputDialog(prompt2);
String hours2 = word2.substring(0, 2);
String minutes2 = word2.substring(2, 4);
int hours22 = Integer.parseInt(hours2);
int minutes22 = Integer.parseInt(minutes2);
int totalHours22 = hours22 * 60;
int totalMinutes22 = minutes22 ;
int totalTimeinMinutes22 = totalHours22 + totalMinutes22;

//Now Total hours for both totalHours1 and totalHours22 are in minutes
//Now Total minutes for both totalMinutes1 and totalMinutes22 are in straight minutes...no change but nicer
//Now new integer for the Final Total Time for Input Prompt 1 and Prompt2 = totalTimeinMinutes1 and totalTimeinMinutes2

int FinaltotalTime = totalTimeinMinutes22 - totalTimeinMinutes1;
//This is the Final Answer in terms of minutes

int FinaltotalHours = FinaltotalTime/60;
int FinaltotalMinutes = FinaltotalTime%60;
//this gives us the Final hours as a whole number
//this gives us the Final minutes as the modulo remainder in minutes






JOptionPane.showMessageDialog(null, "Your time is " + FinaltotalHours + " and " + FinaltotalMinutes);

	}
}

