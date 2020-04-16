package ds;

public class BasicQueue<X> implements QueueSkeleton<X>{
	
	private X[] data;
	private int front;
	private int end;
	
	public BasicQueue(){
		
		this(1000);
		
	}
	
	public BasicQueue(int size) {
		front=-1;
		end= -1;
		data = ( X[] ) new Object[size];
	}

	public int size() {
		
		if(front==-1 && end==-1) {
			return 0;
		}
		else {
			return end-front+1;
		}
		
	}
	
	@Override
	public void enQueue(X item) {
		
		//see if queue is full
		if((end+1)%data.length==front) {
			throw new IllegalStateException("The Queue is full");
		}
		//if size if empty add new item
		else if(size()==0) {
			
			front++; end++;
			data[front]=item;
		}
		//if size is not empty add item at the end
		else {
			data[++end]=item;
		}		
		
	}
	
	@Override
	public X deQueue() {
		
		if( size()==0) {
			throw new IllegalStateException("Queue is empty");
		}
		
		X value ;
		
		if(front==end) {
			value = data[front];
			front=-1;
			end=-1;
		}
		else {
			value = data[front];
			data[front]=null;
			front++;			
		}
		
		return value;
		
	}

	@Override
	public boolean contains(X item) {
		
		boolean contains = false;
		int lenght = size();
		
		for(int i=front;i<end;i++) {
			
			if(data[i].equals(item)) {				
				contains = true;
				break;				
			}			
		}
		
		return contains;
 
	}

	@Override
	public X access(int position) {
		
		if(size()==0||position<0 || position > size()) {
			throw new IllegalArgumentException("Queue is empty or position is out of range, current size of queue is "+ size());
		}
		
		int queueIndex = 0;
		
		for(int i=front;i<end;i++) {
		
			if(queueIndex++==position) {
				return data[i];
			}
			
		}
		
		throw new IllegalArgumentException("Could not get a queue item at position:  "+position);
		
	}
	
	
}
