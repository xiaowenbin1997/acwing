package DaiMaSuiXiangLu;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 最大连续递增子序列的优化
 */
public class LC674 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int[] a = new int[length];
        String[] split = scanner.next().split(",");
        for (int i = 0; i < length; i++) {
            a[i] = Integer.valueOf(split[i]);
        }
        int lengthOfLCIS = findLengthOfLCIS(a);
        System.out.println(lengthOfLCIS);
    }

    public static int findLengthOfLCIS(int[] nums) {
        int result = 1;
        int[] dp = new int[nums.length];
        Arrays.fill(dp, 1);
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i + 1] > nums[i]) {
                dp[i + 1] = dp[i] + 1;
            }
            if (dp[i + 1] > result) result = dp[i + 1];
        }
        return result;
    }
}
