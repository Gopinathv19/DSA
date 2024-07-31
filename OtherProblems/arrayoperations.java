 
import java.util.*;
public class arrayoperations 
{
 
    public static void main(String[] args) 
    { 
    int[] arr={1,2,3,4,5,6};
    arrayoperations.swap(arr,0,5);
    arrayoperations.reverseentire(arr,0,arr.length-1);
    System.out.println(Arrays.toString(arr));
    
    }
   
    static void swap(int[] arr,int start,int end)
    {
        int temp=arr[start];
        arr[start]= arr[end];
        arr[end]=temp;
    }
    static void reverseentire(int[] arr,int start,int end)
    {
        while(start<end)
        {
            arrayoperations.swap(arr,start,end);
            start++;
            end--;
        }
    }
    
}
