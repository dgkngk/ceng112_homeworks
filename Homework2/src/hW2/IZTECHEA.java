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
		
		WareHouse<IProduct> sofaWarehouse = new WareHouse<IProduct>();
		WareHouse<IProduct> bedWarehouse = new WareHouse<IProduct>();
		WareHouse<IProduct> chairWarehouse = new WareHouse<IProduct>();
		WareHouse<IProduct> dresserWarehouse = new WareHouse<IProduct>();
		WareHouse<IProduct> tableWarehouse = new WareHouse<IProduct>();
		WareHouse<IProduct> bookcaseWarehouse = new WareHouse<IProduct>();
		
		WareHouse<IProduct> warehouse = new WareHouse();
		
		
		
		while(choice != 0) {
			
			IProduct product = null; 
			
		    int user_index = rand.nextInt(users.length);
			
		    if (user_index==0) {
				
				product = (products[rand.nextInt(products.length)]);
				factoryLine.enqueue(product);
				boolean manufactured = product.isManufactured(factoryLine, product);
				if (manufactured == true) {
					System.out.println("\n"+users[user_index]+ " requesting " + product.getName() +", SUCCESS, "+ product.getName()
							+" is manufactured.");
				}
				else {
					System.out.println("\n"+users[user_index]+ " requesting " + product.getName() +", FAIL, "+ product.getName()
							+" is not manufactured.");
				}
				
			}
			
		    else if (user_index==1) {
		    	
		    	if (!(factoryLine.isEmpty())){
		    		IProduct storage_product = factoryLine.dequeue();
		    		
		    		if(storage_product.getClass() == products[0].getClass()) {
		    			sofaWarehouse.push((Sofa) storage_product);
		    			warehouse = sofaWarehouse;
		    		}
		    		else if(storage_product.getClass() == products[1].getClass()) {
		    			bedWarehouse.push((Bed) storage_product);
		    			warehouse = bedWarehouse;
		    		}
		    		else if(storage_product.getClass() == products[2].getClass()) {
		    			chairWarehouse.push((Chair) storage_product);
		    			warehouse = chairWarehouse;
		    		}
		    		else if(storage_product.getClass() == products[3].getClass()) {
		    			dresserWarehouse.push((Dresser) storage_product);
		    			warehouse = dresserWarehouse;
		    		}
		    		else if(storage_product.getClass() == products[4].getClass()) {
		    			tableWarehouse.push((Table) storage_product);
		    			warehouse = tableWarehouse;
		    		}
		    		else if(storage_product.getClass() == products[5].getClass()) {
		    			bookcaseWarehouse.push((Bookcase) storage_product);
		    			warehouse = bookcaseWarehouse;
		    		}
		    		
		    		boolean stored = storage_product.isStored(warehouse,storage_product);
		    		
		    		if (stored == true) {
		    			System.out.println("\n"+users[user_index]+ " storing " + storage_product.getName() +", SUCCESS, "
		    		          + storage_product.getName() +" is stored.");
		    		}
		    		else {
		    			System.out.println("\n"+users[user_index]+ " storing " + storage_product.getName() +", FAIL, "
			    		          + storage_product.getName() +" is not stored.");
		    		}
		    	}
		    	else {
		    		
		    		System.out.println("\nThere is no product in the factory line to store."+ users[user_index]+ " FAIL." );
		    	}
		    }
		    	
				

			else if (user_index == 2) {
				
				product = (products[rand.nextInt(products.length)]);
				
				if(product.getClass() == products[0].getClass()) {
		    		warehouse = sofaWarehouse;
		    	}
		    	else if(product.getClass() == products[1].getClass()) {
		    		warehouse = bedWarehouse;
		    	}
		    	else if(product.getClass() == products[2].getClass()) {
		    		warehouse = chairWarehouse;
		    	}
		    	else if(product.getClass() == products[3].getClass()) {
		    		warehouse = dresserWarehouse;
		    	}
		    	else if(product.getClass() == products[4].getClass()) {
		    		warehouse = tableWarehouse;
		    	}
		    	else if(product.getClass() == products[5].getClass()) {
		    		warehouse = bookcaseWarehouse;
		    	}
		    	
		    	boolean sold = product.isSold(warehouse);
		    	if (sold == true) {
		    		warehouse.pop();
		    		System.out.println("\n"+users[user_index]+ " buying " + product.getName() +", SUCCESS, "
		    		          + users[user_index]+" bought " + product.getName()+".");
					
				}
				else {
					System.out.println("\n"+ users[user_index]+ " buying " + product.getName() +", FAIL, "
		    		           + product.getName()+ " warehouse empty.");
					
				}
		    	
		    }
			
			choice -=1;
			
		}
		
		keyboard.close();
		
	}

}
