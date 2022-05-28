package dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 有 N 件物品和一个容量是 V 的背包。每件物品只能使用一次。
 *
 * 第 i 件物品的体积是 vi，价值是 wi。
 *
 * 求解将哪些物品装入背包，可使这些物品的总体积不超过背包容量，且总价值最大。
 * 输出最大价值。
 *
 * 输入格式
 * 第一行两个整数，N，V，用空格隔开，分别表示物品数量和背包容积。
 *
 * 接下来有 N 行，每行两个整数 vi,wi，用空格隔开，分别表示第 i 件物品的体积和价值。
 */
public class Ac2 {
    static final int N = 1010;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        String[] s1 = s.split(" ");
        int n = Integer.parseInt(s1[0]);
        int v = Integer.parseInt(s1[1]);
        int[] vols = new int[N];
        int[] weis = new int[N];
        for (int i = 0;i < n;i++) {
            String temp = br.readLine();
            String[] tempS = temp.split(" ");
            vols[i] = Integer.parseInt(tempS[0]);
            weis[i] = Integer.parseInt(tempS[1]);
        }
        int f[][] = new int[N][N];
        f[0][0] = 0;
        for (int i = 1;i <= n;i++) {
            for (int j = 0; j <= v;j++) {
                f[i][j] = f[i - 1][j];
                if (j >= vols[i]) {
                    f[i][j] = Math.max(f[i][j],f[i - 1][j - vols[i]] + weis[i]);
                }
            }
        }
        int res = 0;
        for (int i =0;i <= v;i++)   res = Math.max(res,f[n][i]);
        System.out.println(res);
    }
}
