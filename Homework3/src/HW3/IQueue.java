package HW3;

public interface IQueue<T> { 
		
		
		public void enqueue(T newEntry);
		
		public T getFront();
		
		public T dequeue();

		public boolean isEmpty();

}
