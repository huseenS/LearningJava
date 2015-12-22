


import javax.swing.JOptionPane;
 public class Latin {

	public static void main(String[] args) {

String prompt = "Enter your word";
String Word = JOptionPane.showInputDialog(prompt);

//int numbersOfLetters = Word.length();
char firstLetter = Word.charAt(0);
String noFirst = Word.substring(1);



JOptionPane.showMessageDialog(null, "Pig Latin word is! " + noFirst + firstLetter + "ay");

	}
}