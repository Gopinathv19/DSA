/* Why Binary search
// Find the number of such comparisons in worst case
//////////////////////////////////////////////////////////////////////////////
//[1,2,3,4,5,6,7,8,9]
// search element is 8 
// search reduces to f+l/2=mid=8/2=4 
// mid =4 which is "5" target element = 8
// 89 is greather than 5 now search array becomes start =mid+1 then [6,7,8,9]
// now mid = 3 which is 9 where 8 is lower than 9 now end=mid-1
// now search array becomes[6,7,8]
// now mid =1 which is seven where 7 is lower than 8 then start=mid+1
//search array[8] where mid =0 which is the search element
//*********************************************************
  Program to find order agnostic array means it can be either asscending or descending order */
import java.util.Arrays;
import java.util.Scanner;
public class Binarysearch
{
     public static void main(String[] args) {
        int [] arr1={-87,-76,-68,0,22,34,67,89,93,102};
        int[]  arr2={102,101,97,85,67,53,49,32,23,11,0};
        int target;
        Scanner in = new Scanner(System.in);
        System.out.println(Arrays.toString(arr1)+" Enter the element to find::");
        target=in.nextInt();
        binarysearch(arr2, target); 
        System.out.println(Arrays.toString(arr2)+"Enter the element:");
        target=in.nextInt();
        binarysearch(arr1,target);
        in.close();
        
    }    
         
     static void binarysearch(int[] any, int target)
     {
          if(any[0]>any[any.length-1])
          {
            System.out.println(binarysearchdsce(any,target));
          }
          else{
            System.out.println(binarysearchass(any, target));
          }
     }
     static int binarysearchass(int[] arr,int target)
     {
        int start=0;
        int end= arr.length-1;
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            if(target<arr[mid])
            {
                end=mid-1;
            }
            else if(target>arr[mid])
            {
                start=mid+1;
            }
            else
            {
                return mid;
            }
        }
        return -1;
         
    }
    static int binarysearchdsce(int[] arr,int target)
     {
        int start=0;
        int end= arr.length-1;
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            if(target<arr[mid])
            {
                start=mid+1;
            }
            else if(target>arr[mid])
            {
                end=mid-1;
            }
            else
            {
                return mid;
            }
        }
        return -1;
         
    }
}      
