package petlee;

/*
class ForLoopExample {
    public static void main(String args[]){
         for(int i=10; i>1; i--){
              System.out.println("The value of i is: "+i);
         }
    }
}

class ForLoopExample3 {
    public static void main(String args[]){
         int arr[4]={2,11,45,9};
         //i starts with 0 as array index starts with 0 too
         for(int i=0; i<4; i++){
              System.out.println(arr[i]);
         }
    }
}

*/
public class forrrrr {

	   public static void main(String args[]) {
	      int [] numbers = {10, 20, 30, 40, 50};

	      for(int x : numbers ) {
	         System.out.print( x );
	         System.out.print(",");
	      }
	      System.out.print("\n");
	      String [] names = {"James", "Larry", "Tom", "Lacy"};
//*****************************************************************
	      for( String name : names ) {
//*****************************************************************

	         System.out.print( name );
	         System.out.print(",");
	      }
	   }
	}