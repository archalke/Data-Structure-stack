package ds;

import java.util.ArrayList;

public interface StackSkeleton<X> {	
	
	int stackPointer=0;
	
	void push(X newItem);
	
	X pop();
	
	boolean contains(X item);
	
	X access(X item);
	
	int size();
	
	

}
