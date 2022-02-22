package algorithmclass.class01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Code04_BSExist {
    private static Integer BSExist(Integer[] arr,Integer num) {
        if (arr == null ||arr.length == 0) {
            return -1;
        }
        int left = 0;
        int right = arr.length - 1;
        int mid = 0;
        while (left <= right) {
            mid = left + ((right - left) >> 1);
            if (num == arr[mid]) {
                return mid;
            } else if (num < arr[mid]) {
                right = mid - 1;
            } else if (num > arr[mid]) {
                left = mid + 1;
            }
        }
        return -1;
    }

    public static boolean exist(int[] sortedArr, int num) {
        if (sortedArr == null || sortedArr.length == 0) {
            return false;
        }
        int L = 0;
        int R = sortedArr.length - 1;
        int mid = 0;
        while (L < R) {
            mid = L + ((R - L) >> 1);
            if (sortedArr[mid] == num) {
                return true;
            } else if (sortedArr[mid] > num) {
                R = mid - 1;
            } else {
                L = mid + 1;
            }
        }
        return sortedArr[L] == num;
    }



    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int[] arr = new int[num];
        String[] arrStrs = new String[num];
        arrStrs = br.readLine().split(" ");
        for (int i = 0; i < arrStrs.length; i++) {
            arr[i] = Integer.parseInt(arrStrs[i]);
        }
        Integer findNum = Integer.parseInt(br.readLine());
        exist(arr,findNum);
    }
}
