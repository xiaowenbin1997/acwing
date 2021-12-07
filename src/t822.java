import java.util.Scanner;

public class t822 {
    static int ans = 0;

    //输入的行
    static int n;
    //输入的列
    static int m;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        m = scan.nextInt();
        walkOne(0,0);
        System.out.println(ans);
    }
    public static void walkOne(int row,int col) {
        if (row == n && col == m) {
            ans++;
        }
        else {
            if (row < n){
                walkOne(row + 1,col);
            }
            if (col < m){
                walkOne(row,col + 1);
            }
        }
    }
}
