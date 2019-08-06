package recursio;
/* 
 * A program to demonstrate recursion
 * @author	Biagioni, Edoardo
 * @assignment	lecture 3
 * @date	January 21, 2008
 * @bugs	none
 * @inspiration	William Albritton's exercise 3
 */

public class recur001 {
    /* main method is invoked when the program is started
     *
     * @param arguments  command-line arguments
     *
     */
    public static void main(String[] arguments) {
	printEvenOdd(arguments, 0);             // return location A, line 17
    }

    /* prints even-numbered arguments in order, followed by odd-numbered
     * arguments in reverse order.
     *
     * @param arguments  command-line arguments, strings to be printed
     * @param position   the position of the next argument to print
     *
     */

    private static void printEvenOdd(String[] arguments, int position) {
	if (position < arguments.length) {	// what happens if we leave out
	                                        // this test?
	    if (position % 2 == 0) {
		System.out.println("argument [" + position + "] is " +
				   arguments [position]);
		printEvenOdd(arguments, position + 1);// return location B,l.34
	    } else {
		printEvenOdd(arguments, position + 1);// return location C,l.36
		System.out.println("argument [" + position + "] is " +
				   arguments [position]);
	    }
	}
    }
}

// without the test for (position < arguments.length), the program recurses
// until it runs out of arguments, then it throws and exception:
// 
// % java Recursive hello wonderful world foo bar xyzzy blah bleeeeee q 
// argument [0] is hello
// argument [2] is world
// argument [4] is bar
// argument [6] is blah
// argument [8] is q
// Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 10
//         at Recursive.printEvenOdd(Recursive.java:32)
//         at Recursive.printEvenOdd(Recursive.java:36)
//         at Recursive.printEvenOdd(Recursive.java:34)
//         at Recursive.printEvenOdd(Recursive.java:36)
//         at Recursive.printEvenOdd(Recursive.java:34)
//         at Recursive.printEvenOdd(Recursive.java:36)
//         at Recursive.printEvenOdd(Recursive.java:34)
//         at Recursive.printEvenOdd(Recursive.java:36)
//         at Recursive.printEvenOdd(Recursive.java:34)
//         at Recursive.printEvenOdd(Recursive.java:36)
//         at Recursive.printEvenOdd(Recursive.java:34)
//         at Recursive.main(Recursive.java:17)
