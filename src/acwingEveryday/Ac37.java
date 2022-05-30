package acwingEveryday;

import sun.reflect.generics.tree.Tree;

/**
 * 输入两棵二叉树 A，B，判断 B 是不是 A 的子结构。
 *
 * 我们规定空树不是任何树的子结构。
 * A是root1，B是root2
 */
public class Ac37 {
    public boolean hasSubtree(TreeNode pRoot1, TreeNode pRoot2) {
        if (pRoot2 == null || pRoot1.val != pRoot2.val) return false;
        dfs(pRoot1,pRoot2);
    }
    public boolean dfs(TreeNode root1,TreeNode root2) {

    }

    public static void main(String[] args) {
        int[] nums1 = {8,8,7,9,2,0,0,0,0,4,7};
        int[] nums2 = {8,9,2};
        Ac37 ac37 = new Ac37();
        TreeNode root1 = ac37.buildTree(nums1);
        TreeNode root2 = ac37.buildTree(nums2);
    }
    public TreeNode buildTree(int[] nums) {
        TreeNode[] nodes = new TreeNode[nums.length];
        for (int i = 0;i < nums.length;i++) {
            if (nums[i] == 0)   nodes[i] = null;
            else nodes[i] = new TreeNode(nums[i]);
        }
        for (int i = 0;i < nums.length / 2;i++) {
            nodes[i].left = nodes[2 * i + 1];
            nodes[i].right = nodes[2 * i + 2];
        }
        return nodes[0];
    }
}
