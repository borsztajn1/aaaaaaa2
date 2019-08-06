package petlee;

int loopVal = 0;

while ( loopVal < 5) {
System.out.println("Printing Some Text");
loopVal++;
}int loopVal = 0;

do {
System.out.println("Printing Some Text");
loopVal++;
}
while ( loopVal < 5 );
class WhileLoopExample3 {
    public static void main(String args[]){
         int arr[4]={2,11,45,9};
         //i starts with 0 as array index starts with 0 too
         int i=0;
         while(i<4){
              System.out.println(arr[i]);
              i++;
         }
    }
}

class WhileLoopExample2 {
    public static void main(String args[]){
         int i=10
         while(i>1)
         {
             System.out.println(i);
              i++;
         }
    }
}