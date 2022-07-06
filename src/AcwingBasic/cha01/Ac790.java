package AcwingBasic.cha01;

import java.util.Scanner;

public class Ac790 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double input = scanner.nextDouble();
        double left = -100;
        double right = 100;
        while (right - left > 1e-8) {
            double mid = (left + right) / 2;
            if (mid * mid * mid >= input) right = mid;
            else left = mid;
        }
        System.out.printf("%6f", left);
    }
}
