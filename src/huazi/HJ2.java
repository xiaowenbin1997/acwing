package huazi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 计算某字符出现的次数
 */
public class HJ2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        String alpha = br.readLine().toLowerCase();
        char c = alpha.charAt(0);
        char[] chars = s.toLowerCase().toCharArray();
        int count = 0;
        for (int i = 0;i < chars.length;i++) {
            if (c == chars[i]) {
                count++;
            }
        }
        System.out.println(count);
    }
}
