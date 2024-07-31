
//https://leetcode.com/problems/find-the-duplicate-number/description/
package Cyclic_Sort;

public class Return_Duplicate_Element {

    public static void main(String[] args) {
        int[] nums = {0, 1, 2, 3, 4, 4};
        System.out.println(findDuplicate(nums));
    }

    public static int findDuplicate(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            if (nums[i] != i + 1) {
                if (nums[i] != 0 && nums[i] != nums[nums[i] - 1]) {
                    changer(nums, i, nums[i] - 1);
                } else if (nums[i] != 0) {
                    return nums[i];
                } else {
                    i++;
                }
            } else {
                i++;
            }
        }
        return -1;
    }

    private static void changer(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
