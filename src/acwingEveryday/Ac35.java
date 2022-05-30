package acwingEveryday;

import java.util.Stack;

public class Ac35 {
    //用栈来做
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null)  return head;
        Stack<ListNode> tempStack = new Stack<>();
        while (head != null) {
            tempStack.push(head);
            head = head.next;
        }
        ListNode cur = tempStack.pop();
        head = cur;
        while (!tempStack.isEmpty()) {
            cur.next = tempStack.pop();
            cur = cur.next;
        }
        cur.next = null;
        return head;
    }
    //用快慢指针来做
    public ListNode reverseList1(ListNode head) {
        if (head == null || head.next == null)  return head;
        ListNode pre = head,cur = head.next;
        while (cur != null) {
            ListNode temp = cur.next;
            cur.next = pre;
            pre = cur;
            cur = temp;
        }
        head.next = null;
        return pre;
    }
}
