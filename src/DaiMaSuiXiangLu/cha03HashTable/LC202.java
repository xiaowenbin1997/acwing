package DaiMaSuiXiangLu.cha03HashTable;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class LC202 {
    public boolean isHappy(int n) {
        Set<Integer> sumSet = new HashSet<>();
        while (n != 1) {
            int tempSum = getNumSum(n);
            if (sumSet.contains(tempSum)) {
                return false;
            } else {
                sumSet.add(tempSum);
            }
            //更新n
            n = tempSum;
        }
        return true;
    }



    /**
     * @param n 传入n
     * @return 返回n的各个数位平方和
     */
    public static int getNumSum(int n) {
        int sum = 0;
        while (n > 0) {
            int temp = n % 10;
            sum += temp * temp;
            n /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        LC202 lc202 = new LC202();
        lc202.isHappy(input);
    }
}
