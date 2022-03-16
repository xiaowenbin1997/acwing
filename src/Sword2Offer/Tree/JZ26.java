package Sword2Offer.Tree;

public class JZ26 {
//    public boolean HasSubtree(TreeNode root1,TreeNode root2) {
//        if (root1 == null || root2 == null) {
//            return false;
//        }
//        return dp(root1,root2) || HasSubtree(root1.left,root2) || HasSubtree(root1.right,root2);
//    }
//
//    public boolean dp(TreeNode root1,TreeNode root2) {
//        if (root2 == null) return true;
//        if (root1 == null || root1.val != root2.val) return false;
//        return dp(root1.left,root2.left) && dp(root1.right,root2.right);
//    }
    public boolean HasSubtree(TreeNode root1,TreeNode root2) {
        if (root1 == null || root2 == null) {
            return false;
        }
        return dfs(root1,root2) || HasSubtree(root1.left,root2) || HasSubtree(root1.right,root2);
    }

    public boolean dfs(TreeNode root1,TreeNode root2) {
        if (root2 == null) {
            return true;
        }
        if (root1 == null || root1.val != root2.val) {
            return false;
        }
        return dfs(root1.left,root2.left) && dfs(root1.right,root2.right);
    }
}
