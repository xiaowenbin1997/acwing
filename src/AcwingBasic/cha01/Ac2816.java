package AcwingBasic.cha01;

import java.util.Scanner;

/**
 * 判断子序列
 */
public class Ac2816 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] a = new int[n];
        int[] b = new int[m];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        for (int j = 0; j < m; j++) {
            b[j] = scanner.nextInt();
        }
        int i = 0,j = 0;
        while (i < n && j < m) {
            if (a[i] == b[j])   i++;
            j++;
        }
        if (i == n) System.out.println("Yes");
        else System.out.println("No");
    }
}
