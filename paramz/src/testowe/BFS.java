package testowe;
import java.util.InputMismatchException;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

//https://www.programcreek.com/simple-java-8-lambdas/
//	https://www.programcreek.com/simple-java/

//++++GUI  http://cs.lmu.edu/~ray/notes/binarysearchtrees/
	
//http://javarevisited.blogspot.com/2017/08/how-to-remove-key-value-pair-from-map-iteration-java-example.html
	//http://javarevisited.blogspot.com/2016/03/how-to-reverse-arraylist-in-java-using-recursion.html
		
//+++http://www.algolist.net/Algorithms/Sorting/Selection_sort
		
//+++ du¿o < >  		https://gist.github.com/gtke/4656846
			
//+++ http://www.cs.toronto.edu/~hojjat/148s07/lectures/week9/11bst.pdf
//	http://www.newthinktank.com/2013/03/binary-tree-in-java/
//		https://www2.hawaii.edu/~esb/2011spring.ics211/BST.java.html
//			http://www.cs.armstrong.edu/liang/intro9e/html/BSTWithLineNumber.html?
//https://www.moreofless.co.uk/binary-search-tree-bst-java/
	
//	http://cs.nyu.edu/courses/spring07/V22.0102-002/BinarySearchTree.java
//		http://www.cs.dartmouth.edu/~thc/cs10/lectures/0428/BST.java
//http://www.geeksforgeeks.org/binary-search-tree-set-1-search-and-insertion/
//https://dzone.com/articles/java-how-create-binary-search
//http://www.sanfoundry.com/java-program-traverse-graph-using-bfs/
//http://www.sanfoundry.com/java-program-implement-binary-search-tree/
//http://www.algorytm.org/klasyczne/drzewa-poszukiwan-binarnych-bst/bst-j.html
//-https://www.cs.cmu.edu/~adamchik/15-121/lectures/Trees/code/BST.java

public class BFS
{     private Queue<Integer> queue;
 
    public BFS() {        queue = new LinkedList<Integer>();     }
 
    public void bfs(int adjacency_matrix[][], int source)
    {
        int number_of_nodes = adjacency_matrix[source].length - 1;
 
        int[] visited = new int[number_of_nodes + 1];
        int i, element;
 
        visited[source] = 1;
        queue.add(source);
 
        while (!queue.isEmpty()){
            element = queue.remove();
            i = element;
            System.out.print(i + "\t");
            while (i <= number_of_nodes)
            {  if (adjacency_matrix[element][i] == 1 && visited[i] == 0)
                {   queue.add(i);
                    visited[i] = 1;                }
                i++;
            }        }    }
 
    public static void main(String... arg)
    {        int number_no_nodes, source;
        Scanner scanner = null;
 
        try        {
            System.out.println("Enter the number of nodes in the graph");
           // scanner = new Scanner(System.in);
            number_no_nodes = 1;//scanner.nextInt();
 
            int adjacency_matrix[][] = {{1, 1, 1, 1}, {1, 1, 1, 1}, {1, 1, 1, 1}, {1, 1, 1, 1}};
            		
            		//new int[number_no_nodes + 1][number_no_nodes + 1];
            System.out.println("Enter the adjacency matrix");
            for (int i = 1; i <= number_no_nodes; i++)
                for (int j = 1; j <= number_no_nodes; j++)
                    adjacency_matrix[i][j] = scanner.nextInt();
 
            System.out.println("Enter the source for the graph");
            source = 1; //scanner.nextInt();
 
            System.out.println("The BFS traversal of the graph is ");
            BFS bfs = new BFS();
            bfs.bfs(adjacency_matrix, source);
 
        } catch (InputMismatchException inputMismatch) {System.out.println("Wrong Input Format");}
        scanner.close();
    }
}
