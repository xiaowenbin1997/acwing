package acwingEveryday;

public class Ac39 {
    public boolean isSymmetric(TreeNode root) {
        if (root == null || (root.left == null && root.right == null))  return true;
        return dfs(root.left,root.right);
    }
    private boolean dfs(TreeNode left, TreeNode right) {
        if (left == null || right == null)  return (left == null && right ==null);
        if (left.val != right.val)  return false;
        return dfs(left.left,right.right) && dfs(left.right,right.left);
    }
}
