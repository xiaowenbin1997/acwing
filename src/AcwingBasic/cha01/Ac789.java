package AcwingBasic.cha01;

import java.util.Scanner;

public class Ac789 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int reqNum = scanner.nextInt();
        int[] arrays = new int[length];
        for (int i = 0; i < length; i++) {
            arrays[i] = scanner.nextInt();
        }
        for (int i = 0; i < reqNum; i++) {
            int searchNum = scanner.nextInt();
            printLeftPos(searchNum, arrays);
            printRightPos(searchNum, arrays);
        }
    }

    private static void printLeftPos(int searchNum, int[] arrays) {
        int left = 0, right = arrays.length - 1;
        while (left < right) {
            int mid = (left + right) >> 1;
            if (arrays[mid] < searchNum)    left = mid + 1;
            else    right = mid;
        }
        if (searchNum == arrays[left]) System.out.print(left + " ");
        else System.out.print("-1 ");
    }

    private static void printRightPos(int searchNum, int[] arrays) {
        int left = 0,right = arrays.length - 1;
        while (left < right) {
            int mid = (left + right + 1) >> 1;
            if (arrays[mid] <= searchNum)   left = mid;
            else right = mid - 1;
        }
        if (searchNum == arrays[left]) System.out.print(left + " ");
        else System.out.print("-1 ");
    }


}
