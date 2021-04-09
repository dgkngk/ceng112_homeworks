package hW2;
import java.util.*;

public class IZTECHEA {
	
	public static void printReport(FactoryLine<IProduct> queue, IProduct[] products, int queuetype) {
		int sofa = 0,bed = 0,chair = 0,dresser = 0,table = 0,bookcase = 0;
		
		System.out.println("REPORT:\n");
		
		while(!queue.isEmpty()) {
			IProduct product = null;
			try {
				product = queue.dequeue();
			} catch (EmptyQueueException e) {
				// do nothing
				
			}
			if(product.getClass() == products[0].getClass()) {
    			sofa++;
			}
			else if(product.getClass() == products[1].getClass()) {
    			bed++;
			}
			else if(product.getClass() == products[2].getClass()) {
    			chair++;
			}
			else if(product.getClass() == products[3].getClass()) {
    			dresser++;
			}
			else if(product.getClass() == products[4].getClass()) {
    			table++;
			}
			else if(product.getClass() == products[5].getClass()) {
    			bookcase++;
			}
		}
		if (queuetype == 0) {
			System.out.println("Amount of sofa sold:" + sofa);
			System.out.println("Amount of bed sold:" + bed);
			System.out.println("Amount of chair sold:" + chair);
			System.out.println("Amount of dresser sold:" + dresser);
			System.out.println("Amount of table sold:" + table);
			System.out.println("Amount of bookcase sold:" + bookcase);
		}
		else {
			System.out.println("Amount of sofa in FactoryLine:" + sofa);
			System.out.println("Amount of bed in FactoryLine:" + bed);
			System.out.println("Amount of chair in FactoryLine:" + chair);
			System.out.println("Amount of dresser in FactoryLine:" + dresser);
			System.out.println("Amount of table in FactoryLine:" + table);
			System.out.println("Amount of bookcase in FactoryLine:" + bookcase);
		}
	}
	
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
		FactoryLine<IProduct> soldThings = new FactoryLine<IProduct>();
		WareHouse<IProduct> warehouse = new WareHouse<IProduct>();//copying warehouse for controlling
		WareHouse<IProduct> sofaWarehouse = new WareHouse<IProduct>();
		WareHouse<IProduct> bedWarehouse = new WareHouse<IProduct>();
		WareHouse<IProduct> chairWarehouse = new WareHouse<IProduct>();
		WareHouse<IProduct> dresserWarehouse = new WareHouse<IProduct>();
		WareHouse<IProduct> tableWarehouse = new WareHouse<IProduct>();
		WareHouse<IProduct> bookcaseWarehouse = new WareHouse<IProduct>();

		
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
		    		IProduct storage_product = null;
					try {
						storage_product = factoryLine.dequeue();
					} catch (EmptyQueueException e) {
						// do nothing
						
					}
		    		
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
				
				IProduct b_product = (products[rand.nextInt(products.length)]);
				boolean sold = false;
		    	if(b_product.getClass() == products[0].getClass()) {
		    		try {
			    		soldThings.enqueue(sofaWarehouse.pop());
			    		sold = b_product.isSold(soldThings,b_product);
		    		}
		    		catch(EmptyStackException e)
		    		{
		    			sold = false;
		    		}
		    	}
		    	else if(b_product.getClass() == products[1].getClass()) {
		    		try {
		    		
		    			soldThings.enqueue(bedWarehouse.pop());
		    			sold = b_product.isSold(soldThings,b_product);
		    		}
		    		catch(EmptyStackException e)
		    		{
		    			sold = false;
		    		}
		    	}
		    	else if(b_product.getClass() == products[2].getClass()) {
		    		try {
		    			soldThings.enqueue(chairWarehouse.pop());
		    			sold = b_product.isSold(soldThings,b_product);
		    		}
		    		catch(EmptyStackException e)
		    		{
		    			sold = false;
		    		}
		    	}
		    	else if(b_product.getClass() == products[3].getClass()) {
		    		try {
		    			soldThings.enqueue(dresserWarehouse.pop());
		    			sold = b_product.isSold(soldThings,b_product);
		    		}
		    		catch(EmptyStackException e)
		    		{
		    			sold = false;
		    		}
		    	}
		    	else if(b_product.getClass() == products[4].getClass()) {
		    		try{
		    			soldThings.enqueue(tableWarehouse.pop());
		    			sold = b_product.isSold(soldThings,b_product);
		    		}
		    		catch(EmptyStackException e)
		    		{
		    			sold = false;
		    		}
		    	}
		    	else if(b_product.getClass() == products[5].getClass()) {
		    		try {
		    			soldThings.enqueue(bookcaseWarehouse.pop());
		    			sold = b_product.isSold(soldThings,b_product);
		    		}
		    		catch(EmptyStackException e)
		    		{
		    			sold = false;
		    		}
		    		
		    	}
		    	else {
		    		sold = false;
		    	}
		    	
		    	
		    	if (sold == true) {
		    		System.out.println("\n"+users[user_index]+ " buying " + b_product.getName() +", SUCCESS, "
		    		          + users[user_index]+" bought " + b_product.getName()+".");
					
				}
				else {
					System.out.println("\n"+ users[user_index]+ " buying " + b_product.getName() +", FAIL, "
		    		           + b_product.getName()+ " warehouse empty.");
					
				}
		    	
		    }
			
			choice -=1;
			
		}
		printReport(factoryLine,products,1);
		System.out.println("\nAmount of sofa in Warehouse:" + sofaWarehouse.getSize());
		System.out.println("Amount of bed in Warehouse:" + bedWarehouse.getSize());
		System.out.println("Amount of chair in Warehouse:" + chairWarehouse.getSize());
		System.out.println("Amount of dresser in Warehouse:" + dresserWarehouse.getSize());
		System.out.println("Amount of table in Warehouse:" + tableWarehouse.getSize());
		System.out.println("Amount of bookcase in Warehouse:" + bookcaseWarehouse.getSize()+"\n");
		printReport(soldThings,products,0);
		
		keyboard.close();
		
	}

}
