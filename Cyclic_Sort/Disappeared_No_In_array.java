package Cyclic_Sort;

import java.util.ArrayList;
import java.util.List;

public class Disappeared_No_In_array {
    public static void main(String[] args) {
        int []nums={1,0,3,4};
        System.out.println(findDisappearedNumbers(nums));
    }
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        int i = 0;
        while (i < nums.length) {
            if (nums[i] != i + 1 && nums[i] != 0) {
                int correct = nums[i] - 1;
                if (nums[i] != nums[correct]) {
                    changer(nums, i, correct);
                } else {
                    i++;
                }
            } else {
                i++;
            }
        }
        for (int index = 0; index < nums.length; index++) {
            if (nums[index] != index + 1) {
                ans.add(index + 1);
            }
        }
        return ans;
    }
    public static void changer(int[] nums,int i, int correct){
        int temp=nums[i];
        nums[i]=nums[correct];
        nums[correct]=temp;
    }


}