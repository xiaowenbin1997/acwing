package Sword2Offer.Tree;


import java.util.HashMap;

/**PRE是先序遍历顺序
 * VIN是中序遍历顺序
 */
public class JZ7 {

}


class Solution {
    int[] preOrder;
    HashMap<Integer,Integer> map = new HashMap<>();
    public TreeNode reConstructBinaryTree(int [] pre,int [] vin) {
        if (pre.length == 0 || vin.length == 0) {
            return null;
        }
        this.preOrder = pre;
        for (int i = 0;i < vin.length;i++) {
            map.put(vin[i],i);
        }
        return getNode(0,0, vin.length - 1);
    }
    public TreeNode getNode(int rootPre, int left, int right) {
        if (left > right) {
            return null;
        }
        TreeNode root = new TreeNode(preOrder[rootPre]);
        int vinIndex = map.get(preOrder[rootPre]);
        root.left = getNode(rootPre + 1,left,vinIndex - 1);
        root.right = getNode(rootPre + (vinIndex - left) + 1,vinIndex + 1,right);
        return root;
    }
}
