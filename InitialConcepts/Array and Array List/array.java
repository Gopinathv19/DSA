 

import java.util.Arrays;
import java.util.Scanner;

public class array
{
   public static void main(String[] args) 
   {
   try (//Array declaration 
   // This data type basically represents what data inside in the array
   // Arrays are homogeneous
   // Mention the size
   // Heap object are not continious
   // Dyanamic memory allocation
   // May not be Continious
   // Null basically means it doesnt have any data type
   // Null cant ne assigned to primittive data type
Scanner in = new Scanner(System.in)) {
    int[] arr={1,2,3,4,5};
       System.out.println(Arrays.toString(arr));
       String[] name=new String[5];
       for(int i=0;i<arr.length;i++)
       {
         name[i]=in.next();
       }
       System.out.println(Arrays.toString(name));
}
   
   }
   
}