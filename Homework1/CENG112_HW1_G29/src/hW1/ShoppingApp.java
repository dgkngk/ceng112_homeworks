package hW1;

import java.util.*;


public class ShoppingApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		FileIO io_Object = new FileIO();
		Item[] inventoryBag = io_Object.readInventory().toArray();
		
		ShoppingBasket shoppingBasket = new ShoppingBasket();
		
		VegetablesFruitsCompartment vf_Bag = new VegetablesFruitsCompartment();
		BevaragesCompartment b_Bag = new BevaragesCompartment();
		MeatsCompartment m_Bag = new MeatsCompartment();
		SnacksCompartment s_Bag = new SnacksCompartment();
		
		
		Scanner keyboard = new Scanner(System.in);
		int choice;
		
		
		
		// fridge is empty:
		int vf_weight = 0 ; 
		int m_weight = 0 ; 
		int b_weight = 0 ; 
		int s_weight = 0; 
		
	
		
		
		System.out.println("Welcome to The Shopping App!");
		
		
		
		
		while (true) {
			
			//basket is empty:
			int basket_weight= 0 ;
			
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
						shoppingBasket.add(item);
						System.out.println(item.getName() + " is added to the basket");
						basket_weight += item.getWeight();
						if(basket_weight < shoppingBasket.MAX_SIZE) {
							continue;
						}
						else {
							System.out.println("Basket is full now\r\n"
									+"You cannot add any more items to the basket\r\n"
									+"Shopping is finished and going to fill the fridge\r\n");
							choice=3;
						}
						
						}
		
					if(choice==2) {
						for(int i=0; i<shoppingBasket.getItemCount();i++) {
							System.out.println("Basket contains:"+shoppingBasket); //burada display kullanýlmalý sanýrým
							}
						
						continue;
					}
					if(choice==3) {
						while(shoppingBasket.getItemCount() != 0) {
							Item basket_item = (Item) shoppingBasket.remove();
							System.out.println(basket_item.getCompartment());
							String compartment_of_item = basket_item.getCompartment();
						 
						     if (compartment_of_item.equals("vegetables and fruits")) {
						    	 if(vf_weight < vf_Bag.MAX_SIZE) {
						    		 shoppingBasket.transferTo(vf_Bag, basket_item);
						    		 vf_weight += basket_item.getWeight();
						    	 }
						    	 else {
						    		 System.out.println(basket_item.getName() + " cannot be added to the fridge");
						    		 
						    		 
						    	 }
						    }
						
						    else if (compartment_of_item.equals("meats")) {
						    	if(m_weight < m_Bag.MAX_SIZE) {
						    		shoppingBasket.transferTo(m_Bag, basket_item);
						    		m_weight += basket_item.getWeight();
						    	}
						    	else {
						    		System.out.println(basket_item.getName() + " cannot be added to the fridge");
						    		 
						    		
						    	}
						    }
						    else if (compartment_of_item.equals("beverages")) {
						    	if(b_weight < b_Bag.MAX_SIZE) {
						    		shoppingBasket.transferTo(b_Bag, basket_item);
						    		b_weight += basket_item.getWeight();
						    	}
						    	else {
						    		System.out.println(basket_item.getName() + " cannot be added to the fridge");
						    		
						    		
						    	}
						    }
						    else if (compartment_of_item.equals("snacks")) {
						    	if(s_weight < s_Bag.MAX_SIZE) {
						    		shoppingBasket.transferTo(s_Bag, basket_item);
						    		s_weight += basket_item.getWeight();
						    	}
						    	else {
						    		System.out.println(basket_item.getName() + " cannot be added to the fridge");
						    		
						    		
						    	}
						    }
						}
						break;
						}
					}
				continue;
			}
			
			
			if (choice == 2) {
				System.out.println("Remaining capacities of each compartments:");
				continue;
			}
			
			if(choice == 3) {
				break;
			}
			
			
			
			
		}
		keyboard.close();

	}

}
