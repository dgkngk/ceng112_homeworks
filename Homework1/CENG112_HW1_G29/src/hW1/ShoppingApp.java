package hW1;

import java.util.*;


public class ShoppingApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		FileIO io_Object = new FileIO();
		Item[] inventoryBag = io_Object.readInventory().toArray();
		ShoppingBasket shoppingBasket = new ShoppingBasket();
		Scanner keyboard = new Scanner(System.in);
		int choice;
		int basket_weight=0;
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
					System.out.println("Your choice:");
					choice = keyboard.nextInt();
					if(choice==1) {
						System.out.println("Please select an item:");
						for(int i=0; i<inventoryBag.length;i++) {
							
							System.out.println("[" + (i+1) + "]" + inventoryBag[i].getName());
							}
						System.out.println("Your choice:");
						int item_index = keyboard.nextInt();
						Item item = inventoryBag[(item_index)-1];
						
						if(basket_weight < shoppingBasket.MAX_SIZE) {
							shoppingBasket.add(item);
							System.out.println(item.getName() + " is added to the basket");
							basket_weight += item.getWeight();
							if(basket_weight < shoppingBasket.MAX_SIZE) {
								continue;
							}
							else {
								System.out.println("Basket is full now\r\n"
										+"You cannot add any more items to the basket\r\n");
								/*burada basket i�indeki arraylerin compartman�na ula��p ona g�re transfer 
								 * yapmam�z ve basketi bo�atmam�z gerekiyor. Ancak �u an  basket 
								 * i�indeki �r�nleri elde etmemizi sa�layan bir method yok.
								 * Ben ��yle d���nd�m interface i�ine birde toArray ekleyip to array ile b�t�n implement eden 
								 * classlarda bir array d�n���m� sa�lay�p bagler i�indeki itemlere o �ekilde rahatl�kla ula�abiliriz.
								 * 
								 * Sence? b�yle mi yapal�m yoksa  eldeki methodlarla ula�abilece�imiz bir yol var m�?
								 * 
								 */
								break;}
							}
						else {
							
							System.out.println("Basket is full now\r\n"
									+"You cannot add any more items to the basket\r\n");
							break;}
						}
		
					if(choice==2) {
						for(int i=0; i<shoppingBasket.getItemCount();i++) {
							System.out.println("Basket contains:"+shoppingBasket); //burada display kullan�lmal� san�r�m
							}
						
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
