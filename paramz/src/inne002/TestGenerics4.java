package inne002;


//Generic Method,   Like generic class, we can create generic method that can accept any type of argument.
//Let’s see a simple example of java generic method to print array elements. We are using here E to denote the element.

public class TestGenerics4{  
	  
	   public static < E > void printArray(E[] elements) {  
	        for ( E element : elements){          
	            System.out.println(element );  
	         }  
	         System.out.println();  
	    }  
	    public static void main( String args[] ) {  
	        Integer[] intArray = { 10, 20, 30, 40, 50 };  
	        Character[] charArray = { 'J', 'A', 'V', 'A', 'T','P','O','I','N','T' };  
	  
	        System.out.println( "Printing Integer Array" );  
	        printArray( intArray  );   
	  
	       System.out.println( "Printing Character Array" );  
	        printArray( charArray );   
	    }   
	}  