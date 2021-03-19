package hW1;

import java.io.*;
//import java.util.*;
/*
 * FileIO finished.Can you check if there is any error?
 */

public class FileIO {
     
	public static InventoryBag<Item> readInventory(){
		
		BufferedReader inputStream;
		InventoryBag<Item> inventoryBag = new InventoryBag<>();
		
		try {
			
			
			inputStream = new BufferedReader(new FileReader(System.getProperty("user.dir")+"\\inventory.txt"));//finding the inventory file from working directory
			
			while(true) {
				String fileLine = inputStream.readLine();
				
				if(fileLine != null) {
					String[] line_tokens = fileLine.split(",");
					String item_name = line_tokens[0];
					String item_compartment = line_tokens[1];
					int item_weight = Integer.parseInt(line_tokens[2]);
					Item item = new Item(item_name,item_compartment,item_weight);
					
					inventoryBag.add(item);}
				
				
				else {
					break;
					}
				}
			
			inputStream.close();
			}
		
		
		catch(FileNotFoundException e)
		{
			System.out.println("Error occurs when open the file inventory.txt "
								+ e.getMessage());
			System.exit(0);
		}
		catch(IOException e)
		{
			System.out.println("Error reading from file");
			System.exit(0);
		}
		
		
		return inventoryBag;
		
	}

}
