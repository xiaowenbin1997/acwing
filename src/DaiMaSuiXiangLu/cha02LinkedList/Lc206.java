package DaiMaSuiXiangLu.cha02LinkedList;

//反转链表
public class Lc206 {
    //双指针版本
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode pre = dummy;
        ListNode cur = head;
        while (cur != null) {
            ListNode temp = cur.next;
            cur.next = pre;
            pre = cur;
            cur = temp;
        }
        head.next = null;
        return pre;
    }

    //递归版本
    public static ListNode reverseList01(ListNode head) {
        return reverse(null, head);
    }

    private static ListNode reverse(ListNode pre, ListNode cur) {
        if (cur == null) return pre;
        ListNode temp = cur.next;
        cur.next = pre;
        return reverse(cur,temp);
    }


    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        node1.next = node2;
        node2.next = node3;
        Lc206 lc206 = new Lc206();
        ListNode newHead = lc206.reverseList01(node1);
        while (newHead != null) {
            System.out.print(newHead.val + " ");
            newHead = newHead.next;
        }
    }
}
