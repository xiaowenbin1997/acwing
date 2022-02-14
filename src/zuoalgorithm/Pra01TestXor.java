package zuoalgorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * 1）一种数出现奇数次，另外的出现偶数次，找出这个数
 * 2）两种数出现奇数次，另外的都出现偶数次
 */
public class Pra01TestXor {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] strings = br.readLine().split(" ");
        Integer[] nums = new Integer[strings.length];
        for (int i = 0; i < strings.length; i++) {
            nums[i] = Integer.parseInt(strings[i]);
        }
        Integer[] result = new Integer[2];
        result = getTwo(nums);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
//        System.out.println(getOne(nums));
    }
    public static Integer getOne(Integer[] nums) {
        Integer temp = 0;
        for (Integer num :
                nums) {
            temp = temp ^ num;
        }
        return temp;
    }
    public static Integer[] getTwo(Integer[] nums) {
        Integer[] result = new Integer[2];
        int temp = 0;
        for (int i = 0; i < nums.length; i++) {
            temp = temp ^ nums[i];
        }
        int xor = temp & (~temp + 1);
        int result1 = temp;
        for (int i = 0; i < nums.length; i++) {
            if ((xor & nums[i]) == 0) {
                result1 = result1 ^ nums[i];
            }
        }
        result[0] = result1;
        result[1] = result1 ^ temp;
        return result;
    }
}
