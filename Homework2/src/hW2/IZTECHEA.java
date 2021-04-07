package hW2;


import java.util.*;

public class IZTECHEA {

	public static void main(String[] args) {
		
		Random rand = new Random();
		Scanner keyboard = new Scanner(System.in);
		int choice;
		
		System.out.println("Enter the number of random request cycles:");
		choice = keyboard.nextInt();
		
		String[] users = {"Marketing Analyst","Storage Chief", "Customer"};
		
		Sofa sofa = new Sofa();
		Bed bed = new Bed();
		Chair chair = new Chair();
		Dresser dresser = new Dresser();
		Table table = new Table();
		Bookcase bookcase = new Bookcase();
		
		IProduct[] products = {sofa, bed, chair, dresser, table, bookcase};
		
		FactoryLine<IProduct> factoryLine = new FactoryLine<IProduct>();
		
		WareHouse<Sofa> sofaWarehouse = new WareHouse<Sofa>();
		WareHouse<Bed> bedWarehouse = new WareHouse<Bed>();
		WareHouse<Chair> chairWarehouse = new WareHouse<Chair>();
		WareHouse<Dresser> dresserWarehouse = new WareHouse<Dresser>();
		WareHouse<Table> tableWarehouse = new WareHouse<Table>();
		WareHouse<Bookcase> bookcaseWarehouse = new WareHouse<Bookcase>();
		
		
		
		while(choice != 0) {
			
			IProduct product = null; 
			
		    int user_index = rand.nextInt(users.length);
			
		    if (user_index==0) {
				
				product = (products[rand.nextInt(products.length)]);
				factoryLine.enqueue(product);
				boolean manufactured = product.isManufactured();
				if (manufactured == true) {
					System.out.println("%s requesting %s, SUCCESS, %s manufactured" + users[user_index] + product + product);
				}
				else {
					System.out.println("%s requesting %s, FAIL, %s is not manufactured" + users[user_index] + product + product);
				}
				
			}
			
		    else if (user_index==1) {
		    	
		    	String storage_product = factoryLine.dequeue();	
		    	switch(storage_product) {
		    	     case "Sofa":
		    	    	 sofaWarehouse.push(Sofa);
		    		
		    	
		    	}
		    	
				
			} 
			else if (user_index==2) {
				
				product = (products[rand.nextInt(products.length)]);
				
			}
			
			
			
			
			
			choice -=1;
			
			
			
		}
		
		
		
		
		keyboard.close();
		
		

	}

}
