import java.util.ArrayDeque;
import java.util.Queue;

public class Test525 {
    String[] strings;

    public static void bfs(TreeNode root) {
        if (root == null) return;
        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            TreeNode tempNode = queue.poll();
            System.out.println(tempNode.toString());
            if (root.left != null) {
                queue.add(root.left);
            }
            if (root.right != null) {
                queue.add(root.right);
            }
        }
    }

    public static void main(String[] args) {
        String[] _strings = {"1", "2", "3", "4", "5", "6"};
        Test525 test525 = new Test525();
        TreeNode head = test525.init(_strings);
        bfs(head);
    }

    public TreeNode init(String[] strings) {
        TreeNode[] tempNodeList = new TreeNode[strings.length];
        for (int i = 0; i < strings.length; i++) {
            tempNodeList[i] = new TreeNode(strings[i]);
        }
        TreeNode head = tempNodeList[0];
        for (int i = 0; i < strings.length / 2 ; i++) {
            TreeNode left = null;
            if (2 * i + 1 < strings.length) {
                left = tempNodeList[2 * i + 1];
            }
            TreeNode right = null;
            if (2 * i + 2 < strings.length) {
                right = tempNodeList[2 * i + 2];
            }
            TreeNode temp = tempNodeList[i];
            temp.left = left;
            temp.right = right;
        }
        return head;
    }
}


class TreeNode {
    TreeNode left;
    TreeNode right;
    String value;

    public TreeNode(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "TreeNode{" +
                "value='" + value + '\'' +
                '}';
    }
}
