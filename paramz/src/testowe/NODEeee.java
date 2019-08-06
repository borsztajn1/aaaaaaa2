package testowe;
import java.util.*;

//https://www.youtube.com/watch?v=81PpYQ0AN_w

//================================================
class BST{
public Node createNewNode(int k){
Node a=new Node();
a.data=k;
a.left=null;
a.right=null;
return a;
}
//================================================

//private boolean compareObjects(Object o1, Object o2) {    return o1.equals(o2);}

public Node insert(Node node, int val){

  if(node==null) {return createNewNode(val);}

if(val<node.data) {node.left=insert(node.left,val);}
else if(val>node.data) {node.right=insert(node.right,val);}
return node;
}
}//-----------------
class Node{
	int data;
	Node left;
	Node right;


}
class ere{
	int f=1;
	ere qqq=null;

}

public class NODEeee{
	 public static void main(String[] args){

	  BST drze=new BST();
	  ere zzz=new ere();
	  
	  Node root=null;
	  Node rrr=null;
	  
		 System.out.println(rrr);
	  
	  System.out.println(rrr); 
	 root = drze.insert(root,8);
//	 root = drze.insert(root,3);
//	 root = drze.insert(root,6);
//	 root = drze.insert(root,10);
//	 
	 System.out.println(zzz.qqq);
	}
}
