import java.util.Scanner;

class Solution {
    public int Fibonacci(int n) {
        int a = 0,b = 1;int sum = 0;
        for (int i = 0;i < n;i++){
            sum = a + b;
            a = b;
            b = sum;
        }
        return a;
    }
}
public class T21 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Solution solution = new Solution();
        System.out.println(solution.Fibonacci(n));
    }
}
