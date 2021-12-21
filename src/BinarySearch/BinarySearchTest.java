package BinarySearch;

import java.util.Scanner;

public class BinarySearchTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] nums = new int[5];
        for (int i = 0;i < 5;i++) {
            nums[i] = scanner.nextInt();
        }
        int key = scanner.nextInt();
        System.out.println(binarySearch(key,nums));
    }
    public static int binarySearch(int key,int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (key == nums[mid]) {
                return mid;
            } else if (key < nums[mid]) {
                right = mid - 1;
            } else if (key > nums[mid]) {
                left = mid + 1;
            }
        }
        return -1;
    }
}
