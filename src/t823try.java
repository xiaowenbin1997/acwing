import java.util.Scanner;

/**
 * 给定一个整数 n，将数字 1∼n 排成一排，将会有很多种排列方法。
 *
 * 现在，请你按照字典序将所有的排列方法输出。
 *
 * 输入格式
 * 共一行，包含一个整数 n。
 *
 * 输出格式
 * 按字典序输出所有排列方案，每个方案占一行。
 */
public class t823try {
    static final int NUM = 10;
    static int input;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] nums = new int[NUM];
        boolean[] isUsed = new boolean[NUM];
        input = scanner.nextInt();
        dfs(1,nums,isUsed);
    }
    public static void dfs(int begin,int[] nums,boolean[] isUsed){
        if (begin > input){
            for (int i = 1;i <= input;i++){
                System.out.print(nums[i] + " ");
            }
            System.out.println();
        }
        else {
            for (int i = 1;i <= input;i++){
                if (!isUsed[i]){
                    nums[begin] = i;
                    isUsed[i] = true;
                    dfs(begin + 1,nums,isUsed);
                    isUsed[i] = false;
                }
            }
        }
    }
}
