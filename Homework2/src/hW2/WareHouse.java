package hW2;

import java.util.*;


public class WareHouse<T> implements IStack<T> {
	
	private T[] wareHouse;
	private int topIndex;
	private boolean initialized = false;
	private static final int defaultCapacity =50;
	private static final int maxCapacity = 1000;
	
	public WareHouse() {
		
		this(defaultCapacity);
	} 
	
	@SuppressWarnings("unchecked")
	public WareHouse(int initialCapacity) {
		
		//checkCapacity(initialCapacity);
		
		wareHouse = (T[])  new Object[initialCapacity];
		topIndex = -1; 
		initialized = true; //??
		
		
		
	}
	
	private void ensureCapacity() {
		
		if (topIndex == wareHouse.length-1) {
			
			int newSize = 2 * wareHouse.length;
			//checkCapacity(newSize);
			wareHouse = Arrays.copyOf(wareHouse, newSize);
			}
	}
	
	public void push(T newEntry) {
		
		//checkInitialization();
		ensureCapacity();
		wareHouse[topIndex+1] = newEntry;
		topIndex++;
	}
	
	
	public T pop() {
		
		//checkInitialization();
		if(isEmpty()) {
			throw new EmptyStackException();
			}
		else {
			
			T top = wareHouse[topIndex];
			wareHouse[topIndex] = null;
			topIndex--;
			return top;
		}
	}
	
	public T peek() {
		
		//checkInitialization();
		if (isEmpty()) {
			throw new EmptyStackException();
			}
		else {return wareHouse[topIndex];}
	}
	public boolean isEmpty() {
		
		return false;
	}
	public void clear() {}
	
	

}
