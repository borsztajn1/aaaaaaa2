package bstt00;

//http://cis-linux2.temple.edu/~lafollet/2168/examp9/BST.java

//class BSTException2 extends Exception{ public BSTException2(String s) 	  {	    super(s);	  }	}

public class fffffff<T extends Comparable<? super T>> 
{
	
	  private Nodet0<T> root;

	  public fffffff()	  {	    this.root = null;	  }
	  public void insert(T datum) throws BSTException{    this.root = recInsert(this.root, datum);	  }

	  private Nodet0<T> recInsert(Nodet0<T> r, T datum) throws BSTException	  {
	    if( r == null) 	    {	      return new Nodet0<T>(datum);	    }
	    else	    {
	      int sign = r.getData().compareTo(datum);
	      if(sign == 0)    {  throw new BSTException("Duplicate Entry " + datum);	      }
	      else if(sign > 0)  {   r.setLeft(recInsert(r.getLeft(), datum));     }
	      else   { r.setRight(recInsert(r.getRight(), datum));    }
	      return r;
	    }
	  }

	  public T lookup(T target)	  {
	    Nodet0<T> where = root;
	    T retval = null;

	    while (where != null && retval == null)
	    {
	      int sign = where.getData().compareTo(target);
	      if (sign == 0) 	        retval = where.getData();
	      else if(sign > 0)	        where = where.getLeft();
	      else	        where = where.getRight();
	    }
	    return retval;
	  }
	 
	  public T delete(T target)	  {	    //to be written
	    return target;	  }

	  public String toString()	  {
	    String retval = "";
	    return recToString(root, retval);
	  }

	  public String recToString(Nodet0<T> r, String retval)	  {
	    if (r == null)	    {	      return retval + "null" + "\n";	    }
	    else	    {
	      retval += r.getData() + "\n";
	      retval = recToString(r.getLeft(), retval);
	      retval = recToString(r.getRight(), retval);
	    }
	    return retval;
	  }

	  public static void main(String args[]) throws BSTException	  {
	    fffffff<Integer> ibst = new fffffff<Integer>();

	    ibst.insert(50);
	    ibst.insert(20);
	    ibst.insert(30);
	    ibst.insert(10);
	    ibst.insert(70);
	    ibst.insert(60);
	    ibst.insert(80);
	    
	    System.out.println(ibst);
	    //System.out.println();
	    //System.out.println();
	    System.out.println(ibst.lookup(60));
	    System.out.println(ibst.lookup(25));
	   
	  }
	}