package BSTtttt;

	public class bst00011 {

	    Node root;
	    bst00011 (){	        root = null;	    }
		class Node {

		    int key;

		    Node leftChild;
		    Node rightChild;

		    Node(int key) {		        this.key = key;		    }
		Node (){}

		    public String toString() {		        return "\n"+key+" ";		    }
		}
	    public void addNode(int key) {

	        Node newNode = new Node(key);

	        // If there is no root this becomes root
	        if (root == null) {	            root = newNode;	        } 
	        else {

	            // Set root as the Node we will start
	            // with as we traverse the tree

	            Node focusNode = root;
	            Node parent;
	            while (true) {
	                parent = focusNode;
	                if (key < focusNode.key) {        focusNode = focusNode.leftChild;
	                    if (focusNode == null) {
	                        parent.leftChild = newNode;
	                        return; // All Done
	                    }
	                } // end of if 

	                else { 	 focusNode = focusNode.rightChild;
	                    if (focusNode == null) {
	                        parent.rightChild = newNode;
	                        return; 
	                    }
	                }
	            }
	        }
	    }

	    // get the height of binary tree 
	    public int height(Node root) {

	        if (root == null)
	            return -1;

	        Node focusNode = root; 
	        int leftHeight = focusNode.leftChild != null ? height( focusNode.leftChild) : 0;
	        int rightHeight = focusNode.rightChild != null ? height( focusNode.rightChild) : 0;
	        return 1 + Math.max(leftHeight, rightHeight);
	    }

	    // METHODS FOR THE TREE TRAVERSAL

	    // inOrderTraverseTree : i) X.left ii) X iii) X.right
	    public void inOrderTraverseTree(Node focusNode) {

	        if (focusNode != null) {

	            inOrderTraverseTree(focusNode.leftChild);
	            // System.out.println(focusNode);
	            System.out.print( focusNode );
	            inOrderTraverseTree(focusNode.rightChild);
	        }
	        // System.out.println();
	    }

	    // preOrderTraverseTree : i) X ii) X.left iii) X.right
	    public void preorderTraverseTree(Node focusNode) {

	        if (focusNode != null) {

	            System.out.println(focusNode);
	            preorderTraverseTree(focusNode.leftChild);
	            preorderTraverseTree(focusNode.rightChild);
	        }}

	    // postOrderTraverseTree : i) X.left ii) X.right iii) X
	    public void postOrderTraverseTree(Node focusNode) {

	        if (focusNode != null) {

	            preorderTraverseTree(focusNode.leftChild);
	            preorderTraverseTree(focusNode.rightChild);
	            System.out.println(focusNode);
	        }
	    }
	    // END 
//////////////////////////     findNode

	    public Node findNode(int key) {

	        Node focusNode = root;

	        while (focusNode.key != key) {

	            if (key < focusNode.key) {     focusNode = focusNode.leftChild;
	            } else {	                focusNode = focusNode.rightChild;
	            }

	            if (focusNode == null)      return null;
	        }
	        return focusNode;
	    }

	    public boolean remove(int key) {

	        Node focusNode = root;
	        Node parent = root;
	        boolean isItALeftChild = true;


	        // we will remove the focusNode 
	        while (focusNode.key != key) {

	            parent = focusNode;

	            if (key < focusNode.key) {

	                isItALeftChild = true;
	                focusNode = focusNode.leftChild;
	            } 

	            else {
	                isItALeftChild = false;
	                focusNode = focusNode.rightChild;
	            }

	            if (focusNode == null)	                return false;
	        }

	        // no child 
	        if (focusNode.leftChild == null && focusNode.rightChild == null) {

	            if (focusNode == root)           root = null;
	            else if (isItALeftChild)        parent.leftChild = null;
	            else               parent.rightChild = null;
	        }

	        // one child ( left child )
	        else if (focusNode.rightChild == null) {

	            if (focusNode == root)           root = focusNode.leftChild;
	            else if (isItALeftChild)         parent.leftChild = focusNode.leftChild;
	            else                parent.rightChild = focusNode.leftChild;
	        }


	        else if (focusNode.leftChild == null) {

	            if (focusNode == root)               root = focusNode.rightChild;
	            else if (isItALeftChild)             parent.leftChild = focusNode.rightChild;
	            else                parent.rightChild = focusNode.rightChild;

	        }

	        // two children exits 
	        else {

	            // replacement is the smallest node in the right subtree 
	            // we neeed to delete the focusNode 
	            Node replacement = getReplacementNode(focusNode);

	            if (focusNode == root)	                root = replacement;
	            else if (isItALeftChild)               parent.leftChild = replacement;
	            else                parent.rightChild = replacement;
	            replacement.leftChild = focusNode.leftChild;
	        }

	        return true;
	    }


//////////////////////////	    createMinimalBST
	    public Node getReplacementNode(Node replacedNode) {

	        Node replacementParent = replacedNode;
	        Node replacement = replacedNode;
	        Node focusNode = replacedNode.rightChild;

	        // find the smallest node of the right subtree of the node to be deleted 
	        while (focusNode != null) {

	            replacementParent = replacement;
	            replacement = focusNode;
	            focusNode = focusNode.leftChild;
	        }

	        // exit when the focusNode is null
	        // the replacement is the smallest of the right subtree

	        if (replacement != replacedNode.rightChild) {

	            replacementParent.leftChild = replacement.rightChild;
	            replacement.rightChild = replacedNode.rightChild;
	        }

	        return replacement;
	    }
//////////////////////////createMinimalBST
	private  void createMinimalBST(int arr[], int start, int end, Node newNode){

	        if ( end <= start )	            return;
	        int mid = (start + end) / 2;
	        newNode.key = arr[mid];

	        if ( root == null ){	            root = newNode;	        }

	        System.out.println("new node = "+ newNode );

	        if (start <= mid-1) {
	            newNode.leftChild = new Node();
	            createMinimalBST(arr, start, mid - 1, newNode.leftChild);
	        }
	        if (mid+1 <= end) {
	            newNode.rightChild = new Node();
	            createMinimalBST(arr, mid + 1, end, newNode.rightChild); 
	        }
	        // System.out.println("left child = "+ newNode.leftChild +" "+ " right child = "+ newNode.rightChild);

	    } 

	    public void createMinimalBST(int array[]) {
	        Node n = new Node();
	        createMinimalBST(array, 0, array.length - 1, n);
	    }

	 public static void main(String[] args) {

	        int[] myArr = { 1,2,3,4,5,6,7,8,9 }; // sortedArrayToBST
	        bst00011 myTr = new bst00011();
	        // Node n = BinaryTree.createMinimalBST(myArr);
	        myTr.createMinimalBST(myArr);

	        // System.out.println("The root is = "+myTr.root);
	        // myTr.inOrderTraverseTree(myTr.root);
	        System.out.println();
	        myTr.inOrderTraverseTree(myTr.root);

	    }
}

//	new node = 			5 
//			new node =			2 
//			new node =			3 
//			new node =			7 
//			new node =			8 
//
//
//			0 
//			2 
//			3 
//			0 
//			5 
//			0 
//			7 
//			8 
