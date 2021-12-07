import java.util.Scanner;

public class t821 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println(jumpStair(n));
    }
    public static int jumpStair(int n){
        if (n == 0) {
            return 0;
        }
        if (n == 1){
            return 1;
        }
        if (n == 2){
            return 2;
        }
        return jumpStair(n - 1) + jumpStair(n - 2);
    }
}
