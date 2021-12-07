/**
 *
 */
import java.util.Scanner;
public class t804 {
    public static int fact(int n){//输出n的阶乘
        if(n == 1)
            return 1;
        else
            return n * fact(n - 1);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println(fact(n));
    }
}
