import java.util.Scanner;

public class t815 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        print(str.toCharArray());
    }
    public static void print(char[] str){
        for (int i = 0;i < str.length;i++){
            System.out.print(str[i]);
        }
    }
}
