package ds;

import java.util.ArrayList;

public class BasicStack<X> {

	private X[] data;
	int stackPointer;
	
	public BasicStack() {
		data = (X[]) new Object[100];
		stackPointer = 0;
	}	
	
	public void push(X newItem) {
		data[stackPointer++] = newItem;
	}
	
	public X pop() {
		
		if(stackPointer==0) {
			throw new IllegalStateException("Stack is empty");
		}
		
		X value = data[stackPointer];
		data[stackPointer]=null;
		return value;
	}
	
	
	public boolean contains(X item) {
		
		boolean found = false;
		
		for(int i=0;i<stackPointer;i++) {
			
			if(data[i].equals(item)) {
				found = true;
				return found;
			}
		}
		
		return found;
	}
	
	
	public X Access(X item) {
		
		while(stackPointer>0) {
			
			X tempItem = pop();
			if(item.equals(tempItem)) {
				return tempItem;
			}
			
		}
		
		throw new IllegalArgumentException("Could not find an item on stack"+item);
		
	}
	
	public int size() {
		return stackPointer;
	}
	
	
	
	
	
	
}
