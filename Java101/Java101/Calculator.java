 //calc with user input


import java.util.Scanner;

import javax.swing.JOptionPane;
 public class Calculator {

	public static void main(String[] args) {
		//using a scanner
		//Scanner myScanner = new Scanner(System.in);

		//double hourlyPay = myScanner.nextDouble();
 	//double hourlyPay = 17.50;
		//using a JOption window
		String prompt = "Enter your hourly pay";
		String hourlyPayString = JOptionPane.showInputDialog(prompt);
		double hourlyPay = Double.parseDouble(hourlyPayString);
		

 	int weeks = 12;
 	int days = weeks * 5;
 	int hours = days * 22;
 	double totalPay = hourlyPay * hours;

 	//System.out.println("Your total pay is:" + totalPay );
 	JOptionPane.showMessageDialog(null, "Total Pay is!" + totalPay);
 	
 	}

 }
