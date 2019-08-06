package heappp;

public class HeapEmptyException extends Exception {
    
    public HeapEmptyException() {
	super("Heap is empty");
    }
}