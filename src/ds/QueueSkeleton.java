package ds;

public interface QueueSkeleton<X> {
	
	public int size();
	public boolean contains(X item);
	X access(int position);
	public void enQueue(X item);
	public X deQueue();

}
