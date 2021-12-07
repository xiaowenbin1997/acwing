import java.util.Scanner;

public class t809 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        lcm(a,b);
    }
    public static int lcm(int a,int b){
        int begin = a > b ? a : b;
        int end = a * b;
        int i = 0;
        for(i = begin;i <= end;i++){
            if(i % a == 0 && i % b == 0){
                System.out.println(i);
            }
        }
        return i;
    }
}
