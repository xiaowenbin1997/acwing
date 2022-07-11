package DaiMaSuiXiangLu.cha02LinkedList;

public class LeetCode203 {
    public ListNode removeElements(ListNode head, int val) {
        if (head == null)   return head;
        ListNode dummy = new ListNode(val - 1);
        dummy.next = head;
        ListNode pre = dummy,cur = head;
        while (cur != null) {
            if (val == cur.val) {
                pre.next = cur.next;
                cur = pre.next;
            }else {
                pre = cur;
                cur = cur.next;
            }
        }
        return dummy.next;
    }

    public static void main(String[] args) {
        int[] nums = {7,7,7,7};
        ListNode head = initLinkedList(nums);
        LeetCode203 leetCode203 = new LeetCode203();
        leetCode203.removeElements(head,7);
    }

    private static ListNode initLinkedList(int[] nums) {
        ListNode dummy = new ListNode(-1);
        ListNode cur = dummy;
        for (int i = 0;i < nums.length;i++) {
            ListNode temp = new ListNode(nums[i]);
            cur.next = temp;
            cur = cur.next;
        }
        cur.next = null;
        return dummy.next;
    }

}
