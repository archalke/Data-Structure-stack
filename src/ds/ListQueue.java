package ds;

import java.util.ArrayList;

public class ListQueue<X> implements QueueSkeleton<X>{
	
	ArrayList<X> queue = new ArrayList<>();
	int front=-1;
	int end = -1;
	
	@Override
	public X access(int position) {
		
		if(size()==0||position<0||position>size()) {
			throw new IllegalArgumentException("position is out of range or queue is empty");
		}
		
		X value = null;
		
		if( position>=front && position<=end ) {
			
			
			
		}		
		
		return value;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		if(front==-1&&end==-1) {
			return 0;
		}
		return end-front+1;
	}

	@Override
	public boolean contains(X item) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void enQueue(X item) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public X deQueue() {
		// TODO Auto-generated method stub
		return null;
	}
	

}
