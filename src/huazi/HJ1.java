package huazi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 字符串最后一个单词的长度
 */
public class HJ1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int i = s.lastIndexOf(' ');
        System.out.println(s.length() - 1 - i);
    }
}
