package acwingEveryday;

import java.util.*;

public class Ac45 {
    public List<List<Integer>> printFromTopToBottom(TreeNode root) {
        List<List<Integer>> resultArrays = new ArrayList<>();
        if (root == null)   return resultArrays;
        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.add(root);
        boolean flag = true;
        int length = queue.size();
        while (!queue.isEmpty()) {
            List<Integer> arrayNums = new ArrayList<>();
            for (int i = 0;i < length;i++) {
                TreeNode temp = queue.poll();
                arrayNums.add(temp.val);
                if (temp.left != null)  queue.add(temp.left);
                if (temp.right != null) queue.add(temp.right);
            }
            if (!flag)  Collections.reverse(arrayNums);
            flag = !flag;
            resultArrays.add(arrayNums);
            length = queue.size();
        }
        return resultArrays;
    }
    public static void main(String[] args) {
        int[] nums = {8,12,2};
        TreeNode root = TreeNodeUtils.getTree(nums);
        Ac45 ac45 = new Ac45();
        ac45.printFromTopToBottom(root);
    }
}
