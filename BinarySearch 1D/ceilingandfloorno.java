public class ceilingandfloorno {
    public static void main(String[] args) 
    {
        int[] arr={2,4,6,8,10,12,14,16};
        int target=9;
        System.out.println(ceiling(arr,target));
        System.out.println(floor(arr,target));
    } 
    static int ceiling(int[] arr,int target)
    {
        int start=0;
        int end=arr.length-1;
        if(target>arr[arr.length-1])
        {
            return -1;
        }
        while(start<=end)
        {   int mid=start+(end-start)/2;
            if(target>arr[mid])
            {
                start=mid+1;
            }
            else if (target<arr[mid])
            {
                end=mid-1;
            }
        
        }
        return start;
    }
    static int floor(int[] arr,int target)
    {
        int start=0;
        int end=arr.length-1;
        
        if(target>arr[arr.length-1])
        {
            return -1;
        }
        while(start<=end)
        {   int mid=start+(end-start)/2;
            if(target>arr[mid])
            {
                start=mid+1;
            }
            else if (target<arr[mid])
            {
                end=mid-1;
            }
        
        }
        return end;
    }

}
