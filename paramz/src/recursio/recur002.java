package recursio;
/**
 * A program to demonstrate printing integers recursively
 * @author        Biagioni, Edoardo
 * @assignment    ICS 211 in-class example
 * @date          August 29th, 2007 
 * @bugs          should check for args on command line and print those
 */

public class recur002 {
    /* recursive method to print each digit of an integer followed
     * by a space, except the first digit is followed by two spaces */
    private static void printInt(int value) {
	if (value < 10) {            /* first (or only) digit */
	    System.out.print(value + "  ");
	} else {
    /* print the digits before this one */
	    printInt(value / 10);
    /* print last digit -- could call printInt again recursively */
	    System.out.print(value % 10 + " ");
	}
    }

    /* test the printInt method
     * expected output: 1  2 3 4 5 
     */
    public static void main(String [] args) {
	int valueToPrint = 12345;
	printInt(valueToPrint);
	System.out.println("");
    }
}
