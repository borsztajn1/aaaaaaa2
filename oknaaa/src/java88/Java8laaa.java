package java88;

import java.util.*;
import java.util.List;

public class Java8laaa {
	

		private	static	double	sumStream(List<Integer>	list)	{
			int wiekszeNIZ=2;
			return	list.stream().filter(i->i>wiekszeNIZ).mapToInt(i->i).sum();		}

		public static void main(String args[]){
		
			ArrayList<Integer> aa1=new ArrayList<Integer>();
			for (int axx=0;axx<200;axx++) {			aa1.add(11);}
			double rr=sumStream(aa1);
			System.out.println(rr);
			
			Java8laaa tester = new Java8laaa();
			
		   List<String> pets=Arrays.asList("aaa","bbb","yyyy");
		   pets.stream().forEach(System.out::println);
				  //s->System.out.println(s);
				   
	      //with type declaration
	      MathOperation addition = (int a, int b) -> a + b;
			
	      //with out type declaration
	      MathOperation subtraction = (a, b) -> a - b;
			
	      //with return statement along with curly braces
	      MathOperation multiplication = (int a, int b) -> { return a * b; };
			
	      //without return statement and without curly braces
	      MathOperation division = (int a, int b) -> a / b;
			
	      System.out.println("10 + 5 = " + tester.operate(10, 5, addition));
	      System.out.println("10 - 5 = " + tester.operate(10, 5, subtraction));
	      System.out.println("10 x 5 = " + tester.operate(10, 5, multiplication));
	      System.out.println("10 / 5 = " + tester.operate(10, 5, division));
//			
	      //without parenthesis
	      GreetingService greetService1 = message ->
	      System.out.println("Hello " + message);
			
	      //with parenthesis
	      GreetingService greetService2 = (message) ->
	      System.out.println("Hello " + message);
			
	      greetService1.sayMessage("Mahesh");
	      greetService2.sayMessage("Suresh");
	   }
//WYNIK:
//	10 + 5 = 15
//	10 - 5 = 5
//	10 x 5 = 50
//	10 / 5 = 2
//	Hello Mahesh
//	Hello Suresh
	   interface MathOperation {
	      int operation(int a, int b);
	   }
		
	   interface GreetingService {
	      void sayMessage(String message);
	   }
		
	   private int operate(int a, int b, MathOperation mathOperation){
	      return mathOperation.operation(a, b);
	   }
	}
