import java.util.ArrayDeque;
import java.util.Queue;


public class Test720 {
    public static void main(String[] args) {

    }

    public static void printRightView(TreeNode head) {
        if (head == null) {
            return;
        }
        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.add(head);
        //维护一个count变量记录每层的节点数
        int count = 1;
        while (!queue.isEmpty()) {
            while (count-- > 0) {
                TreeNode tempNode = queue.poll();
                if (tempNode.left != null) {
                    queue.add(tempNode.left);
                }
                if (tempNode.right != null) {
                    queue.add(tempNode.right);
                }
                //count == 0，就说明出队的是当前层的最右边节点
                if (count == 0) {
                    System.out.println(tempNode.value);
                }
            }
            //更新count为下一层的长度
            count = queue.size();
        }
    }
}
