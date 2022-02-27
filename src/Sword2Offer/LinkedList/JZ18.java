package Sword2Offer.LinkedList;

import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;

public class JZ18 {
    public ListNode deleteNode (ListNode head, int val) {
        if (head == null || head.next == null) {
            if (head.val != val) {
                return head;
            } else {
                return null;
            }
        }
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode pre = dummy;
        ListNode cur = head;
        while (cur != null) {
            if (cur.val == val) {
                pre.next = cur.next;
                break;
            }
            pre = cur;
            cur = cur.next;
        }
        return dummy.next;
    }
}
