package AcwingBasic.cha01;

import java.util.Scanner;

public class Ac799 {
    static int N = 100010;
    static int[] nums = new int[N];
    static int[] count = new int[N];
    public static void main(String[] args) {
        int ans = 0;
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0;i < n;i++) {
            nums[i] = scanner.nextInt();
        }
        for (int i = 0,j = 0;i < n;i++) {
            count[nums[i]]++;
            while (count[nums[i]] > 1) {
                count[nums[j]]--;
                j++;
            }
            ans = Math.max(ans,i - j + 1);
        }
        System.out.println(ans);
    }
}
