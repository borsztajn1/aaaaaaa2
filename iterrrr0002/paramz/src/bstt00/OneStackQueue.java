package bstt00;
import java.util.Deque;
import java.util.ArrayDeque;

public class OneStackQueue<T> { 

    private Deque<T> stack;
    public OneStackQueue() {        stack =  new ArrayDeque<>();    }
    public void enqueue(T item) {        stack.push(item);    }
    public T dequeue() {
        if (stack.isEmpty()) {            throw new IndexOutOfBoundsException("Empty queue.");        }
        return dequeueRec();
    }

    private T dequeueRec() {
        T next = stack.pop(); 
        if (stack.isEmpty()) { // This was the only element on the stack
            return next;
        } else {
            T bottom = dequeueRec(); 
            stack.push(next);
            return bottom; 
        }
    }

    public static void main(String[] args) {
        OneStackQueue<Integer> q = new OneStackQueue<>();
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
    }

}
