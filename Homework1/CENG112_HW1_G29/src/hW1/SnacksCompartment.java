package hW1;

public class SnacksCompartment implements IBag<Item>{
	//Just going to reuse some of our code
	
	private Item[] BagArr;
	private int number_entries;
	public final int MAX_SIZE = 2000;
	
	public SnacksCompartment() {
		BagArr = (Item[]) new Item[20]; //Initialise the bag array as fixed size as of now
	    number_entries = 0;
	}

	@Override
	public boolean add(Item newItem) {
		
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
	public boolean contains(Item item) {
		
		for(Item i: BagArr){
			if(i.equals(item))//return true if finds something that is equal
				return true;
		}
		return false;
	}

	@Override
	public boolean transferTo(IBag<Item> targetBag, Item item) {
		if((item != null)&&(targetBag != null)) {
			this.remove(item);
			return targetBag.add(item);	
		}
		return false;
	}

	@Override
	public Item removeByIndex(int index) {
		if(index<0 || index>20)
			return null;
		Item item = BagArr[index];
		BagArr[index] = null;
		Item tmp = null;
		for (int i = index; i < number_entries-1 ;i++) {//shifting all entries to the left
			tmp = BagArr[i+1];
			BagArr[i] = tmp;
			BagArr[i+1] = null;
		}
		number_entries--;
		return item;
	}

	@Override
	public Item remove() {//removes the last item
		Item tmp = BagArr[number_entries];
		BagArr[number_entries] = null;
		number_entries--;
		return tmp;
	}

	@Override
	public Item remove(Item item) {
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
	public int getIndexOf(Item item) {
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
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dump() {
		
		for(int i=0;i < 20;i++)
			BagArr[i] = null;
	}
}
