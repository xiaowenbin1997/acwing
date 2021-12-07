import java.util.Scanner;

public class t820 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        System.out.println(fabric(a));
    }
    public static int fabric(int num){
       if (num == 1){
           return 1;
       }
       else if (num == 2){
           return 1;
       }
       else {
           return fabric(num - 1) + fabric(num - 2);
       }
    }
}
