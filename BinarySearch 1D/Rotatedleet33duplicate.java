//https://leetcode.com/problems/search-in-rotated-sorted-array/description/
public class Rotatedleet33duplicate {
    public static void main(String[] args) {
        int[]arr={2,2,2,2,7,0,1,2};
        System.out.println(search(arr,0));
    }
    static int search(int[]nums,int target){
        if(pivotfinderduplicates(nums)==-1){
            return binarysearch(nums,target,0,nums.length-1);
        }
        if(nums[pivotfinderduplicates(nums)]==target){
            return pivotfinderduplicates(nums);
        }
        if(target>=nums[0]){ //what if my target is in the position of nums[0] which is the first element in the array
            return binarysearch(nums,target,0, pivotfinderduplicates(nums)-1);
        }
        return binarysearch(nums,target, pivotfinderduplicates(nums)+1,nums.length-1);
    }
    static int binarysearch(int[] arr, int target, int start, int end)
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
    //pivot finder for the duplicates
    static  int pivotfinderduplicates(int[]arr)
    {    //[4,5,6,7,0,1,2]
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start+1)/2;
            if(mid<end&&arr[mid]>arr[mid+1]){
                return mid;
            }
            if(mid>start&&arr[mid-1]>arr[mid]){
                return mid-1;
            }
            if(arr[start]==arr[mid]&&arr[end]==arr[mid]){
                if(arr[start]>arr[start+1]){
                    return start;
                }
                start++;
                if(arr[end]<arr[end-1]){
                    return end;
                }
                end--;
            }
            if(arr[start]<arr[mid]||arr[start]==arr[mid]&&arr[mid]>arr[end]){
                start=mid+1;
            }
            else{
                end=mid-1;
            }


        }
        return -1;
    }
}
