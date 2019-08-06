package bstt00;

public class SimpleLinkedList<T> {

    Node7<T> beginMarker;
    Node7<T> endMarker;

    int theSize;

    public SimpleLinkedList() {
        beginMarker = new Node7<>(null, null, null);
        endMarker = new Node7<>(null, beginMarker ,null);
        beginMarker.next = endMarker;
        theSize = 0;
    }


    public boolean add(String x) {
        Node7<T> n = new Node7<T>(x, endMarker.prev, endMarker);
        endMarker.prev.next = n; 
        endMarker.prev = n; 
        theSize++;
        return true;        
    }


    private Node7<T> getNode7(int idx) {

        if (idx >= theSize) {
            throw new IndexOutOfBoundsException("getNode7 at index:"+idx+", but list has only "+theSize+" entries.");
        }

        Node7<T> currentNode7;

        if (idx < theSize / 2) {
            currentNode7 = beginMarker.next; 
            for (int i=0; i < idx; i++) { 
                currentNode7 = currentNode7.next;
            }
        } else {
            currentNode7 = endMarker.prev; 
            for (int i=theSize-1; i>idx; i--) {
                currentNode7 = currentNode7.prev;
            }
        }
        return currentNode7;

    } 

    public T get(int idx) {
        return getNode7(idx).data;
    }
    

    public boolean remove(int idx) {
        Node7 n = getNode7(idx);

        n.next.prev = n.prev;
        n.prev.next = n.next;

        theSize--;
        return true; 
    }

    public boolean add(int idx, String s) {
        
        Node7 n = getNode7(idx); 
        Node7 newNode7 = new Node7(s, n.prev, n);
        n.prev.next = newNode7; 
        n.prev = newNode7;
        theSize++;
        return true;

    }

    @Override
    /**
     * Return a string representation of this list. 
     */
    public String toString() {
    
        StringBuilder sb = new StringBuilder();

        sb.append("[ ");
        Node7 currentNode7 = beginMarker; 
        while (currentNode7.next != endMarker) {
            currentNode7 = currentNode7.next;
            sb.append(currentNode7.data);
            sb.append(" ");
        }
        sb.append("]");
        return sb.toString(); 
    }
    
    

    public static void main(String[] argv) {
        SimpleLinkedList<String> l = new SimpleLinkedList<>();
     //   l.add(1);
       // l.add(0,"six");
        System.out.println(l);
        System.out.println(l.remove(1));
        System.out.println(l);
      //  l.add(0,"six");
        System.out.println(l);
    }

}