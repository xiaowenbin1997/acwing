import java.util.Scanner;

public class t805 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        System.out.println(max(a,b));
    }
    public static int max(int x,int y){
        return x > y ? x : y;
    }
}
