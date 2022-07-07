package AcwingBasic.cha01;

import java.util.Scanner;

/**
 * 数组元素的目标和
 */
public class Ac800 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int x = scanner.nextInt();
        int[] a = new int[n];
        int[] b = new int[m];
        for (int i = 0;i < n;i++) {
            a[i] = scanner.nextInt();
        }
        for (int i = 0;i < m;i++) {
            b[i] = scanner.nextInt();
        }
        int i = 0,j = m - 1;
        for (;i < n;i++) {
            while (a[i] + b[j] > x) {
                j--;
            }
            if (a[i] + b[j] == x)   break;
        }
        System.out.println(i + " " + j);
    }
}
