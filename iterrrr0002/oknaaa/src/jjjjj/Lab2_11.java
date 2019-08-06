package jjjjj;
import javax.swing.*;
import java.util.*;
public class Lab2_11
 {
public static void main(String[] args)
 {
int duzy = 0x7fffffff; // maksymalna wartoœæ int
int wiekszy = duzy * 2;
 String s = "duzy = " + duzy + "\n";
 s += "wiekszy = " + wiekszy + "\n";
 JOptionPane.showMessageDialog(null,s);
 /* Podczas kompilacji zg³aszany jest b³
¹d przepe³nienia dla liczb rzeczywistych
float wielki = 3.4E+38; // maksymalna wartoœæ float
 System.out.println("wielki = " + wielki);
int jeszcze_wiekszy= wielki * 4;
 System.out.println (" jeszcze_wiekszy = " + jeszcze_wiekszy);
 */
 System.exit(0);
 }
} 