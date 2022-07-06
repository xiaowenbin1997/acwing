package AcwingBasic.cha01;
import java.math.BigInteger;
import java.util.Scanner;

public class Ac791 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BigInteger bigA = scanner.nextBigInteger();
        BigInteger bigB = scanner.nextBigInteger();
        System.out.println(bigA.add(bigB));
    }
}
