package BSTtttt;
import java.util.*;
//http://www.torsten-horn.de/techdocs/java-generics.htm

//http://www.java2s.com/Tutorials/Java/Java_Language/8020__Java_generic_interface.htm

public class enummmo
{
   public static void main( String[] args )
   {
      int i = 42;
      testAllCalculators1( MeinEnum.class, i );
      testAllCalculators2( Arrays.asList( MeinEnum.values() ), i );
   }

   // Variante 1:
   static <T extends Enum<T> & Calculator> void testAllCalculators1( Class<T> calcs, int i )
   {
      for( Calculator c : calcs.getEnumConstants() )
         System.out.println( c + ": " + i + " -> " + c.calculate( i ) );
   }

   // Variante 2:
   static void testAllCalculators2( Collection<? extends Calculator> calcs, int i )
   {
      for( Calculator c : calcs )
         System.out.println( c + ": " + i + " -> " + c.calculate( i ) );
   }
}

interface Calculator
{
   int calculate( int i );
}

enum MeinEnum implements Calculator
{
   ITEM1 { public int calculate( int i ) { /* ... */ return 2 * i; } },
   ITEM2 { public int calculate( int i ) { /* ... */ return 7 * i; } };
}