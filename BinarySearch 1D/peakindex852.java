public class peakindex852
{
    public static void main(String[] args) 
    {
        int [] arr ={10,19,23,45,12,16,17};
        System.out.println(mountain(arr));
    }
   public  static int  mountain(int []arr)
    {
       int start =0;
       int end=arr.length-1;
       while(start<end)
       {
        int mid =start+(end-start)/2;
        if(arr[mid]>arr[mid+1])
        {
            end = mid;
        }
        else
        {
            start=mid+1;
        }
       }
       return start;
    }
}