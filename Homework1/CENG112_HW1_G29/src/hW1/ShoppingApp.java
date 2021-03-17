package hW1;

import java.util.*;


public class ShoppingApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Welcome to The Shopping App!");
		
		
		while (true) {
			
			System.out.println("Please select an option:\r\n"
					+ "[1]Go to shopping\r\n"
					+ "[2]See the status of the fridge\r\n"
					+ "[3]Exit");
			System.out.println("Your choice:");
			int choice = keyboard.nextInt();
			
			if (choice == 1) { }
			
			if (choice == 2) { }
			
			if(choice == 3) {
				break;
			}
			
			
			
			
		}
		keyboard.close();

	}

}
