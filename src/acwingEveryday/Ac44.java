package acwingEveryday;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class Ac44 {
    public List<List<Integer>> printFromTopToBottom(TreeNode root) {
        List<List<Integer>> resultArrays = new ArrayList<>();
        if (root == null)   return resultArrays;
        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.add(root);
        int length = queue.size();
        while (!queue.isEmpty()) {
            List<Integer> arrayNums = new ArrayList<>();
            for (int i = 0;i < length;i++) {
                TreeNode temp = queue.poll();
                arrayNums.add(temp.val);
                if (temp.left != null)  queue.add(temp.left);
                if (temp.right != null) queue.add(temp.right);
            }
            resultArrays.add(arrayNums);
            length = queue.size();
        }
        return resultArrays;
    }
}
