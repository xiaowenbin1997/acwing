package Sword2Offer.Tree;

import java.util.LinkedList;
import java.util.Queue;

//四种遍历方式并打印输出
public class FourOrder {
    public void preOrder(TreeNode proot) {
        if (proot == null){
            return;
        }
        System.out.println(proot.val + " ");
        preOrder(proot.left);
        preOrder(proot.right);
    }
    public void MiddleOrder(TreeNode proot) {
        if (proot == null) {
            return;
        }
        MiddleOrder(proot.left);
        System.out.println(proot.val + " ");
        MiddleOrder(proot.right);
    }
    public void postOrder(TreeNode proot) {
        if (proot == null) {
            return;
        }
        postOrder(proot.left);
        postOrder(proot.right);
        System.out.println(proot.val + " ");
    }
    public void levelOrder(TreeNode proot) {
        if (proot == null) {
            return;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(proot);
        while (!queue.isEmpty()) {
            int size = queue.size();
            while (size > 0) {
                TreeNode temp = queue.poll();
                System.out.println(temp.val);
                if (temp.left != null) {
                    queue.offer(temp.left);
                }
                if (temp.right != null) {
                    queue.offer(temp.right);
                }
            }
        }
    }
}
