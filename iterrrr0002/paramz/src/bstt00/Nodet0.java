package bstt00;
public class Nodet0<T extends Comparable<? super T>>
{
  private T data;
  private Nodet0<T> left;
  private Nodet0<T> right; 

  public Nodet0(T data, Nodet0<T> left, Nodet0<T> right)
  {
    this.data = data;
    this.left = left;
    this.right = right;
  }

  public Nodet0(T data)  {    this(data, null, null);  }
  public T getData()   {    return this.data;  }
  public Nodet0<T> getLeft()  {    return this.left;  }
  public Nodet0<T> getRight()  {    return this.right;  }
  public void setLeft(Nodet0<T> left)  {    this.left = left;  }
  public void setRight(Nodet0<T> r)  {    this.right = r;  }
}