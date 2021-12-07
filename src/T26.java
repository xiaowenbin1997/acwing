import java.util.Scanner;

/**
 * 输入可正可负
 * 思路1：
 * 输入一个 32 位整数，输出该数二进制表示中 1 的个数。
 */
public class T26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] binary = new int[32];
        binary = ten2two(n,32);
        for (int i = 0;i < binary.length;i++) {
            System.out.print(binary[i]);
        }
    }
    /**
     * @param n 输入的数
     * @return 返回1的个数
     */
    public int NumberOf1(int n) {
        int count = 0;
        int[] binary = new int[32];
        binary = ten2two(n,32);
        for (int i = 0;i < binary.length;i++) {
            if (binary[i] == 1){
                count++;
            }
        }
        return count;
    }

    /**
     * @param length 返回的二进制数长度
     * @param num 输入的十进制数
     * @return  返回十进制转二进制的数
     */
    public static int[] ten2two(int num,int length) {
        int[] retBinary = new int[length];
        int numPos = num > 0 ? num : -num;
        while (numPos > 0){
            retBinary[length - 1] = numPos % 2;
            numPos = numPos / 2;
            length--;
        }
        if (num >= 0) {
            return retBinary;
        }
        //负数取补码开始了
        retBinary[0] = 1;
        for (int i = 1;i < length;i++) {
            if (retBinary[i] == 0) {
                retBinary[i] = 1;
            }
            if (retBinary[i] == 1) {
                retBinary[i] = 0;
            }
        }
        //末位加1，carry是进位数
        retBinary[length - 1] = (retBinary[length - 1] + 1) % 2;
        int carry = (retBinary[length - 1] + 1) / 2;
        for (int i = 1;i < length - 1;i++) {
            retBinary[length - 1 - i] = (retBinary[length - 1 - i] + carry) % 2;
            carry = (retBinary[length - 1 - i] + carry) / 2;
        }
        return retBinary;
    }
}
