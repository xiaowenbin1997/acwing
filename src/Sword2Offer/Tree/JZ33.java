package Sword2Offer.Tree;

/**
 * 输入一个整数数组，判断该数组是不是某二叉搜索树的后序遍历的结果。如果是则返回 true ,否则返回 false 。假设输入的数组的任意两个数字都互不相同
 */
public class JZ33 {
    public boolean VerifySquenceOfBST(int [] sequence) {
        if (sequence.length == 0)   return false;
        return recur(sequence,0,sequence.length - 1);
    }
    public static boolean recur(int[] nums,int left,int right) {
        if (left > right) {
            return true;
        }
        int p = left;
        //1.先找区间分界点
        while (nums[p] < nums[right]){
            p++;
        }
        //左区间的右边界点
        int m = p - 1;
        //2.判断右子树区间全大于根节点
        while (nums[p] > nums[right]) {
            p++;
        }
        return p == right && recur(nums,left,m) && recur(nums,m + 1,right - 1);
    }
}
