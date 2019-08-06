package BSTtttt;
import java.util.*;
import java.util.concurrent.atomic.AtomicLong;

public class llllljjjl
{
   public static void main( String[] args )
   {
      List<AtomicLongComparable> lngLst = new ArrayList<AtomicLongComparable>();
      lngLst.add( new AtomicLongComparable() );
      lngLst.add( new AtomicLongComparable( 99 ) );
      lngLst.add( new AtomicLongComparable( 42 ) );

      System.out.println( findeMaximumMitWildcards(  lngLst ) ); // funktioniert
      //System.out.println( findeMaximumOhneWildcards( lngLst ) ); // <-- Kompilierfehler
   }

   // Verbesserte Version mit Wildcards:
   static <T extends Comparable<? super T>> T findeMaximumMitWildcards( List<? extends T> list )
   {
      T result = list.get( 0 );
      for( T t : list )
         if( t.compareTo( result ) > 0 ) result = t;
      return result;
   }

   // Urspruengliche Version ohne Wildcards:
   static <T extends Comparable<T>> T findeMaximumOhneWildcards( List<T> list )
   {
      T result = list.get( 0 );
      for( T t : list )
         if( t.compareTo( result ) > 0 ) result = t;
      return result;
   }
}

class AtomicLongComparable extends AtomicLong implements Comparable<AtomicLong>
{
   private static final long serialVersionUID = 0L;

   public AtomicLongComparable() { super(); }
   public AtomicLongComparable( long lng ) { super( lng ); }

   @Override public int compareTo( AtomicLong o )
   {
      return ( o == null || get() > o.get() ) ? 1 : ( get() < o.get() ) ? -1 : 0;
   }
}

// WYNIKKKKKKKKKKK 99
