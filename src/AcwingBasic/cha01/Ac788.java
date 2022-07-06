package AcwingBasic.cha01;

import java.util.Scanner;

public class Ac788 {
    static int N = 100000;
    static int[] tmp = new int[N];
    static int[] arrs = new int[N];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            arrs[i] = scanner.nextInt();
        }
        long count = mergeSort(arrs, 0, n - 1);
        System.out.println(count);
//        for (int i = 0; i < n; i++) {
//            System.out.print(arrs[i] + " ");
//        }
    }

    private static long mergeSort(int[] arrs, int l, int r) {
        if (l >= r) return 0;
        int mid = (l + r) >> 1;
        long count = mergeSort(arrs, l, mid) + mergeSort(arrs, mid + 1, r);
        int begin = l, i = l, j = mid + 1;
        while (i <= mid && j <= r) {
            if (arrs[i] <= arrs[j]) {
                tmp[begin++] = arrs[i++];
            } else {
                count = count + mid - i + 1;
                tmp[begin++] = arrs[j++];
            }
        }
        while (i <= mid) tmp[begin++] = arrs[i++];
        while (j <= r) tmp[begin++] = arrs[j++];
        for (int k = l; k <= r; k++) {
            arrs[k] = tmp[k];
        }
        return count;
    }
}
