package Sword2Offer.Tree;

import java.util.ArrayList;
import java.util.LinkedList;

//
//描述
//        输入一颗二叉树的根节点root和一个整数expectNumber，找出二叉树中结点值的和为expectNumber的所有路径。
//        1.该题路径定义为从树的根结点开始往下一直到叶子结点所经过的结点
//        2.叶子节点是指没有子节点的节点
//        3.路径只能从父节点到子节点，不能从子节点到父节点
//        4.总节点数目为n
//
//        如二叉树root为{10,5,12,4,7},expectNumber为22
public class JZ34 {
    ArrayList<ArrayList<Integer>> result = new ArrayList<>();
    LinkedList<Integer> temp = new LinkedList<>();
    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int expectNumber) {
        if (root == null) {
            return result;
        }
        dfs(root,expectNumber);
        return result;
    }
    public void dfs(TreeNode root,int value) {
        if (root == null) {
            return;
        }
        value = value - root.val;
        temp.add(root.val);
        if (value == 0 && root.left == null && root.right == null) {
            result.add(new ArrayList<>(temp));
        }
        dfs(root.left,value);
        dfs(root.right,value);
        temp.removeLast();
    }
}

