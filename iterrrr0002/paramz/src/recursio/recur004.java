package recursio;
/** 
 * A program to solve the towers of Hanoi puzzle
 * @author         Edo Biagioni
 * @lecture        ICS 211 March 8 (or later)
 * @date           March 3, 2011
 */

import javax.swing.*;
import java.util.*;
import java.awt.*;
import java.awt.event.*;

public class recur004 {

 public recur004() {
   super();
 }

 public static String toString(int[] t1, String t1name, int[] t2, String t2name, int[] t3, String t3name) {
   String result = t1name + ": ";
   for (int index = 0; index < t1.length && t1[index] != 0; index++) { result += t1[index] + ", ";  }
   result += t2name + ": ";
   for (int index = 0; index < t2.length && t2[index] != 0; index++) { result += t2[index] + ", ";   }
   result += t3name + ": ";
   for (int index = 0; index < t3.length && t3[index] != 0; index++) { result += t3[index] + ", ";   }
   return result;
 }

 /* @throws ArrayOutOfBoundsException if t1 does not have any
  *         disks or if t2 has no room.
  */
 private static void moveTop(int[] t1, String t1name,
                             int[] t2, String t2name) {
   int diskIndex1 = t1.length - 1;
   while (t1[diskIndex1] == 0) {  // may throw exception
     diskIndex1--;
   }
   int move = t1[diskIndex1];
   int diskIndex2 = 0;
   int smallest = -1;
   while (t2[diskIndex2] != 0) {  // may throw exception
     smallest = t2[diskIndex2];
     diskIndex2++;
   }
   if ((smallest != -1) && (smallest <= move)) {
     System.out.println("illegal move of disk of size " + move +
                        " onto disk of size " + smallest);
   }
   // at this point, t1[diskIndex1] == move != 0 and t2[diskIndex2] == 0
   System.out.println("moving disk of size " + move +
                      " from " + t1name + " to " + t2name);
   t2[diskIndex2] = t1[diskIndex1];
   t1[diskIndex1] = 0;
 }

 /* move n disks from tower 1 to tower2 using tower3 if necessary
  * @param the disk sizes on the first tower
  * @param the disk sizes on the second tower
  * @param the disk sizes on the third tower
  * @result the new disk sizes in the parameter arrays
  * @prints the moves to make
  */
 public static void solveTowers(int n, int[] t1, String t1name, int[] t2,
                                String t2name, int[] t3, String t3name) {
   /* System.out.println("at start of solveTowers: " +
                      toString(t1, t1name, t2, t2name, t3, t3name)); */
   if (n == 1) {
     moveTop(t1, t1name, t2, t2name);
   } else {
     // move the n-1 disks from t1 to t3 using t2
     solveTowers(n - 1, t1, t1name, t3, t3name, t2, t2name);
     // move the nth disk from t1 to t2
     moveTop(t1, t1name, t2, t2name);
     // move the n-1 disks from t3 to t2 using t1
     solveTowers(n - 1, t3, t3name, t2, t2name, t1, t1name);
   }
   /* System.out.println("at end of solveTowers: " +
                      toString(t1, t1name, t2, t2name, t3, t3name)); */
 }

 /** 
   * unit test method -- run the towers of hanoi program
   * @param one parameter specifies the number of disks
   */
 public static void main (String [] arguments) {
   int disks = 8;
   if (arguments.length == 1) {
     Integer arg = new Integer(arguments[0]);
     disks = arg;
   }
   int[] tower1 = new int[disks];
   int[] tower2 = new int[disks];
   int[] tower3 = new int[disks];
   for (int i = 0; i < disks; i++) {
     tower1[i] = disks - i;  // diameter of the disk
     tower2[i] = 0;          // no disk
     tower3[i] = 0;          // no disk
   }
   // move from tower1 to tower2 using tower3 as a spare
   solveTowers(disks, tower1, "tower1", tower2, "tower2", tower3, "tower3"); 
 }

}
