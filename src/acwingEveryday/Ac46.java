package acwingEveryday;
/*
输入一个整数数组，判断该数组是不是某二叉搜索树的后序遍历的结果。
如果是则返回true，否则返回false。
假设输入的数组的任意两个数字都互不相同。
数据范围
数组长度 [0,1000]。
[4, 8, 6, 12, 16, 14, 10]
 */
public class Ac46 {
    int[] nums;
    public boolean verifySequenceOfBST(int [] sequence) {
        if (sequence == null || sequence.length <= 1)   return true;
        int left = 0;
        int right = sequence.length - 1;
        nums = sequence;
        return dfs(0,right);
    }
    private boolean dfs(int left,int right) {
        if (left >= right)  return true;
        int newLeft = left;
        int rootVal = nums[right];
        while (newLeft <= right && nums[newLeft] < rootVal) {
            newLeft++;
        }
        for (int i = newLeft;i <= right;i++) {
            if (nums[i] < rootVal)  return false;
        }
        return dfs(left,newLeft - 1) && dfs(newLeft,right - 1);
    }

    public static void main(String[] args) {
        int[] nums = {4, 8, 6, 12, 16, 14, 10};
        Ac46 ac46 = new Ac46();
        boolean b = ac46.verifySequenceOfBST(nums);
        System.out.println(b);
    }
}
