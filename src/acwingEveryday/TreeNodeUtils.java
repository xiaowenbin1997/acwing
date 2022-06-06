package acwingEveryday;

public class TreeNodeUtils {
    public static TreeNode getTree(int[] nums) {
        TreeNode[] treeNodes = getTreeNodes(nums);
        for (int i = 0;i < treeNodes.length / 2;i++) {
            treeNodes[i].left = 2 * i + 1 < treeNodes.length ? treeNodes[2 * i + 1] : null;
            treeNodes[i].right = 2 * i + 2 < treeNodes.length ? treeNodes[2 * i + 2] : null;
        }
        return treeNodes[0];
    }
    private static TreeNode[] getTreeNodes(int[] nums) {
        TreeNode[] treeNodes = new TreeNode[nums.length];
        for (int i = 0;i < nums.length;i++) {
            if (nums[i] == 0)  treeNodes[i] = null;
            else treeNodes[i] = new TreeNode(nums[i]);
        }
        return treeNodes;
    }
}
