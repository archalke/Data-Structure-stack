package ds;

import java.util.ArrayList;

public class ListStack<X> implements StackSkeleton<X>{
	
	int stackPointer=0;
	ArrayList<X> data = new ArrayList<>();
	
	public X access(X item) {
		while(stackPointer>0) {			
			X newItem = pop();
			if(newItem.equals(item)) {
				return item;
			}
		}
		throw new IllegalArgumentException("No item found");
	};
	

	public boolean contains(X item) {		
		for(int i=0;i<stackPointer;i++) {
			if(data.get(i).equals(item))
				return true;
		}
		return false;
	};
	
	
	@Override
	public X pop() {
		return data.get(--stackPointer);
	}
	
	
	public void push(X newItem) {
		data.add(newItem);
		stackPointer++;
	}


	@Override
	public int size() {
		return stackPointer;
	};	
	

}
