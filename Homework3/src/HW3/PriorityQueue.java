package hW3;

public class PriorityQueue<T> implements IQueue<T>{
	
	private Node firstNode;
	private Node lastNode;
	
	
	public PriorityQueue()
	{
		firstNode = null;
		lastNode = null;
	}
	

	@Override
	public T peek() {
		return firstNode.getData();
	}

	@Override
	public boolean isEmpty() {
		return (firstNode == null) && (lastNode == null);
	}

	@Override
	public int getSize() {//needed?
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void clear() {
		firstNode = null;
		lastNode = null;
	}

	@Override
	public void enqueue(T newEntry) {//must be changed to be able to insert according to priority
		Node newNode = new Node(newEntry,null);
		
		if(isEmpty())
			firstNode = newNode;
		else
			lastNode.setNextNode(newNode);
		
		lastNode = newNode;
	}


	@Override
	public T getFront() throws EmptyQueueException {
		if (isEmpty())
			throw new EmptyQueueException();
		else
			return firstNode.getData();
	}

	@Override
	public T dequeue() throws EmptyQueueException {
		T front = getFront();
		assert firstNode != null;
		firstNode.setData(null);
		firstNode = firstNode.getNextNode();
		
		if(firstNode == null)
			lastNode = null;
		
		return front;
	}
	
	
	private class Node {
		private T data;
		private Node next;
		
		private Node(T newEntry)
		{
			this(newEntry, null);
		}
		
		private Node(T newEntry, Node nextNode)
		{
			data = newEntry;
			next = nextNode;
		}
		
		private T getData() {
			return data;
		}
		
		private void setData(T newData) {
			data = newData;
		}
		
		private Node getNextNode() {
			return next;
		}
		
		private void setNextNode(Node nextNode) {
			next = nextNode;
		}
	}
	//take computation and sort them according to priority in simulation
	
}
