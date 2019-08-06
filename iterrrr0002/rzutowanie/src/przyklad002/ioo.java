package przyklad002;

//public class ioo{
//	  public static void main(String[] args){
//	    System.out.print("Hello World");
//	  }

public class ioo{
	public static void main(String[] args){
		 ioo rr=new ioo();
		System.out.println(rr.getAtrybut01());
		}
	
 private String atrybut01;

public String getAtrybut01(){
 return atrybut01="11";
}
public void setAtrybut01(String atrybut01){
  this.atrybut01=atrybut01;
  atrybut01="111";    //ta linia bedzie olana, nie pojawi sie zadne 111
}


}
