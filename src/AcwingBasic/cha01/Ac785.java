package AcwingBasic.cha01;

import java.io.IOException;
import java.util.Scanner;

/**
 * 快速排序
 */
public class Ac785 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int[] nums = new int[num];
        for (int i = 0; i < num;i++) {
            nums[i] = scanner.nextInt();
        }
        quickSort(nums, 0, nums.length - 1);
        for (int i = 0; i < nums.length;i++) {
            System.out.print(nums[i] + " ");
        }
    }

    private static void quickSort(int[] nums, int l, int r) {
        if (l >= r) return;
        int x = nums[l], i = l - 1, j = r + 1;
        while (i < j) {
            do {
                i++;
            } while (nums[i] < x);
            do {
                j--;
            } while (nums[j] > x);
            if (i < j) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
        }
        quickSort(nums, l, j);
        quickSort(nums, j + 1, r);
    }
}
