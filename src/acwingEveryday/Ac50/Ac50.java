package acwingEveryday.Ac50;

import sun.reflect.generics.tree.Tree;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class Ac50 {
    // Encodes a tree to a single string.
    String serialize(TreeNode root) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[");
        bfs(root, stringBuilder);
        if (stringBuilder.charAt(stringBuilder.length() - 1) == ' ') {
            stringBuilder.deleteCharAt(stringBuilder.length() - 1);
            stringBuilder.deleteCharAt(stringBuilder.length() - 1);
        }
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
    public void bfs(TreeNode root, StringBuilder stringBuilder) {
        if (root == null) {
            stringBuilder.append("null");
            return;
        }
        Queue<String> queue = new ArrayDeque<>();
        Queue<TreeNode> nodeQueue = new ArrayDeque<>();
        nodeQueue.add(root);
        queue.add(String.valueOf(root.val));
        while (!queue.isEmpty()) {
            TreeNode temp = nodeQueue.poll();
            String tempStr = queue.poll();
            while ("null".equals(tempStr)) {
                stringBuilder.append(tempStr).append(", ");
                tempStr = queue.poll();
            }
            if (tempStr == null)    break;
            stringBuilder.append(tempStr).append(", ");
            if (temp.left != null) {
                nodeQueue.add(temp.left);
                queue.add(String.valueOf(temp.left.val));
            } else {
                queue.add("null");
            }
            if (temp.right != null) {
                nodeQueue.add(temp.right);
                queue.add(String.valueOf(temp.right.val));
            } else {
                queue.add("null");
            }
        }
    }

    // Decodes your encoded data to tree.
    TreeNode deserialize(String data) {
        String[] strings = getStrings(data);
        if (strings == null) {
            return null;
        }
        if (strings.length == 0) return null;
        Queue<TreeNode> queue = new ArrayDeque<>();
        TreeNode head = new TreeNode(Integer.parseInt(strings[0]));
        queue.add(head);
        int i = 0;//遍历strings数组的
        while (!queue.isEmpty()) {
            TreeNode temp = queue.poll();
            if (++i > strings.length) break;
            String left = strings[i];
            if (++i > strings.length) break;
            String right = strings[i];
            if ("null".equals(left)) {
                temp.left = null;
            } else {
                TreeNode leftNode = new TreeNode(Integer.parseInt(left));
                temp.left = leftNode;
                queue.add(leftNode);
            }
            if ("null".equals(right)) {
                temp.right = null;
            } else {
                TreeNode rightNode = new TreeNode(Integer.parseInt(right));
                temp.right = rightNode;
                queue.add(rightNode);
            }
        }
        return head;
    }

    private String[] getStrings(String data) {
        StringBuilder stringBuilder = new StringBuilder(data);
        stringBuilder.deleteCharAt(0);
        stringBuilder.deleteCharAt(stringBuilder.length() - 1);
        if ("null".equals(stringBuilder.toString())) return null;
        String[] strings = stringBuilder.toString().split(", ");
        return strings;
    }

    public static void main(String[] args) {
        String data = "[null]";
        Ac50 ac50 = new Ac50();
//        String str1 = "[54, 226, -80, -152, 192, -11, -117, 234, 295, 37, null, 297, -163, null, 107, -5, -125, 260, 35, 157, -184, 95, 27, 4, 200, -187, -94, null, 269, null, null, null, null, null, null, 213, 115, 251, null, null, 161, 53, 155, 139, 271, 283, 209, null, null, null, null, 47, null, 113, 174, -31, 202, null, null, null, null, 128, null, 73, -92, null, 148, 17, 187, 74, 100, null, -168, null, null, null, null, null, null, null, 126, 231, null, null, 196, 82, 175, null, null, null, 242, -142, -140, 241, 262, -153, null, 98, -103, -143, null, null, null, null, null, 130, 57, null, -63, -178, null, -108, -118, null, null, -161, 227, null, 204, null, -155, 102, 170, null, -105, 59, 9, null, null, null, -34, null, 49, -67, 43, null, null, -99, null, 266, null, 86, null, 109, null, null, null, 79, null, -134, null, null, -44, -10, null, -128, null, 248, null, null, null, null, null, null, 22, 215, null, null, null, null, null, null, null, null, null, -150, null, null, null, null, null, 150, null, null, null, null, null, null, null, null, null, null, null, null, null]";
//        String str2 = "[54, 226, -80, -152, 192, -11, -117, 234, 295, 37, null, 297, -163, null, 107, -5, -125, 260, 35, 157, -184, 95, 27, 4, 200, -187, -94, null, 269, null, null, null, null, null, null, 213, 115, 251, null, null, 161, 53, 155, 139, 271, 283, 209, null, null, null, null, 47, null, 113, 174, -31, 202, null, null, null, null, 128, null, 73, -92, null, 148, 17, 187, 74, 100, null, -168, null, null, null, null, null, null, null, 126, 231, null, null, 196, 82, 175, null, null, null, 242, -142, -140, 241, 262, -153, null, 98, -103, -143, null, null, null, null, null, 130, 57, null, -63, -178, null, -108, -118, null, 0, -161, 227, null, 204, null, -155, 102, 170, null, -105, 59, 9, null, null, null, -34, null, 49, -67, 43, null, null, -99, null, 266, null, null, 76, 86, null, 109, null, null, null, 79, null, -134, null, null, -44, -10, null, -128, null, 248, null, null, null, null, null, null, 22, 215, null, null, null, null, null, -190, null, null, null, null, null, -150, null, null, null, null, null, 150, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]";
//        ac50.test(str1, str2);
        TreeNode root = ac50.deserialize(data);
        String result = ac50.serialize(root);
        System.out.println(result);
    }

    public void test(String str1, String str2) {
        String[] strings01 = getStrings(str1);
        String[] strings02 = getStrings(str2);
        int length01 = strings01.length;
        int length02 = strings02.length;
        int minLen = length01 < length02 ? length01 : length02;
        int dif = 0;
        for (int i = 0; i < minLen; i++) {
            if (strings01[i].equals(strings02[i])) {
                i++;
            } else {
                dif = i;
            }
        }
        System.out.println(strings01[dif]);
    }
}
