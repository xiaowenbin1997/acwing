package Sword2Offer.LinkedList;

public class JZ76 {
    public ListNode deleteDuplication(ListNode pHead) {
        if (pHead == null ||pHead.next == null) {
            return pHead;
        }
        ListNode dummy = new ListNode(-1);
        ListNode cur = dummy;
        while (pHead != null) {
            if (pHead.next == null || pHead.val != pHead.next.val) {
                cur.next = pHead;
                cur = cur.next;
            }
            while (pHead.next != null && pHead.val == pHead.next.val) {
                pHead = pHead.next;
            }
            pHead = pHead.next;
        }
        cur.next = null;
        return dummy.next;
    }
    //有递归算法，但难度比较高
}
