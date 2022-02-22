package algorithmclass.class01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Code08_GetMax {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int[] nums = new int[num];
        String[] strs = br.readLine().split(" ");
        for (int i = 0; i < strs.length; i++) {
            nums[i] = Integer.parseInt(strs[i]);
        }
        getMax(nums,0,nums.length - 1);
    }
    private static int getMax(int[] arr,int left,int right) {
        if (left == right) {
            return arr[left];
        }
        int mid = left + ((right - left) >> 2);
        int leftMax = getMax(arr,left,mid);
        int rightMax = getMax(arr,mid + 1,right);
        return Math.max(leftMax,rightMax);
    }
}
