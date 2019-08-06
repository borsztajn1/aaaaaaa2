package bstt00;

import java.util.Map;

public class BstMap<K extends Comparable<K>, V> extends BinarySearchTree<Pair<K,V>> implements Map<K,V> { 
	  
    public void put(K key, V value) {    insert(new Pair(key,value));    }
   
    public V get(K key) {
        BinaryNode<Pair<K,V>> found = find(new Pair(key, null), root);  
        if (found == null)
            return null;
        return found.data.value;
    }

    /**
     * Internal method to find an item in a subtree.
     * This is the same as contains, except that it returns 
     * the item that was found instead of a boolean.
     * @param x is item to search for.
     * @param t the node that roots the subtree.
     * @return node containing the matched item.
     */
    private BinaryNode<Pair<K,V>> find( Pair<K,V> x, BinaryNode<Pair<K,V>> t ) {
        if( t == null )
            return null; 
            
        int compareResult = x.compareTo( t.data );
            
        if( compareResult < 0 )
            return find( x, t.left );
        else if( compareResult > 0 )
            return find( x, t.right );
        else
            return t;    // Match
    }


    public static void main(String[] args) {
        BstMap<String, Integer> legs = new BstMap<>();
        legs.put("cat",4);
        legs.put("human",2);
        legs.put("spider",8);
    
        System.out.println(legs.get("cat"));
    }

}
 