package hW1;

import java.io.*;
import java.util.*;


public class FileIO {
     
	public static InventoryBag<Item> readInventory(){
		
		BufferedReader inputStream;
		InventoryBag<> inventoryBag = new InventoryBag;
		
		try {
			
			
			inputStream = new BufferedReader(new FileReader("CENG112_HW1_G29\\inventory.txt"));
			
			while(true) {
				String fileLine = inputStream.readLine();
				String[] line_tokens = fileLine.split(",");
				String item_name = line_tokens[0];
				String item_compartment = line_tokens[1];
				int item_weight = Integer.parseInt(line_tokens[2]);
				Item item = new Item(item_name,item_compartment,item_weight);
				
				
				
				if(fileLine != null) {
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
		
		
		return
		
	}

}
