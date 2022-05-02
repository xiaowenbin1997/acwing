package acwingEveryday;

/**
 * 13. 找出数组中重复的数字
 * 给定一个长度为 n 的整数数组 nums，数组中所有的数字都在 0∼n−1 的范围内。
 *
 * 数组中某些数字是重复的，但不知道有几个数字重复了，也不知道每个数字重复了几次。
 *
 * 请找出数组中任意一个重复的数字。
 */
public class Ac13 {
    public int duplicateInArray(int[] nums) {
        if (nums.length == 0) {
            return -1;
        }
        int[] countNums = new int[nums.length];
        int result = -1;
        for (int i = 0;i < nums.length;i++) {
            if (nums[i] >= nums.length || nums[i] < 0) {
                return -1;
            }
            countNums[nums[i]] ++;
            if (countNums[nums[i]] > 1) {
                result = nums[i];
            }
        }
        return result;
    }
    public int duplicateInArray1(int[] nums) {
        for (int num : nums) {
            if (num < 0 || num >= nums.length) {
                return -1;
            }
        }
        for (int i = 0;i < nums.length;i++) {
            while (i != nums[i] && nums[nums[i]] != nums[i]) swap(nums,i, nums[i]);
            if (i != nums[i] && nums[i] == nums[nums[i]]) return nums[i];
        }
        return -1;
    }
    private void swap(int[] nums,int i,int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
