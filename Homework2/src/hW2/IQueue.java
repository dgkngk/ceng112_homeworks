package hW2;

public interface IQueue<T> {
	
	
	public void enqueue(T newEntry);
	
	public T getFront();//throws EmptyQueueException;
	
	public T dequeue();//throws EmptyQueueException;

	public boolean isEmpty();
	
	
	

}
