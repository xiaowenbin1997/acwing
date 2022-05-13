package acwingEveryday;

public class Ac29 {
    public ListNode deleteDuplication(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode pre = dummy;
        ListNode cur = head;
        while (cur != null) {
            while (cur.next != null && cur.val == cur.next.val) {
                cur = cur.next;
            }
            if (pre.next == cur) {
                pre = cur;
                cur = cur.next;
            } else {
                cur = cur.next;
                pre.next = cur;
            }
        }
        return dummy.next;
    }
}
