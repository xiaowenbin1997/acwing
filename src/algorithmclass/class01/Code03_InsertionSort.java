package algorithmclass.class01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Code03_InsertionSort {
    private static void swap(Integer[] arr,int i,int j) {
        arr[i] = arr[i] ^ arr[j];
        arr[j] = arr[i] ^ arr[j];
        arr[i] = arr[i] ^ arr[j];
    }
    private static void insertSort(Integer[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }
        for (int i = 1; i < arr.length; i++) {
            for (int j = i - 1;j >= 0 && arr[j] > arr[j + 1]; j--) {
                swap(arr,j,j + 1);
                totalPrint(arr);
            }
        }
    }
    private static void totalPrint(Integer[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String numStr = br.readLine();
        Integer num = Integer.parseInt(numStr);
        Integer[] nums = new Integer[num];
        String[] numsStr = br.readLine().split(" ");
        for (int i = 0; i < numsStr.length; i++) {
            nums[i] = Integer.parseInt(numsStr[i]);
        }
        totalPrint(nums);
        insertSort(nums);
        totalPrint(nums);
    }
}
