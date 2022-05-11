package acwingEveryday;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ac22 {
    public int findMin(int[] nums) {
        if (nums.length == 0) return -1;
        int right = nums.length - 1;
        while (nums[right] == nums[0]) {
            right--;
        }
        int left = 0;
        if (nums[right] > nums[0])  return nums[0];
        while (left < right) {
            int mid = (left + right) >> 1;
            if (nums[mid] >= nums[0])    left = mid + 1;
            else    right = mid;
        }
        return nums[left];
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String[] split = str.split(", ");
        int[] nums = new int[split.length];
        for (int i = 0;i < split.length;i++) {
            nums[i] = Integer.parseInt(split[i]);
        }
        Ac22 ac22 = new Ac22();
        int min = ac22.findMin(nums);
        System.out.println("min = " + min);
    }
}
