import java.util.Scanner;

/**
 * 输入两个整数 l 和 r，请你编写一个函数，int sum(int l, int r)，计算并输出区间 [l,r] 内所有整数的和。
 *
 * 输入格式
 * 共一行，包含两个整数 l 和 r。
 *
 * 输出格式
 * 共一行，包含一个整数，表示所求的和。
 */
public class t807 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int left = scanner.nextInt();
        int right = scanner.nextInt();
        System.out.println(sum(left,right));
    }
    public static int sum(int l,int r){
        int sumAdd = 0;
        for (int i = l;i <= r;i++){
            sumAdd += i;
        }
        return sumAdd;
    }
}
