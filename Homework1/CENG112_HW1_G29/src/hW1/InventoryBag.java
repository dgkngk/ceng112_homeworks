package hW1;
/*
 * This class should not implement IBag because this class is not in homework mandatory classes so we can build inventoryBag class
 * as we want.
 * 
 * Should an method that get item according to index of item or we can use toArray class return an array then reach item this new array
 * 
 * 
 */
public class InventoryBag<T> /*implements IBag<T>*/ {

	private T[] BagArr;
	private int number_entries;
	
	@SuppressWarnings("unchecked")
	public InventoryBag() {
		BagArr = (T[]) new Object[20]; //Initialize the bag array as fixed size as of now
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
		
		T[] result = (T[]) new Object[number_entries];
		for (int i=0; i<number_entries; i++) {
			result[i]=BagArr[i];
		}
		return result;
	}
	
	
	
/*
	@Override
	public boolean contains(Object item) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean transferTo(IBag targetBag, Object item) {
		
		return false;
	}

	@Override
	public T removeByIndex(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public T remove() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object remove(Object item) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getItemCount() {
		
		return number_entries;
	}

	@Override
	public int getIndexOf(Object item) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void displayItems() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dump() {
		// TODO Auto-generated method stub
		
	}
*/
}
