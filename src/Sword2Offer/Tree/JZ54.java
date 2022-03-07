package Sword2Offer.Tree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 给定一棵结点数为n 二叉搜索树，请找出其中的第 k 小的TreeNode结点值。
 * 1.返回第k小的节点值即可
 * 2.不能查找的情况，如二叉树为空，则返回-1，或者k大于n等等，也返回-1
 * 3.保证n个节点的值不一样
 *
 */
public class JZ54 {
    int result = 0,count;
    public int KthNode (TreeNode proot, int k) {
        count = k;
        dfs(proot);
        return result;
    }
    public void dfs(TreeNode proot) {
        if (proot == null) {
            return;
        }
        dfs(proot.left);
        if (count == 0) {
            return;
        }
        if (--count == 0) {
            result = proot.val;
        }
        dfs(proot.right);
    }
}
