package BSTtttt;
/** 
 * A binary search tree
 * @author         Edo Biagioni
 * @lecture        ICS 211 Mar 17 (or later)
 * @date           March 16, 2011
 */

public class bst012<E extends Comparable<E>> {

 // here, include the BinaryNode definition
       
       /** 
         * A node in a binary tree 
         * @author         Edo Biagioni
         * @lecture        ICS 211 Mar 15 or later
         * @date           March 14, 2011
         * @bugs           private class: include this code within a larger class
         */
       
       private static class BinaryNode<E> {
         private E item;
         private BinaryNode<E> left;
         private BinaryNode<E> right;
       
       
       /** 
         * constructor to build a node with no subtrees
         * @param the value to be stored by this node
         */
         private BinaryNode(E value) {
           item = value;
           left = null;
           right = null;
         }
       
       
       /** 
         * constructor to build a node with a specified (perhaps null) subtrees
         * @param the value to be stored by this node
         * @param the left subtree for this node
         * @param the right subtree for this node
         */
         private BinaryNode(E value, BinaryNode<E> l, BinaryNode<E> r) {
           item = value;
           left = l;
           right = r;
         }
       }
 // end of the BinaryNode definition


 // this is the root of the binary tree.  If the tree is empty, it is null
 protected BinaryNode<E> root;
 protected E savedResult;     // used by the delete operation

 /** 
   * initializes an empty binary search tree
   */
 public bst012() {   root = null; }

 /** 
   * computes the number of nodes in the subtree
   * @param the root of the current subtree
   * @return the number of nodes in the subtree
   */
 private int size(BinaryNode<E> subtree) {
   // check for null subtree FIRST, before trying to get 
   // subtree.left or subtree.right
   if (subtree == null) {     return 0;             // no nodes
   }  // the total size is the size of the left subtree, plus the
      // size of the right subtree, plus one for the root of this subtree
   return size(subtree.left) + 1 + size(subtree.right);
 }

 /** 
   * how many nodes/values are in this subtree?
   * @return the number of nodes in this subtree
   */
 public int size() {   return size(root); }


 /** 
   * finds a node in the tree with the specified value, returns the value
   * @param a value to be compared to the value in each node
   * @param the root of the current subtree
   * @return the object found (NOT the object searched for!) or null
   */
 private E find(E value, BinaryNode<E> subtree) {
   // check for null subtree FIRST, before trying to get subtree.item,
   // subtree.left, or subtree.right
   if (subtree == null) {     return null;          // not found
   }
   int comparison = value.compareTo(subtree.item);
   if (comparison == 0) {  // value matches the item, return the item
     return subtree.item;
   }
   if (comparison < 0) {   // value is less than the root
     return find(value, subtree.left);   } else {     return find(value, subtree.right);   }
 }

 /** 
   * finds a node in the tree with the specified value
   * @param a value to be compared to the value in each node
   * @return the object found (NOT the object searched for!) or null
   */
 public E find(E value) {   return find(value, root); }


 /** 
   * adds a value to a binary search tree 
   * @param a value to be added to the tree
   * @param the root of the current subtree
   * @return the new subtree, or null if the value was not added
   */
 private BinaryNode<E> add(E value, BinaryNode<E> subtree) {
   // check for null subtree FIRST, before trying to get subtree.item,
   // subtree.left, or subtree.right
   if (subtree == null) {  // the value is not in the tree, so add it
     return new BinaryNode<E>(value);
   }
   int comparison = value.compareTo(subtree.item);
   if (comparison == 0) {  // value matches the item, do not add, return null 
     return null;
   }
   BinaryNode<E> result;
   if (comparison < 0) {   // value is less than the root
     result = add(value, subtree.left);
     if (result != null) { // the tree changed
       subtree.left = result;
     }
   } else {
     result = add(value, subtree.right);
     if (result != null) { // the tree changed
       subtree.right = result;
     }
   }
   if (result != null) {   // return the root of this changed subtree
     result = subtree;     // (result was set to the left or right subtree)
   }
   return result;
 }

 /** 
   * adds a value to a binary search tree 
   * @param a value to be added to the tree
   * @return true if the object was added, and false otherwise
   */
 public boolean add(E value) {
   BinaryNode<E> result = add(value, root);
   if (result == null) {   // not added
     return false;
   }  // else: added, the root node might have changed
   root = result;
   return true;
 }


 /** 
   * gets the righmost value from a binary search tree 
   * @param the root of the current subtree
   * @return the root of the new subtree
   */
 private E getRightmost(BinaryNode<E> subtree) {
   if (subtree.right == null) {
     return subtree.item;   // this is the rightmost node
   }
   return getRightmost(subtree.right);
 }

 /** 
   * removes the root value from a tree and puts it in "savedResult"
   * @param the root of the current subtree
   * @return the root of the new subtree
   * @assert subtree is not null
   */
 private BinaryNode<E> deleteRoot(BinaryNode<E> subtree) {
   if (subtree == null) {     throw new java.lang.RuntimeException("null subtree in deleteRoot");   }
   savedResult = subtree.item;
   // two simple cases to test for 0 or 1 subtrees
   if (subtree.left == null) {     return subtree.right;  // the data, if any, is in the right subtree
   }
   if (subtree.right == null) {     return subtree.left;   // the data, if any, is in the left subtree
   }
   // this tree has both left and right children, so we must pick
   // either the leftmost node of the right subtree or the rightmost
   // node of the left subtree to put in place of the root node
   // we pick the rightmost node of the left subtree
   E newRoot = getRightmost(subtree.left);
   subtree.left = delete(newRoot, subtree.left);   // note the recursive call
   subtree.item = newRoot;
   return subtree;
 }

 /** 
   * removes a value from a binary search tree and puts it in "savedResult"
   * @param a value to removed from the tree
   * @param the root of the current subtree
   * @return the root of the new subtree
   */
 private BinaryNode<E> delete(E value, BinaryNode<E> subtree) {
   // check for null subtree FIRST, before trying to get subtree.item,
   // subtree.left, or subtree.right
   if (subtree == null) {         // the value is not in the tree
     return null;
   }
   int comparison = value.compareTo(subtree.item);
   if (comparison == 0) {         // value matches the item, remove it
     subtree = deleteRoot(subtree);   } else if (comparison < 0) {   // value is less than the root
     subtree.left = delete(value, subtree.left);   } else {     // value is greater than the root
     subtree.right = delete(value, subtree.right);
   }
   return subtree;
 }

 /** 
   * deletes a value from a binary search tree 
   * @param a value to be deleted from the tree
   * @return the object that was deleted, or null if the value was not found
   */
 public E delete(E value) {
   savedResult = null;     // initialize, may be set by delete
   root = delete(value, root);
   return savedResult;
 }


 /** 
   * unit test method -- basic testing of the functionality
   * @param list of objects to add to the tree
   */
 public static void main (String [] arguments) {
	  
	// int bst= {1,2,3,4};
	 bst012<String> bst = new bst012<String>();
	 bst.add("2");
	 bst.add("4");
	 bst.add("1");
	 bst.add("3");
   for (String s: arguments) {
     if (s.charAt(0) == '+') {         // add this item
       String value = s.substring(1);  // get rid of the "+"
       System.out.println("adding " + value + " to the tree returned " + bst.add(value));
     } else if (s.charAt(0) == '-') {  // remove this item
       String value = s.substring(1);  // get rid of the "-"
       System.out.println("removing " + value + " from the tree returned " + bst.delete(value));
     } else {                          // find this item (as is)
       System.out.println("finding " + s + " in the tree returned " + bst.find(s));
     }
   }
 }

}