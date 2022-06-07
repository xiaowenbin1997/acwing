package acwingEveryday;

import java.util.ArrayList;
import java.util.List;

/*
输入一棵二叉树和一个整数，打印出二叉树中结点值的和为输入整数的所有路径。
从树的根结点开始往下一直到叶结点所经过的结点形成一条路径。
保证树中结点值均不小于 0。
 */
public class Ac47 {
    List<List<Integer>> resultNums;
    int sumNum;
    public List<List<Integer>> findPath(TreeNode root, int sum) {
        resultNums = new ArrayList<>();
        sumNum = sum;
        List<Integer> tempNums = new ArrayList<>();
        dfs(tempNums,root);
        return resultNums;
    }

    private void dfs(List<Integer> tempNums,TreeNode node) {
        if (node.left == null && node.right == null) {
            int sum = getSum(tempNums);
            if (sum == sumNum)  resultNums.add(tempNums);
        }
        tempNums.add(node.val);
        dfs(tempNums,node.left);
        dfs(tempNums,node.right);
        tempNums.remove(tempNums.size() - 1);
    }

    private int getSum(List<Integer> tempNums) {
        Integer result = tempNums.stream().reduce((sum, temp) -> {
            return sum + temp;
        }).get();
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {5,4,6};
        TreeNode root = TreeNodeUtils.getTree(nums);
        Ac47 ac47 = new Ac47();
        ac47.findPath(root,9);
    }
}
