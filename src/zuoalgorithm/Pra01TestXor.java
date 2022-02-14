package zuoalgorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * 1）一种数出现奇数次，另外的出现偶数次，找出这个数
 * 2）两种数出现奇数次，另外的都出现偶数次
 */
public class TestXor {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] strings = br.readLine().split(" ");
        Integer[] nums = new Integer[strings.length];
        for (int i = 0; i < strings.length; i++) {
            nums[i] = Integer.parseInt(strings[i]);
        }
        System.out.println(getOne(nums));
    }
    public static Integer getOne(Integer[] nums) {
        Integer temp = 0;
        for (Integer num :
                nums) {
            temp = temp ^ num;
        }
        return temp;
    }
}
