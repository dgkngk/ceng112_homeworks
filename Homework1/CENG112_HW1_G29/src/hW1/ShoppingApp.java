package hW1;

import java.util.*;


public class ShoppingApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		FileIO io_Object = new FileIO();
		InventoryBag inventoryBag = io_Object.readInventory();
		
		Scanner keyboard = new Scanner(System.in);
		int choice;
		System.out.println("Welcome to The Shopping App!");
		
		
		
		
		while (true) {
			
			System.out.println("Please select an option:\r\n"
					+ "[1]Go to shopping\r\n"
					+ "[2]See the status of the fridge\r\n"
					+ "[3]Exit");
			System.out.println("Your choice:");
			choice = keyboard.nextInt();
			
			if (choice == 1) {
				while(true) {
					System.out.println("Please select an option:\r\n"
							+ "[1]Add an item to the basket\r\n"
							+ "[2]See the basket\r\n"
							+ "[3]Finish shopping");
					choice = keyboard.nextInt();
					if(choice==1) {
						System.out.println("Please select an item:");
						
						continue;
						}
		
					if(choice==2) {
						System.out.println("Basket contains:");
						continue;
					}
					if(choice==3) {break;}
					}
				continue;
			}
			
			
			if (choice == 2) {
				System.out.println("Remaining capacities of each compartments:");
				continue;
			}
			
			if(choice == 3) {break;}
			
			
			
			
		}
		keyboard.close();

	}

}
