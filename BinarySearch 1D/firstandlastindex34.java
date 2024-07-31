import java.util.Arrays;

public class firstandlastindex34 {
    public static void main(String[] args) {
        int[] ans={-1,-1};
        int[] arr={90,100,100,100,101,189,200,200,300};
        ans[0]=firstlast(arr, 100, true);
        ans[1]=firstlast(arr, 100, false);
        System.out.println(Arrays.toString(ans));


    }
    public static int  firstlast(int[] arr, int target, boolean value)
    {
        int ans=-1;
        int start=0;
        int end=arr.length-1;
        while (start<=end) {
            int mid =start+(end-start)/2;
            if(arr[mid]>target)
            {
                end=mid-1;
            }
            else if(arr[mid]<target)
            {
                start=mid+1;
            }
            else{
                ans=mid;
                // may be this could be a answer 
                if(value)
                {
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
            }
            
        }
        return ans;
    }
}
