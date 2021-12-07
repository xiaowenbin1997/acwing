import java.util.Scanner;

public class t806 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        System.out.println(String.format("%.2f",add(a,b)));
    }
    public static double add(double a,double b){
        return a + b;
    }
}
