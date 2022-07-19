package UsefulFunc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 去除复制部分前面的序号
 */
public class DelIndex {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println();
        while (true) {
            String temp = br.readLine();
            if (temp == null)   break;
            StringBuilder stringBuilder = new StringBuilder(temp);
            int i = 0;
            while (stringBuilder.length() > 0 && stringBuilder.charAt(i) != ' ') {
                stringBuilder.deleteCharAt(i);
            }
            System.out.println(stringBuilder);
        }
    }
}
