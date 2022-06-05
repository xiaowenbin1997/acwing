package acwingEveryday;
/*
输入一个二叉树，将它变换为它的镜像。

数据范围
树中节点数量 [0,100]
 */
public class Ac38 {
    public void mirror(TreeNode root) {
        if (root == null || (root.left == null && root.right == null))  return;
        reverse(root);
    }

    private void reverse(TreeNode root) {
        if (root == null)   return;
        reverse(root.left);
        reverse(root.right);
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
    }
}
