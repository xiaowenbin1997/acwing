package acwingEveryday;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 给定一个长度为 n+1 的数组nums，数组中所有的数均在 1∼n 的范围内，其中 n≥1。
 *
 * 请找出数组中任意一个重复的数，但不能修改输入的数组。
 * 法一就是上一题的法一，这里主要实现法二，利用二分法实现找重复的数
 */
public class Ac14 {
    public static int duplicateInArray(int[] nums) {
        int left = 1;
        int right = nums.length - 1;
        while (left < right) {
            int mid = left + ((right - left) >> 1);//就是一个中间值
            int count = 0;
            for (int i = 0;i < nums.length;i++) {
                if (nums[i] >= left && nums[i] <= mid) {
                    count++;
                }
            }
            if (count > mid - left + 1) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String[] splits = str.split(", ");
        int[] nums = new int[splits.length];
        for (int i = 0;i < nums.length;i++) {
            nums[i] = Integer.parseInt(splits[i]);
        }
        int result = duplicateInArray(nums);
        System.out.println(result);
    }
}
