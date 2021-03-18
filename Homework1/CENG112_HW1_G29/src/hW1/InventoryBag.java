package hW1;

public class InventoryBag<T> implements IBag<T> {

	private T[] BagArr;
	private int number_entries;
	
	@SuppressWarnings("unchecked")
	InventoryBag() {
		BagArr = (T[]) new Object[20]; //Initialize the bag array as fixed size as of now
	}

	@Override
	public boolean add(T newItem) { //
		
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

	@Override
	public boolean isEmpty() {  //
		boolean is_empty = false;
		
		if (number_entries==0) {
			is_empty=true;
			return is_empty;
		}
		return(is_empty);
	}

	@Override
	public boolean isFull() {
		boolean is_full = false;
		
		if (number_entries>=BagArr.length) {
			is_full=true;
			return is_full;
		}
		return(is_full);
	}

	@Override
	public boolean contains(Object item) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean transferTo(IBag targetBag, Object item) {
		// TODO Auto-generated method stub
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
		// TODO Auto-generated method stub
		return 0;
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

}
