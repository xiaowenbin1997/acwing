import java.util.Scanner;
public class t808 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        System.out.println(findDivisor(a,b));
    }
    public static int findDivisor(int a,int b){
        int maxDivisor = Math.sqrt(a) > Math.sqrt(b)?(int)(Math.sqrt(a)) + 1:(int)(Math.sqrt(b)) + 1;
        for(int i = maxDivisor;i >= 1;i--){
            if(a % i == 0 && b % i == 0){
                return i;
            }
        }
        return 1;
    }
}
