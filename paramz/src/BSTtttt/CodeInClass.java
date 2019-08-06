package BSTtttt;
import java.util.*;

public class CodeInClass
{
	public static void main(String[] args)
	{		pattern(5);	}

	public static void pattern( int n )	{
		if(n>0)		{
			pattern(n-1);
			//n=n-1;
			System.out.println(n);
			System.out.println( drawLine(n) );
		}
	}
	private static String drawLine(int n)	{
		if(n==1) 			return "*";
		else 			return "*" + drawLine(n-1);
	}
}

/*
       *
       **
       ***
       ****
       *****
*/
