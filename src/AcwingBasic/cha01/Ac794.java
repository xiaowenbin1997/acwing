package AcwingBasic.cha01;

import java.math.BigInteger;
import java.util.Scanner;

public class Ac794 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BigInteger a = scanner.nextBigInteger();
        BigInteger b = scanner.nextBigInteger();
        BigInteger[] bigIntegers = a.divideAndRemainder(b);
        System.out.println(bigIntegers[0]);
        System.out.println(bigIntegers[1]);
    }
}
