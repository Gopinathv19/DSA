package Cyclic_Sort;
//https://leetcode.com/problems/missing-number/description/
public class find_The_missing_No {
    public static void main(String[] args) {
        int[] nums={3,0,1};
        System.out.println(missingNumber(nums));
    }
    public static  int missingNumber(int[] nums) {

        int i=0;
        while(i<nums.length){
            int correct=nums[i];
            if(nums[i]<nums.length&&nums[i]!=nums[correct]){
                swapper(nums,i,correct);
            }
            else{
                i++;
            }
        }
        for(int index=0;index<nums.length;index++){
            if(nums[index]!=index){
                return index;
            }
 
        }
        return nums.length;
    }
    static void swapper(int[] nums,int i, int correct){
        int temp=nums[i];
        nums[i]=nums[correct];
        nums[correct]=temp;
    }
}
