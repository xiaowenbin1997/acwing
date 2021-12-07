import java.util.Scanner;

public class t810 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        System.out.println(abs(x));
    }
    public static int abs(int x){
        return x > 0 ? x : -x;
    }
}
