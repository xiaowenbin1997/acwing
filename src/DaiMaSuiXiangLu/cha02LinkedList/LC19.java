package DaiMaSuiXiangLu.cha02LinkedList;

import java.util.Stack;

/**
 * 给你一个链表，删除链表的倒数第 n 个结点，并且返回链表的头结点。
 */
public class LC19 {
    //这是用的双指针法
    public ListNode removeNthFromEnd1(ListNode head, int n) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode slow = dummy, fast = dummy;
        //快指针先走n + 1步
        while (n-- > 0) {
            fast = fast.next;
        }
        fast = fast.next;
        //然后快慢指针一起走
        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }
        if (slow.next != null) {
            slow.next = slow.next.next;
        } else {
            slow.next = null;
        }
        return dummy.next;
    }

    //利用栈来做这件事，就是把所有元素先入栈，然后挨个出栈，直接出栈到倒数第n + 1个元素
    public ListNode removeNthFromEnd(ListNode head, int n) {
        Stack<ListNode> nodeStack = new Stack<>();
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode cur = dummy;
        //全部入栈
        while (cur != null) {
            nodeStack.add(cur);
            cur = cur.next;
        }
        //开始出栈
        while (n-- > 0) {
            nodeStack.pop();
        }
        //pre指向被删除节点的前一个元素
        ListNode pre = nodeStack.pop();
        if (pre.next != null) {
            pre.next = pre.next.next;
        }
        return dummy.next;
    }
}
