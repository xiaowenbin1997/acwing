package Sword2Offer.Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * 给定一个二叉树，返回该二叉树的之字形层序遍历，（第一层从左向右，下一层从右向左，一直这样交替）
 *
 * 数据范围：0 \le n \le 15000≤n≤1500,树上每个节点的val满足 |val| <= 100∣val∣<=100
 * 要求：空间复杂度：O(n)O(n)，时间复杂度：O(n)O(n)
 * 全用队列
 */
public class JZ77 {
    public ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        if (pRoot == null) {
            return result;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(pRoot);
        boolean isOrder = true;
        while (!queue.isEmpty()) {
            int size = queue.size();
            ArrayList<Integer> temp = new ArrayList<>();
            while (size > 0) {
                TreeNode node = queue.poll();
                size--;
                if (isOrder) {
                    temp.add(node.val);
                } else {
                    temp.add(0,node.val);
                }
                if (node.left != null) {
                    queue.offer(node.left);
                }
                if (node.right != null) {
                    queue.offer(node.right);
                }
            }
            isOrder = !isOrder;
            result.add(temp);
        }
        return result;
    }
}
