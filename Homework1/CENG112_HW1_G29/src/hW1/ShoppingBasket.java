package hW1;

public class ShoppingBasket<T> implements IBag<T> {
	
	//Just going to reuse some of our code
	
	private T[] BagArr;
	private int number_entries;
	public final int MAX_SIZE = 2000;
	
	@SuppressWarnings("unchecked")
	public ShoppingBasket() {

		BagArr = (T[]) new Item[20]; //Initialise the bag array as fixed size as of now
	    number_entries=0;

	}

	@Override
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

	@Override
	public boolean isEmpty() {
		
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
	public boolean contains(T item) {
		
		for(T i: BagArr){
			if(i.equals(item))//return true if finds something that is equal
				return true;
		}
		return false;
	}

	@Override
	public boolean transferTo(IBag<T> targetBag, T item) {
		if((item != null)&&(targetBag != null))
			return targetBag.add(item);		
		return false;
	}

	@Override
	public T removeByIndex(int index) {
		if(index<0 || index>20)
			return null;
		T item = BagArr[index];
		BagArr[index] = null;
		T tmp = null;
		for (int i = index; i < number_entries-1 ;i++) {//shifting all entries to the left
			tmp = BagArr[i+1];
			BagArr[i] = tmp;
			BagArr[i+1] = null;
		}
		number_entries--;
		return item;
	}

	@Override
	public T remove() {//removes the last item
		T tmp = (T) BagArr[number_entries];
		BagArr[number_entries] = null;
		number_entries--;
		return tmp;
	}

	@Override
	public T remove(T item) {
		if(this.contains(item)) {
			for(int i = 0; i < number_entries; i++){
				if(BagArr[i].equals(item))
					return this.removeByIndex(i);
			}
		}
		return null;
	}

	@Override
	public int getItemCount() {
		return number_entries;
	}

	@Override
	public int getIndexOf(T item) {
		if(this.contains(item)) {
			for(int i = 0; i < 20; i++){
				if(BagArr[i].equals(item))
					return i;
			}
		}
		return 0;
	}

	@Override
	public void displayItems() {
		int ctr = 0;
		for(@SuppressWarnings("unused") T i : BagArr) {
			ctr++;
			System.out.println(BagArr[ctr].toString().split("  ")[0]+",");
		}
	}

	@Override
	public void dump() {
		
		for(int i=0;i < 20;i++)
			BagArr[i] = null;
	}

}
