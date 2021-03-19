package hW1;

//silinecek 


public class deneme {

	public static  void main(String[] args) {
		
		//FileIO io_Object = new FileIO();
		Item[] items = FileIO.readInventory().toArray();
		Item newItem = new Item("potato",items[1].getCompartment(),items[1].getWeight());
		System.out.println(items[1]);
		System.out.println(System.getProperty("user.dir"));
		
		System.out.println(newItem.equals(items[1]));
		Item tmp = items[1];
		
		items [1] = null;
		
		System.out.println(tmp.getName());
		

}
}
