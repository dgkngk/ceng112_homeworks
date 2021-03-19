package hW1;

public class InventoryBag<T> {

	private T[] BagArr;
	private int number_entries;
	
	@SuppressWarnings("unchecked")
	public InventoryBag() {
		BagArr = (T[]) new Item[20]; //Initialise the bag array as fixed size as of now
	    number_entries=0;
	}

	//@Override
	public boolean add(T newItem) { 
		
		boolean add_result=true;
		
		if(isFull()) {
			add_result=false;
		}
		else {
			BagArr[number_entries] = newItem;
			number_entries++;		
		}
		return add_result;
		
	}

	//@Override
	public boolean isEmpty() {  
		boolean is_empty = false;
		
		if (number_entries==0) {
			is_empty=true;
			return is_empty;
		}
		return(is_empty);
	}

	//@Override
	public boolean isFull() {
		boolean is_full = false;
		
		if (number_entries>=BagArr.length) {
			is_full=true;
			return is_full;
		}
		return(is_full);
	}
	
	@SuppressWarnings("unchecked")
	public T[] toArray() {
		
		T[] result = (T[]) new Item[number_entries];
		for (int i=0; i<number_entries; i++) {
			result[i]=BagArr[i];
		}
		return result;
	}

}