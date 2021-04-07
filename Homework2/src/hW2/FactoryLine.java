package hW2;

import java.util.*;

public class FactoryLine<T> implements IQueue<T>{
	
	
	private T[] factoryLine;
	private int frontIndex;
	private int backIndex;
	private boolean initialized = false;
	private static final int defaultCapacity = 50;
	private static final int maxCapacity = 10000;
	
	
	
	@SuppressWarnings("unchecked")
	public FactoryLine() {
		
		factoryLine = (T[]) new Object[defaultCapacity+1];
		frontIndex = 0;
		backIndex = defaultCapacity;
		initialized = true;
	}
	

	
	
	public void enqueue(T newEntry) {
		
		//checkInitialization()	;
		
		ensureCapacity();
		backIndex = (backIndex+1) % factoryLine.length;
		factoryLine[backIndex] = newEntry;
		
		
	}
	
	public T getFront() /*throws EmptyQueueException*/  {
		
		//checkInitialization()	;
		
		if(isEmpty()){
			//throw new EmptyQueueException();
			}
		
		else { return factoryLine[frontIndex];}
		return null;
		
	}
	
	public T dequeue() /*throws EmptyQueueException */{
		
		//checkInitialization()	;
		
		if(isEmpty()){
			//throw new EmptyQueueException();
			}
		
		else {
			
			T front = factoryLine[frontIndex];
			factoryLine[frontIndex] = null;
			frontIndex = (frontIndex+1) % factoryLine.length;
			return front;
		}
		return null;
		
		
	}
	
	@SuppressWarnings("unchecked")
	private void ensureCapacity() {
		
	
		
		if (frontIndex == ((backIndex +2) % factoryLine.length)) {
			
			T[] oldLine = factoryLine;
			int oldSize = oldLine.length;
			int newSize = 2 * oldSize;
			
			T[] tempLine = (T[]) new Object[newSize];
			factoryLine= tempLine;
			
			for (int i=0 ; i<oldSize-1;i++) {
				
				factoryLine[i] = oldLine[frontIndex];
				frontIndex = (frontIndex+1) % oldSize;
				
			}
			
			frontIndex = 0;
			backIndex = oldSize-2;
		}
	}
	
	public boolean isEmpty() {
		boolean is_empty = false;
		
		if (frontIndex == (((backIndex+1))% factoryLine.length)) {
			
			is_empty = true;
		}
		return is_empty;
	}

}