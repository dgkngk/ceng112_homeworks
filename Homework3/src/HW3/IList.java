package HW3;

public interface IList<T> {

	public void add(T newEntry);
	
	public void add(int newPosition, T newEntry);
	
	public T remove(int Position);
	
	public T replace(int Position, T newEntry);
	
	public T getEntry(int Position);
	
	public T[] toArray();
	
	public boolean contains(T anEntry);
	
	public int getLength();
	
	public boolean isEmpty();
	
	public void clear();

}
