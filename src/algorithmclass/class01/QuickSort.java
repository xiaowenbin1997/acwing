package algorithmclass.class01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class QuickSort {
    private static void quicksort(int[] nums,int l,int r) {
        if (l >= r) {
            return;
        }
        int x = nums[l],i = l,j = r;
        while (i < j) {
            while (nums[i] <= x) {
                i++;
            }
            while (nums[j] > x) {
                j--;
            }
            if (i < j) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
                j--;
            }
        }
        quicksort(nums,l,i - 1);
        quicksort(nums,j + 1, r);
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int totalNum = Integer.parseInt(br.readLine());
        int[] nums = new int[totalNum];
        String[] strings = br.readLine().split(" ");
        for (int i = 0;i < totalNum;i++) {
            nums[i] = Integer.parseInt(strings[i]);
        }
        quicksort(nums,0,totalNum - 1);
        for (int i = 0;i < totalNum;i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
