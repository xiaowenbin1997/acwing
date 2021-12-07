import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class T51 {
}
class SolutionT51 {
    boolean[] st;
    List<Integer> num;
    List<List<Integer>> numsRet;
    public List<List<Integer>> permutation(int[] nums) {
        Arrays.sort(nums);
        st = new boolean[]{false};
        num = new ArrayList<>(nums.length);
        dfs(numsRet,0,0);
        return numsRet;
    }
    public void dfs(List<List<Integer>> numsRet, int used, int start){
        if (used == num.size()) {
            numsRet.add(num);
            return;
        }
        for (int i = start;i < num.size();i++) {
            if (!st[i]) {
                st[i] = true;
            }
        }
    }
}
