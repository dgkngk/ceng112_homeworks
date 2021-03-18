package hW1;

//silinecek 


public class deneme {

	public static  void main(String[] args) {
		
		FileIO io_Object = new FileIO();
		Item[] items = io_Object.readInventory().toArray();
		System.out.println(items[1]);
		
		/*
		for(int i=0; i<inventoryBag.toArray().length; i++) {
				
			System.out.println(inventoryBag.toArray()[i]);
				}
			
		
		

	}*/

}
}
