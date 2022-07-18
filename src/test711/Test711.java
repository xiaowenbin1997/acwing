package test711;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Test711 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        Integer[] arrays = new Integer[length];
        for (int i = 0; i < length; i++) {
            arrays[i] = scanner.nextInt();
        }
        //女生分到的糖果数
        int count = length / 2;
        Set<Integer> classes = new HashSet<Integer>(Arrays.asList(arrays));
        System.out.println(Math.min(classes.size(),count));
    }
}
