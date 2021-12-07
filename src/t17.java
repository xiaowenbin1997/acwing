import sun.swing.BakedArrayList;

import java.util.*;

/**
 * 输入一个链表的头结点，按照 从尾到头 的顺序返回节点的值。
 *
 * 返回的结果用数组存储。
 *
 * 样例
 * 输入：[2, 3, 5]
 * 返回：[5, 3, 2]
 */
public class t17 {
    public static void main(String[] args) {
      ListNode dummy = new ListNode(-1);
      ListNode head = dummy;
      Scanner scanner = new Scanner(System.in);
      while (scanner.hasNextInt()) {
          int numTemp = scanner.nextInt();
          ListNode temp = new ListNode(numTemp);
          dummy.next = temp;
          dummy = dummy.next;
      }
      head = head.next;
      SolutionT17 solutionT17 = new SolutionT17();
      int[] nums = solutionT17.printListReversingly(head);
      for (int i = 0;i < nums.length;i++) {
          System.out.println(nums[i]);
      }
    }
}
class SolutionT17 {
    public int[] printListReversingly(ListNode head) {
        List<Integer> tempList = new ArrayList<Integer>();
        while (head != null) {
            tempList.add(head.val);
            head = head.next;
        }
        Collections.reverse(tempList);
        int [] numsRet = new int[tempList.size()];
        int i = 0;
        for (Integer num : tempList) {
            numsRet[i++] = num;
        }
        return numsRet;
    }
}