import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class T75 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] nums = new int[4];
        for (int i = 0;i < nums.length;i++) {
            nums[i] = scanner.nextInt();
        }
        int target = scanner.nextInt();
        SolutionT75 solutionT75 = new SolutionT75();
        solutionT75.findNumbersWithSum(nums,target);
    }
}
class SolutionT75 {
    public int[] findNumbersWithSum(int[] nums, int target) {
        Map<Integer,Integer> matchMap = new HashMap<>();
        int[] retNum = new int[2];
        for (int i = 0;i < nums.length;i++) {
            matchMap.put(nums[i],target - nums[i]);
        }
        for (int i = 0; i < nums.length;i++) {
            int key = nums[i];
            int val = matchMap.get(key);
            if (matchMap.containsKey(val)&&key == matchMap.get(val)) {
                retNum[0] = key;
                retNum[1] = val;
                break;
            }
        }
        return retNum;
    }
}