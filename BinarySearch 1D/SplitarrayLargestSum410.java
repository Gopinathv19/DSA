//https://leetcode.com/problems/split-array-largest-sum/
public class SplitarrayLargestSum410 {
    public static void main(String[] args) {
        int[] nums={7,2,5,10,8};
        System.out.println(splitArray(nums,2));
    }
     static int splitArray(int[] nums, int k) {
        int start=0;
        int end=0;
        for(int i:nums){
            start=Math.max(start,i);
            end+=i;
        }
        while(start<end){
            int mid=start+(end-start)/2;
            int sum=0;
            int pieces=1;
            for(int i:nums){
                if(sum+i>mid){
                    sum=i;
                    pieces++;
                }
                else{
                    sum+=i;
                }
            }
            if(pieces>k){
                start=mid+1;
            }
            else{
                end=mid;
            }
        }
        return end;


    }


}
