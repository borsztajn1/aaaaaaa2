package bstt00;

public	class Node7<T> {

	    public Node7 next; 
	    public Node7 prev;     
	    public T data;

	    public Node7(T d, Node7 p, Node7 n){
	        next = n; 
	        prev = p;
	        data = d;
	    }

		public Node7(String x, Node7 prev2, Node7<T> endMarker) {
			// TODO Auto-generated constructor stub
		}
}
