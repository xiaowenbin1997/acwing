package AcwingBasic.cha01;

import java.util.Scanner;

/**
 * 前缀和
 * 输入一个长度为 n 的整数序列。
 * <p>
 * 接下来再输入 m 个询问，每个询问输入一对 l,r。
 * <p>
 * 对于每个询问，输出原序列中从第 l 个数到第 r 个数的和。
 * <p>
 * 输入格式
 * 第一行包含两个整数 n 和 m。
 * <p>
 * 第二行包含 n 个整数，表示整数数列。
 * <p>
 * 接下来 m 行，每行包含两个整数 l 和 r，表示一个询问的区间范围。
 * <p>
 * 输出格式
 * 共 m 行，每行输出一个询问的结果。
 */
public class Ac795 {
    static int N = 100010;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //数组长度
        int n = scanner.nextInt();
        //询问次数
        int m = scanner.nextInt();
        int[] nums = new int[N];
        for (int i = 1; i <= n; i++) {
            nums[i] = scanner.nextInt();
        }
        int[] sum = new int[N];
        sum[0] = 0;
        for (int i = 1; i <= n; i++) {
            sum[i] = sum[i - 1] + nums[i];
        }
        //查看sum值
        System.out.println(sum);
        while (m-- > 0) {
            int tmpA = scanner.nextInt();
            int tmpB = scanner.nextInt();
            System.out.println(sum[tmpB] - sum[tmpA - 1]);
        }
    }
}
