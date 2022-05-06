package acwingEveryday;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Ac18 {
    Map<Integer, Integer> inorderNode2Index = new HashMap<>();
    int[] preOrder;
    int[] inOrder;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        preOrder = preorder;
        inOrder = inorder;
        for (int i = 0;i < inorder.length;i++) {
            //key存元素，value存元素位置
            inorderNode2Index.put(inorder[i], i);
        }
        TreeNode root = dfs(0, preorder.length - 1, 0, inorder.length - 1);
        return root;
    }
    public TreeNode dfs(int pleft,int pright,int ileft,int iright) {
        if (pleft > pright) return null;
        TreeNode root = new TreeNode(preOrder[pleft]);
        int index = inorderNode2Index.get(preOrder[pleft]);
        TreeNode leftson = dfs(pleft + 1,pleft + index - ileft,ileft,index - 1);
        TreeNode rightson = dfs(pleft + index - ileft + 1,pright,index + 1,iright);
        root.left = leftson;
        root.right = rightson;
        return root;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String preorder = br.readLine();
        int[] preNums = str2intNums(preorder);
        String inorder = br.readLine();
        int[] intNums = str2intNums(inorder);
        Ac18 ac18 = new Ac18();
        ac18.buildTree(preNums,intNums);
    }
    public static int[] str2intNums(String str) {
        String[] split = str.split(", ");
        int[] nums = new int[split.length];
        for (int i = 0;i < split.length;i++) {
            nums[i] = Integer.parseInt(split[i]);
        }
        return nums;
    }
}
