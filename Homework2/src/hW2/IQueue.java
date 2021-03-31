package hW2;

public interface IQueue<T> {
	
	//add and offer almost same methods
	public boolean add(T newEntry);
	public boolean offer(T newEntry);
	//remove and poll almost same methods
	public T remove();
	public T poll();
	//element and peek almost same methods
	public T element();
	public T peek();
	
	
	
	public int size();
	
	
	

}
