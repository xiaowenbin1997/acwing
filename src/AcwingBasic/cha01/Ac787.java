package AcwingBasic.cha01;

import java.util.Scanner;

/**
 * 归并排序
 */
public class Ac787 {
    static int N = 100000;
    static int[] nums = new int[N];
    static int[] tmp = new int[N];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        for (int i = 0; i < num; i++) {
            nums[i] = scanner.nextInt();
        }
        mergeSort(nums, 0, num - 1);
        for (int i = 0; i < num; i++) {
            System.out.print(nums[i] + " ");
        }
    }

    private static void mergeSort(int[] nums, int l, int r) {
        if (l>=r)   return;
        int mid = (l + r) >> 1;
        mergeSort(nums, l, mid);
        mergeSort(nums, mid + 1, r);
        int begin = l, i = l, j = mid + 1;
        while (i <= mid && j <= r) {
            if (nums[i] <= nums[j]) {
                tmp[begin++] = nums[i++];
            } else {
                tmp[begin++] = nums[j++];
            }
        }
        while (i <= mid) tmp[begin++] = nums[i++];
        while (j <= r) tmp[begin++] = nums[j++];
        for (int k = l; k <= r;k++) {
            nums[k] = tmp[k];
        }
    }
}
