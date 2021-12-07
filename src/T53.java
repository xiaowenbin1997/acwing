import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class T53 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] nums = new int[7];
        for (int i = 0;i < 7;i++) {
            nums[i] = scanner.nextInt();
        }
        SolutionT53 solutionT53 = new SolutionT53();
        solutionT53.getLeastNumbers_Solution(nums,3);
    }
}
//准备遍历k次，每次都找最小的一个数
class SolutionT53 {
    public List<Integer> getLeastNumbers_Solution(int [] input, int k) {
        List<Integer> minList = new ArrayList<>();
        //进行k次循环，为了选k个数
        while (k >= 0) {
            int minNum = input[0];
            int min = 0;
            for (int i = 1;i < input.length;i++) {
                if (input[i] < minNum) {
                    minNum = input[i];
                    min = i;
                }
            }
            minList.add(minNum);
            input[min] = 1000;
            k--;
        }
        return minList;
    }
}