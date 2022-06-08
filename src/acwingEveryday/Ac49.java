package acwingEveryday;

import java.util.ArrayList;
import java.util.List;

/*
输入一棵二叉搜索树，将该二叉搜索树转换成一个排序的双向链表。
要求不能创建任何新的结点，只能调整树中结点指针的指向。
注意：
需要返回双向链表最左侧的节点。
例如，输入下图中左边的二叉搜索树，则输出右边的排序双向链表。
 */
public class Ac49 {
    public TreeNode convert(TreeNode root) {
        if (root == null || (root.left == null && root.right == null)) return root;
        List<TreeNode> nodes = new ArrayList<>();
        dfs(root, nodes);
        for (int i = 0; i < nodes.size() - 1; i++) {
            nodes.get(i).right = nodes.get(i + 1);
            nodes.get(i + 1).left = nodes.get(i);
        }
        nodes.get(0).left = null;
        return nodes.get(0);
    }

    private void dfs(TreeNode root, List<TreeNode> nodes) {
        if (root == null) return;
        dfs(root.left, nodes);
        nodes.add(root);
        dfs(root.right, nodes);
    }

    public static void main(String[] args) {
        int[] nums = {10, 6, 14, 4, 8, 12, 16};
        TreeNode root = TreeNodeUtils.getTree(nums);
        Ac49 ac49 = new Ac49();
        ac49.convert(root);
    }
}
