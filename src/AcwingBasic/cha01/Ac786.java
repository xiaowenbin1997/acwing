package AcwingBasic.cha01;

import java.util.Scanner;

/**
 * 第k个数
 */
public class Ac786 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] arrs = new int[n];
        for (int i = 0; i < n; i++) {
            arrs[i] = scanner.nextInt();
        }
        quickSort(arrs, 0, n - 1);
        System.out.println(arrs[k - 1]);
    }

    private static void quickSort(int[] arrs, int l, int r) {
        if (l >= r) return;
        int mid = (l + r) >> 1;
        int x = arrs[mid];
        int i = l - 1, j = r + 1;
        while (i < j) {
            do {
                i++;
            } while (arrs[i] < x);
            do {
                j--;
            } while (arrs[j] > x);
            if (i < j) {
                int tmp = arrs[i];
                arrs[i] = arrs[j];
                arrs[j] = tmp;
            }
        }
        quickSort(arrs, l, j);
        quickSort(arrs, j + 1, r);
    }
}
