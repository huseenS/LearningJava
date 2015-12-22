package JavaLearn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class keychains1 {
	private static BufferedReader input;
	private static int totalKeychains;
	private static int add = 0; private static int remove = 0;
	private static int pricePerKeychain = 10; 
	
	public static void main(String[] args) {
		System.out.println("Ye Old Keychain Shoppe");
		System.out.println("\n1.) Add keychains to order");
		System.out.println("2.) Remove Keychains from order" );
		System.out.println("3.) View current order");
		System.out.println("4.) Checkout");
		try {
			input = new BufferedReader(
					new InputStreamReader(System.in, StandardCharsets.UTF_8));
			boolean isCheckOuted = false;
			
			while(!isCheckOuted) {
				int choice;
				System.out.println("\n Please enter your choice: ");
				choice = Integer.parseInt(input.readLine());
				totalKeychains();
				switch (choice) {
				case 1:
					addKeychains(add);
					break;
				case 2:
					removeKeychains(remove);
					break;
				case 3:
					viewCurrentOrder(pricePerKeychain, totalKeychains);
					break;
				case 4: 
					checkOut(pricePerKeychain, totalKeychains);
					isCheckOuted = true;
					break;
				default:
					break;
				}
			}
		} catch (IOException e) {
			System.err.println(e);
		} finally {
			try {
				input.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
	public static int addKeychains(int toAdd) {
		try {
			System.out.println("How many to Add?");
			add = Integer.parseInt(input.readLine());
			if (add >= 0) {
				totalKeychains += add;
				System.out.println("You now have " + totalKeychains + " keychains");
			}
			else {
				System.out.println("Error enter positve number");
			}
			
		} catch (NumberFormatException | IOException e1) {
			e1.printStackTrace();  
		}
		return totalKeychains;
	}
	public static int removeKeychains(int toRemove) {
		try {
			System.out.println("How many to remove");
			remove = Integer.parseInt(input.readLine());
		
			if (remove <= totalKeychains) {
				totalKeychains -= remove;
				System.out.println("You now have " + totalKeychains + " keychains");
			} else {
				System.out.println("error can not remove more keychains than you have");
			}
		} catch (NumberFormatException | IOException e) {
			e.printStackTrace();
		}
		return totalKeychains;
	}
	public static void totalKeychains() {
		System.out.println("\nYou have " + totalKeychains + " keychains");
	} 
	public static void viewCurrentOrder(int priceperKeychain, int totalKeyChains) {
		int totalCost = totalKeychains * pricePerKeychain;
		System.out.println("keychains cost " + pricePerKeychain + " each");
		System.out.println("total cost is " + totalCost + ".");
	}
	public static void checkOut(int _pricePerKeychain, int totalKeychains) {
		System.out.println("What is your name?");
		try {
			String name = input.readLine();
			int totalCost = totalKeychains * pricePerKeychain;
			System.out.println("keychains cost " + pricePerKeychain + " each");
			System.out.println("total cost is " + totalCost + ".");
			System.out.println("Thank you for your order " + name);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("");
		System.exit(0);
	}

}
