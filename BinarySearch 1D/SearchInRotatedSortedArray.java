//https://leetcode.com/problems/search-in-rotated-sorted-array/description/
public class SearchInRotatedSortedArray {
    public static void main(String[] args) {
        int[]arr={4,5,6,7,0,1,2};
        System.out.println(search(arr,7));
    }
    static int search(int[]nums,int target){
        if(pivotfinder(nums)==-1){
            return binarysearch(nums,target,0,nums.length-1);
        }
        if(nums[pivotfinder(nums)]==target){
            return pivotfinder(nums);
        }
        if(target>=nums[0]){ //what if my target is in the position of nums[0] which is the first element in the array
            return binarysearch(nums,target,0,pivotfinder(nums)-1);
        }
        return binarysearch(nums,target,pivotfinder(nums)+1,nums.length-1);
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
    static  int pivotfinder(int[]arr)
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
            if(arr[start]>=arr[mid]){
                end=mid-1;
            }
            else{
                start=mid+1;
            }

        }
        return -1;
    }
}
