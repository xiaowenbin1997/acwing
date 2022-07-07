package ningmengTest;

import java.util.Scanner;

public class Pro2 {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     * @param N int整型
     * @return int整型
     */
    int N = 100000000;
    public int findGreaterNum(int N) {
        // write code here
        String str = String.valueOf(N);
        String result = "-1";
        for (int i = str.length() - 2; i >= 0; i--) {
            String pre = str.substring(0, i);
            String back = str.substring(i);
            String minBiggerBack = getMinBigger(back);
            result = pre + minBiggerBack;
            if (!minBiggerBack.equals("-1")) {
                break;
            }
        }
        return Integer.parseInt(result);
    }

    private String getMinBigger(String back) {
        int length = back.length();
        int numBack = Integer.parseInt(back);
        int minNum = N;
        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                String swap = swap(back, i, j);
                if (swap.compareTo(back) > 0) {
                    int temp = Integer.parseInt(swap);
                    if (temp < minNum)  minNum = temp;
                }
            }
        }
        if (minNum == N) {
            return "-1";
        } else {
            return String.valueOf(minNum);
        }
    }

    private String swap(String input, int i, int j) {
        StringBuilder stringBuilder = new StringBuilder(input);
        char[] chars = input.toCharArray();
        char tmp = chars[i];
        chars[i] = chars[j];
        chars[j] = tmp;
        String result = "";
        for (int k = 0; k < chars.length; k++) {
            result = result + chars[k];
        }
        return result;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        String str = String.valueOf(num);
        Pro2 pro2 = new Pro2();
        int greaterNum = pro2.findGreaterNum(num);
        System.out.println(greaterNum);
    }
}
