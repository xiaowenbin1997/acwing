import java.util.Scanner;

public class t812 {
    public static void print(int[] a,int size){
        int i = 0;
        while (i < size){
            System.out.print(a[i++] + " ");
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int length = scan.nextInt();
        int count = scan.nextInt();
        int[] nums = new int[length];
        for (int i = 0;i < length;i++){
            nums[i] = scan.nextInt();
        }
        print(nums,count);
    }
}
