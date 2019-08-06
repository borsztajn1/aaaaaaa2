package BSTtttt;
//rec
public class uytyyyyy {
 
    public static int rec(int[] sorted2Array, int start, int end, int key) {
         
        if (start < end) {
            int mid = start + (end - start) / 2;  
 if (key < sorted2Array[mid]) { return rec(sorted2Array, start, mid, key);}
 else if (key > sorted2Array[mid]) {return rec(sorted2Array, mid+1, end , key);} else {


     System.out.println(mid+"              111");
 }
        }
        return -(start + 1);

    }
 
    public static void main(String[] args) {
         
        int[] arr1 = {2,45,234,567,876,900,976,999};
        int index = rec(arr1,0,arr1.length,45);
        System.out.println("Found 45 at "+index+" index");
        index = rec(arr1,0,arr1.length,999);
        System.out.println("Found 999 at "+index+" index");
        index = rec(arr1,0,arr1.length,876);
        System.out.println("Found 876 at "+index+" index");
    }
}



//Found 45 at 1 index
//Found 999 at 7 index
//Found 876 at 4 index