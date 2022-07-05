package acwingEveryday;

public class Ac52 {
    public int moreThanHalfNum_Solution(int[] nums) {
        int count = 0;
        int value = 0;
        for (int i = 0;i < nums.length;i++) {
            if (value == nums[i]) {
                count++;
            } else {
                count--;
            }
            if (count == 0) {
                value = nums[i];
            }
        }
        return value;
    }
}
