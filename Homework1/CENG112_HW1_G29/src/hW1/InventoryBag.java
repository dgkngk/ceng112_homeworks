package hW1;

public class InventoryBag<T> implements IBag {

	private T[] BagArr;
	
	@SuppressWarnings("unchecked")
	InventoryBag() {
		BagArr = (T[])new Object[20]; //Initialise the bag array as fixed size as of now
	}
	

	@Override
	public boolean add(Object newItem) {
		
		return false;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isFull() {
		// TODO Auto-generated method stub
		return false;
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
	public Object removeByIndex(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object remove() {
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
