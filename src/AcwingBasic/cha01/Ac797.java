package AcwingBasic.cha01;

import java.util.Scanner;

public class Ac797 {
    static int N = 100002;
    static int[] nums = new int[N];
    static int[] b = new int[N];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            nums[i] = scanner.nextInt();
            b[i] = nums[i] - nums[i - 1];
        }
        //看看b[]
        System.out.println();
        while (m-- > 0) {
            int l = scanner.nextInt();
            int r = scanner.nextInt();
            int c = scanner.nextInt();
            b[l] = b[l] + c;
            b[r + 1] = b[r + 1] - c;
        }
        for (int i = 1;i <=n;i++) {
            b[i] = b[i] + b[i - 1];
            System.out.print(b[i]);
            if (i != n) System.out.print(" ");
        }
    }
}
