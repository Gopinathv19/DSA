public class infinitegeeks {
    public static void main(String[] args) {
        int [] arr={100,200,207,209,301,304,346,400,490,560,900,1000,2000,2004,2300,3000,3006,3400,18000,2749646,4736268,789808090};
        System.out.println(ans(arr, 900));
    }
    public static int ans(int [] arr, int target)
    {
        int start=0;
        int end=1;
        while(target>arr[end])
        {
            int newstart=end+1;
            end=end+(end-start+1)*2;
            start=newstart;
   
        }
        return binarysearchass(arr, target,start,end);       
    }
 
    static int binarysearchass(int[] arr,int target,int start,int end)
    {
 
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
}
