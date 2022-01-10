import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 输入一组数字（可能包含重复数字），输出其所有的排列方式。
 *
 * 数据范围
 * 输入数组长度 [0,6]。
 *
 * 样例
 * 输入：[1,2,3]
 *
 * 输出：
 *       [
 *         [1,2,3],
 *         [1,3,2],
 *         [2,1,3],
 *         [2,3,1],
 *         [3,1,2],
 *         [3,2,1]
 *       ]
 */
public class T51new {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> listInput = new ArrayList<>();
        while (scanner.hasNextInt()) {
            Integer num = scanner.nextInt();
            listInput.add(num);
        }
        int[] numsInput = listInput.stream().mapToInt(e->e.intValue()).toArray();
        T51Solution t51Solution = new T51Solution();
        t51Solution.permutation(numsInput);
    }
}

class T51Solution {

    public List<List<Integer>> permutation(int[] nums) {
        List<List<Integer>> resultRet = new ArrayList<>();
        boolean[] isUsed = new boolean[nums.length];
        dfs(resultRet,new ArrayList<>(),nums,isUsed);
        return resultRet;
    }
    public static void dfs(List<List<Integer>> resultRet,List<Integer> oneResult,int[] nums,boolean[] isUsed) {
        if (nums.length == oneResult.size()) {
            resultRet.add(oneResult);
        }
        for (int i = 0;i < nums.length;i++) {
            if (isUsed[i] == false) {
                isUsed[i] = true;
                oneResult.add(nums[i]);
                dfs(resultRet, oneResult, nums, isUsed);
                isUsed[i] = false;
                oneResult.remove(oneResult.size() - 1);
            }
        }
    }
}
