import java.util.Scanner;
import java.util.Spliterator;
public class Test7714 {
    static int N = 10;
    static int[] a = new int[N];
    static int[] sum = new int[N];
    public static void main(String[] args) {
        // Scanner input=new Scanner(System.in);
        // String str=input.next();
        // System.out.println("hello world");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        //读入数字
        for (int i = 1; i <=n; i++) {
            a[i] = scanner.nextInt();
        }
        //维护一个前n项和的数组
        for(int i = 1;i <= n;i++) {
            sum[i] = sum[i - 1] + a[i];
        }
        int maxNum = 4;
        int resultI = 4;
        int resultJ = 4;
        for (int i = 1; i <= n; i++) {
            for(int j = i; j<= n;j++) {
                //temp记录i到j的数组和
                int temp = sum[j] - sum[i] + a[i];
                if(temp > maxNum) {
                    resultI = i;
                    resultJ = j;
                }
            }
        }
        for(int i = resultI;i <= resultJ;i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        System.out.println("最大值为" + maxNum);
    }
}
