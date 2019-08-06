package BSTtttt;

public class bst0008 {

}

/*
Implementing a Binary Search Tree (BST) in Java
By Steve Claridge on Thursday, March 20, 2014

In the Java category

This is a walk-through of how to create a binary search tree (BST) using Java 1.7 and recursion. In order to keep things simple, only adding and retrieving data from the tree has been implemented, deleting data will be added in a separate article.

Before we get into the code, a quick overview of BSTs

A binary search tree is a node-based binary tree data structure that has the following properties:

The left subtree of a node contains only nodes with keys less than the node’s key.
The right subtree of a node contains only nodes with keys greater than the node’s key.
The left and right subtree each must also be a binary search tree.
There must be no duplicate nodes.
Read more about binary trees on Wikipedia.

We are going to create a class called BST, which internally contains one BSTNode object to represent the root node of the tree. Here’s an example of using the BST class:

BST tree = new BST();
tree.put( "f", "eff" );
tree.put( "c", "sea" );
tree.put( "a", "aye" );
tree.put( "e", "eee" );
tree.put( "i", "eye" );
tree.put( "h", "aitch" );
tree.put( "z", "zed" );

String str = tree.get( "i" ); // str will equal "eye"

tree.put( "i", "eye updated" );

str = tree.get( "i" ); // str will equal "eye updated"
As you can see, it is very similar to the HashMap class. To keep things simple in this example, our keys will always be Strings and our values will always be Objects, so the BST class looks like this:

public class BST
{
    private BSTNode root;

    public void put( String key, Object value )
    {
        if ( root == null )
        {
            root = new BSTNode( key, value );
        }
        else
        {
            root.put( key, value );
        }
    }

    public Object get( String key )
    {
        return root == null ? null : root.get( key );
    }
}
The BST class is pretty dumb, it contains only the root node of the tree and no code for actually working with the tree’s contents. It does contain the get() and put() methods that we called in the usage example but it simply calls the get() and put() methods of the root node.

The root node in BST is an instance of the BSTNode class. Each instance of BSTNode represents a single leaf within the tree. Here’s the definition of our leaf:

public class BSTNode
{
    private String key;
    private Object value;
    private BSTNode left, right;

    public BSTNode( String key, Object value )
    {
        this.key = key;
        this.value = value;
    }

    //if key not found in BST then it is added. If jey already exists then that node's value
    //is updated.
    public void put( String key, Object value )
    {
        if ( key.compareTo( this.key ) < 0 )         
        {             
            if ( left != null )             
            {                 
                left.put( key, value );             
            }             
            else             
            {                 
                left = new BSTNode( key, value );             
            }         
        }         
        else if ( key.compareTo( this.key ) > 0 )
        {
            if ( right != null )
            {
                right.put( key, value );
            }
            else
            {
                right = new BSTNode( key, value );
            }
        }
        else
        {
            //update this one
            this.value = value;
        }
    }

    //find Node with given key and return it's value
    public Object get( String key )
    {
        if ( this.key.equals( key ) )
        {
            return value;
        }

        if ( key.compareTo( this.key ) < 0 )
        {
            return left == null ? null : left.get( key );
        }
        else
        {
            return right == null ? null : right.get( key );
        }
    }
}
BSTNode contains the key/value pair and a constructor to set them. It also contains the following:

private BSTNode left, right;
Remember that the BST class only holds the root node of the tree and so it is the nodes themselves that hold the connections between the leaves within the tree. Or, to put that differently: each BSTNode contains a reference to its immediate child nodes, one on the left and one on the right (refer back to the original description of trees for the left/right terminology).

To perform a get() of a specific key the logic is:

Get the root node from the BST class and check if its key is equal to the one requested – if it is then return this node’s value object.
If not, compare the requested key with the root node’s key, if requested is less than root then call get() method on the root’s left child node – if requested is greater than root then call get() method on root’s right child node.
Depending on the outcome of #2, read the left or right child node and check if its key is equal to the one requested – if it is then return the node’s value object.
If not, compare the requested key with the current node’s key, if requested is less than current then call get() method on the current’s left child node – if requested is greater than current then call get() method on current’s right child node.
Repeat from #3 until either the key is found and its value object is returned or there are no more left/right child nodes to check, in which case the requested key is not found in the tree.
I purposely duplicated the steps in that list so you can clearly see the recursion taking place – the same logic is applied to each node in the tree, starting with the root.

The logic for put() is very similar in that the nodes are traversed until either the key being put is found in the tree and its object value is updated or a an empty left/right node is found and a new node is created with the new key/value.

This example binary search tree is very basic and is no substitute for HashMap but does show recursive code in action.
*
/