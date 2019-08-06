package heappp;

public class HeapTest {
    public static void main(String[] args) throws Exception {
	Heap2 h = new Heap2();

	h.printHeap();
	System.out.println("Inserting (a,2)");
	h.insert("a", 2);
	h.printHeap();
	System.out.println("Inserting (b, 1)");
	h.insert("b",1);
	h.printHeap();
	System.out.println("Inserting (c,7)");
	h.insert("c", 7);
	h.printHeap();
	System.out.println("Inserting (d,4)");
	h.insert("d", 4);
	h.printHeap();

	System.out.println("Removing");
	System.out.println(h.removeMin());
	h.printHeap();
    }
}