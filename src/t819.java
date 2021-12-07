import java.util.Scanner;
public class t819 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        System.out.println(multi(num));
    }
    public static int multi(int n){
        if (n == 1){
            return 1;
        }
        else {
            return n * multi(n - 1);
        }
    }
}
