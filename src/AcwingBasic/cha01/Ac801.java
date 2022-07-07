package AcwingBasic.cha01;

import java.util.Scanner;

/**
 * 二进制中1的个数
 */
public class Ac801 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        while (n-- > 0) {
            int tmp = scanner.nextInt();
            int count = 0;
            int i = 0;
            while ((tmp >> i) > 0) {
                if (((tmp >> i) & 1) == 1) {
                    count++;
                }
                i++;
            }
            System.out.print(count + " ");
        }
    }
}
