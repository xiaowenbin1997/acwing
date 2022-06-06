package acwingEveryday;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

/*
从上往下打印出二叉树的每个结点，同一层的结点按照从左到右的顺序打印。

数据范围
树中节点的数量 [0,1000]。
 */
public class Ac43 {
    //这个仅仅完成层次遍历二叉树，不记录层高
    public List<Integer> printFromTopToBottom(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null)   return result;
        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            TreeNode temp = queue.poll();
            result.add(temp.val);
            if (temp.left != null)  queue.add(temp.left);
            if (temp.right != null) queue.add(temp.right);
        }
        return result;
    }
    //这个在完成二叉树遍历时，也记录层高
    public void printTree(TreeNode root) {
        if (root == null)   return;
        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.add(root);
        int level = 1;
        int length = queue.size();
        while (!queue.isEmpty()) {
            System.out.print("层高-" + level +":");
            for (int i = 0;i < length;i++) {
                TreeNode temp = queue.poll();
                System.out.print(temp.val + " ");
                if (temp.left != null)  queue.add(temp.left);
                if (temp.right != null) queue.add(temp.right);
            }
            System.out.println("//本层结束");
            length = queue.size();
            level++;
        }
    }

    public static void main(String[] args) {
        int[] nums = {8,12,2,0,0,6,9,0,0,0,0,7,1};
        TreeNode root = TreeNodeUtils.getTree(nums);
        Ac43 ac43 = new Ac43();
        ac43.printTree(root);
    }
}
