import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class T51 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> listInput = new ArrayList<>();
        while (scanner.hasNextInt()) {
            Integer num = scanner.nextInt();
            listInput.add(num);
        }
        for (Integer num : listInput) {
            System.out.println(num);
        }
        int[] numsInput = listInput.stream().mapToInt(e->e.intValue()).toArray();
        SolutionT51Old solutionT51Old = new SolutionT51Old();
        solutionT51Old.permutation(numsInput);
    }
}
class SolutionT51Old {
    public List<List<Integer>> permutation(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        backtrack(list, new ArrayList<>(), nums, new boolean[nums.length]);
        return list;
    }

    private void backtrack(List<List<Integer>> list, List<Integer> tempList, int [] nums, boolean [] used){
        if(tempList.size() == nums.length){
            list.add(new ArrayList<>(tempList));
        } else{
            for(int i = 0; i < nums.length; i++){
                if(used[i] || i > 0 && nums[i] == nums[i-1] && !used[i - 1]) continue;
                used[i] = true;
                tempList.add(nums[i]);
                backtrack(list, tempList, nums, used);
                used[i] = false;
                tempList.remove(tempList.size() - 1);
            }
        }
    }
}

