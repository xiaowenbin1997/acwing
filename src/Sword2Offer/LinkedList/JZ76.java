package Sword2Offer.LinkedList;

public class JZ76 {
    public ListNode deleteDuplication(ListNode pHead) {
        if (pHead == null || pHead.next == null) {
            return pHead;
        }
        ListNode pre = pHead;
        ListNode cur = pHead;
        while (cur.next != null && cur.val == cur.next.val) {
            cur = cur.next;
        }
        if (pre == cur) {
            pre = pre.next;
            cur = cur.next;
        } else {
            pre = cur;
        }
        return pHead;
    }
}
