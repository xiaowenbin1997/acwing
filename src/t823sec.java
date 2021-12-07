import java.util.Scanner;

/**
 * 给定一个整数 n，将数字 1∼n 排成一排，将会有很多种排列方法。
 *
 * 现在，请你按照字典序将所有的排列方法输出。
 *
 * 输入格式
 * 共一行，包含一个整数 n。
 *
 */
public class t823sec {
    static int LEN = 9;
    static int inputLen;
    /**
     *
     * @param beg 当前遍历数组的起点
     * @param nums 存储排列的数组
     * @param isUsed 存储某个数是否被使用
     */
    public static void dfs(int beg,int[] nums,boolean[] isUsed){
        if (beg > inputLen){
            for (int i = 1;i <= inputLen;i++){
                System.out.print(nums[i] + " ");
            }
            System.out.println();
        }
        else{
            for (int i = 1;i <= inputLen;i++){
                if (!isUsed[i]){
                    isUsed[i] = true;
                    nums[beg] = i;
                    dfs(beg + 1,nums,isUsed);
                    isUsed[i] = false;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        inputLen = scanner.nextInt();
        int[] nums = new int[LEN];
        boolean[] isUsed = new boolean[LEN];
        dfs(1,nums,isUsed);
    }
}
