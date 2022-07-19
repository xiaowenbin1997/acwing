package DaiMaSuiXiangLu.cha02LinkedList;

public class LC0207 {
    //双指针法，但是指针遍历比较晦涩
    public ListNode getIntersectionNode01(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) return null;
        ListNode curA = headA;
        ListNode curB = headB;
        while (curA != curB) {
            curA = curA == null ? headB : curA.next;
            curB = curB == null ? headA : curB.next;
        }
        return curA;
    }
    //先求长度差，然后先开始遍历一个链表
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int lengthA = 0;
        int lengthB = 0;
        ListNode curA = headA;
        ListNode curB = headB;
        while (curA != null) {
            lengthA++;
            curA = curA.next;
        }
        while (curB != null) {
            lengthB++;
            curB = curB.next;
        }
        ListNode fast;
        ListNode slow;
        int dist;
        if (lengthA > lengthB) {
            dist = lengthA - lengthB;
            fast = headA;
            slow = headB;
        } else {
            dist = lengthB - lengthA;
            fast = headB;
            slow = headA;
        }
        while (dist-- > 0) {
            fast = fast.next;
        }
        while (fast != slow) {
            fast = fast.next;
            slow = slow.next;
        }
        return fast;
    }
}
