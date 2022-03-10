package Sword2Offer.Tree;

public class JZ7Test {
    public static void main(String[] args) {
        String preOrder = "1,2,4,7,3,5,6,8";
        String inOrder = "4,7,2,1,5,3,8,6";
        int[] pre = str2int(preOrder);
        int[] vin = str2int(inOrder);
        Solution solution = new Solution();
        TreeNode treeNode = solution.reConstructBinaryTree(pre, vin);

    }

    public static int[] str2int(String str) {
        String[] strs = str.split(",");
        int[] nums = new int[strs.length];
        for (int i = 0; i < strs.length; i++) {
            nums[i] = Integer.parseInt(strs[i]);
        }
        return nums;
    }
}
