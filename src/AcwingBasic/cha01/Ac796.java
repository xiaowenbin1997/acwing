package AcwingBasic.cha01;

import java.util.Scanner;

public class Ac796 {
    static int N = 1001;
    static int[][] matrix = new int[N][N];
    static int[][] sumMat = new int[N][N];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int q = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                sumMat[i][j] = sumMat[i][j - 1] + sumMat[i - 1][j] - sumMat[i - 1][j - 1] + matrix[i][j];
            }
        }
        System.out.println();
        while (q-- > 0) {
            int x1 = scanner.nextInt() ;
            int y1 = scanner.nextInt();
            int x2 = scanner.nextInt();
            int y2 = scanner.nextInt();
            int result = sumMat[x2][y2] - sumMat[x2][y1 - 1] - sumMat[x1 - 1][y2] + sumMat[x1 - 1][y1 - 1];
            System.out.println(result);
        }
    }
}
