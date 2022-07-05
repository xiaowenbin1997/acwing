package huazi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 明明的随机数
 */
public class HJ3 {
    public static void main(String[] args) throws IOException {
        int[] resultArrays = new int[501];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String numStr = br.readLine();
        Integer num = Integer.parseInt(numStr);
        for (int i = 0;i < num;i++) {
            String tempNumStr = br.readLine();
            Integer tempNum = Integer.parseInt(tempNumStr);
            resultArrays[tempNum] = 1;
        }
        for (int i = 0;i < resultArrays.length;i++) {
            if (resultArrays[i] == 1) {
                System.out.println(i);
            }
        }
    }
}
