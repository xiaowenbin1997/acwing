package Sword2Offer.Tree;

import java.util.ArrayList;
import java.util.List;

public class JZ82 {
    /**
     *
     * @param root TreeNode类
     * @param sum int整型
     * @return bool布尔型
     */
    //思路:dfs遍历一遍树，到叶子结点后记录下节点之和，保存在数组中
    List<Integer> nums = new ArrayList<>();
    public boolean hasPathSum (TreeNode root, int sum) {
        // write code here
        if (root == null) return false;
        dfs(root,0);
        return nums.contains(sum);
    }
    public void dfs(TreeNode root,int nodeSum) {
        int tempNodeVal = root.val;
        nodeSum = nodeSum + tempNodeVal;
        if (root.left != null) {
            dfs(root.left,nodeSum);
        }
        if (root.right != null) {
            dfs(root.right,nodeSum);
        }
        if (root.left == null && root.right == null) {
            nums.add(nodeSum);
            return;
        }
    }
}
