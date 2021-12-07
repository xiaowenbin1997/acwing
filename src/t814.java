import java.util.Scanner;

public class t814 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int lengthA = scan.nextInt();
        int lengthB = scan.nextInt();
        int size = scan.nextInt();
        int[] a = new int[lengthA];
        int[] b = new int[lengthB];
        for (int i = 0;i < lengthA;i++){
            a[i] = scan.nextInt();
        }
        for (int i = 0;i < lengthB;i++){
            b[i] = scan.nextInt();
        }
        copy(a,b,size);
        for (int i = 0;i < lengthB;i++){
            System.out.print(b[i] + " ");
        }
    }
    public static void copy(int[] a,int[] b,int size){
        for(int i = 0;i < size;i++){
            b[i] = a[i];
        }
    }
}
