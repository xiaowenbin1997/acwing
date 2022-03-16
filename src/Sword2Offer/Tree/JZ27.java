package Sword2Offer.Tree;


public class JZ27 {
    public TreeNode Mirror (TreeNode pRoot) {
        if (pRoot == null) {
            return pRoot;
        }
        TreeNode result = pRoot;
        dfs(pRoot);
        return result;
    }
    public void dfs(TreeNode pRoot) {
        if (pRoot == null) {
            return;
        }
        TreeNode temp = pRoot.left;
        pRoot.left = pRoot.right;
        pRoot.right = temp;
        Mirror(pRoot.left);
        Mirror(pRoot.right);
    }
}
