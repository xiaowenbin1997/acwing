import java.util.Arrays;
import java.util.Scanner;

public class t818 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int l = scanner.nextInt();
        int r = scanner.nextInt();
        int a[] = new int[n];
        for (int i = 0;i < n;i++){
            a[i] = scanner.nextInt();
        }
        sort(a,l,r);
        for (int i = 0;i < a.length;i++){
            System.out.println(a[i] + " ");
        }
    }
    public static void sort(int a[],int l,int r){
        for (int i = l;i < r;i++){
            for (int j = r;j > i;j--){
                if (a[j] < a[j - 1]){
                    int temp = a[j];
                    a[j] = a[j - 1];
                    a[j - 1] = temp;
                }
            }
        }
    }
}
