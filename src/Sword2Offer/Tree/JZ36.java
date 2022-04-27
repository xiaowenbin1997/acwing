package Sword2Offer.Tree;

/**
 * 输入一棵二叉搜索树，将该二叉搜索树转换成一个排序的双向链表。
 * 数据范围：输入二叉树的节点数 0 \le n \le 10000≤n≤1000，二叉树中每个节点的值 0\le val \le 10000≤val≤1000
 * 要求：空间复杂度O(1)O(1)（即在原树上操作），时间复杂度 O(n)
 * 注意一下本题栈的形式
 */
public class JZ36 {
    TreeNode head = null;
    TreeNode pre = null;
    public TreeNode Convert(TreeNode pRootOfTree) {
        if (pRootOfTree == null) {
            return null;
        }
        Convert(pRootOfTree.left);
        if (pre == null) {
            pre = pRootOfTree;
            head = pRootOfTree;
        } else {
            pre.right = pRootOfTree;
            pRootOfTree.left = pre;
            pre = pRootOfTree;
        }
        Convert(pRootOfTree.right);
        return head;
    }
}
