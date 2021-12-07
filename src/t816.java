import java.util.Scanner;

/**
 * 给定一个长度为 n 的数组 a 和一个整数 size，请你编写一个函数，void reverse(int a[], int size)，实现将数组 a 中的前 size 个数翻转。
 *
 * 输出翻转后的数组 a。
 *
 * 输入格式
 * 第一行包含两个整数 n 和 size。
 *
 * 第二行包含 n 个整数，表示数组 a。
 *
 * 输出格式
 * 共一行，包含 n 个整数，表示翻转后的数组 a。
 */
public class t816 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int length = scan.nextInt();
        int size = scan.nextInt();
        int[] nums = new int[length];
        for (int i = 0;i < nums.length;i++){
            nums[i] = scan.nextInt();
        }
        reverse(nums,size);
        for (int i = 0;i < nums.length;i++){
            System.out.print(nums[i] + " ");
        }
    }
    public static void reverse(int[] a, int size){
        for (int i = 0,j = size - 1;i < j;i++,j--){
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
        }
    }
}
