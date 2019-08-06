package BSTtttt;

import java.util.*;

public class bst00012 {
public static void main(String[] args){
	   bst00012a root2=bst00012a.BSTFactory(8, 2);
	  // System.out.println(Arrays.deepToString("a"));    

	System.out.println(root2.toString());
	}
}

class bst00012a {
private int data;
private bst00012a left, right;

public bst00012a(int initialData, bst00012a initialLeft,
		bst00012a initialRight) {
    data = initialData;
    left = initialLeft;
    right = initialRight;
}
   public static bst00012a BSTFactory(int top,int depth) {
	   bst00012a root=new bst00012a(top,null,null);
	   bst00012a leftChild,rightChild;
    if(depth==0)
        return root;
    if(depth==1){
        //create 2 children left and right
        leftChild=new bst00012a(top-1,null,null);
        rightChild=new bst00012a(top+1,null,null);
        root=new bst00012a(top,leftChild,rightChild);
        return root;
    }
    if(depth>1){

        leftChild=BSTFactory(top-1,depth-1);
        rightChild=BSTFactory(top+1,depth-1);
        root=new bst00012a(top,leftChild,rightChild);
        return root;
    }
    return root;
}
}
//This is the output:
//	  data: 8
//	  8's left: data: 7
//	  7's left: null
//	  7's right: null
//	  8's right: data: 9
//	  9's left: null
//	  9's right: null