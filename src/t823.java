import java.util.Arrays;
import java.util.Scanner;

/**
 * 给定一个整数 n，将数字 1∼n 排成一排，将会有很多种排列方法。
 *
 * 现在，请你按照字典序将所有的排列方法输出。
 *
 * 输入格式
 * 共一行，包含一个整数 n。
 */
public class t823 {
    static int totalNum = 9;
    public static void dfs(int beg,int[] nums,boolean[] states){
        if (beg == totalNum){
            for (int i = 1;i <= totalNum;i++){
                System.out.print(nums[i] + " ");
            }
            System.out.println();
        }
        else {
            for (int i = 1;i <= beg;i++){
                if (!states[i]){
                    nums[i] = beg;
                    states[i] = true;
                    dfs(beg + 1,nums,states);
                    states[i] = false;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int beg = scanner.nextInt();
        int[] nums = new int[10];
        boolean[] states = new boolean[10];
        Arrays.fill(states,false);
        dfs(beg,nums,states);
    }
}
