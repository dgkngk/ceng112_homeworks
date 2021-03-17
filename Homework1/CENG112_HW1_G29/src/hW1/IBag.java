package hW1;
//this interface is ready
public interface IBag<T> {
	
	public boolean add(T newItem);
	public boolean isEmpty();
	public boolean isFull();
	public boolean contains(T item);
	public boolean transferTo(IBag<T> targetBag, T item);
	public T removeByIndex(int index);
	public T remove();
	public T remove(T item);
	public int getItemCount();
	public int getIndexOf(T item);
	public void displayItems();
	public void dump();
}
