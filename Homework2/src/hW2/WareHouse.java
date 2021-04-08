package hW2;

import java.util.*;


public class WareHouse<T> implements IStack<T> {
	
	private T[] wareHouse;
	private int topIndex;
	private int elementNumber;
	private boolean initialized = false;
	private static final int defaultCapacity =50;
	private static final int maxCapacity = 10000;
	
	@SuppressWarnings("unchecked")
	public WareHouse() {
		
		wareHouse = (T[])  new Object[defaultCapacity];
		topIndex = -1; 
		elementNumber = 0;
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
		
		wareHouse[(topIndex)+1] = newEntry;
		topIndex++;
		elementNumber++;
	}
	
	
	public T pop() {
		
		//checkInitialization();
		if(isEmpty()) {
			throw new EmptyStackException();
			}
		else {
			
			T top = wareHouse[topIndex]; 
			wareHouse[(topIndex)] = null;
			
			topIndex--;
			return top;
		}
	}
	
	public T peek() {
		
		//checkInitialization();
		if (isEmpty()) {
			throw new EmptyStackException();
			}
		
		else {
			return wareHouse[(topIndex)];}
	}
	
	
	public boolean isEmpty() {
		
		return (elementNumber == 0);
		
		
	}
	
	public void clear() {
		
		for (int i=0; i<=elementNumber; i++) {
			
			pop();
		}
	}
	
	

}
