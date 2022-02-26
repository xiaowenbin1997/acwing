package Sword2Offer.LinkedList;

import java.util.Stack;

public class JZ52 {
    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
        if (pHead1 == null || pHead2 == null) {
            return null;
        }
        ListNode cur01 = pHead1;
        ListNode cur02 = pHead2;
        while (cur01 != cur02) {
            cur01 = cur01.next;
            cur02 = cur02.next;
            if (cur01 == cur02) {
                break;
            } else if (cur01 == null) {
                cur01 = pHead2;
            } else if (cur02 == null) {
                cur02 = pHead1;
            }
        }
        return cur01;
    }
    //栈解法
    public ListNode FindFirstCommonNode1(ListNode pHead1, ListNode pHead2) {
        if (pHead1 == null || pHead2 == null) {
            return null;
        }
        Stack<ListNode> stack1 = new Stack<>();
        Stack<ListNode> stack2 = new Stack<>();
        while (pHead1 != null) {
            stack1.push(pHead1);
            pHead1 = pHead1.next;
        }
        while (pHead2 != null) {
            stack2.push(pHead2);
            pHead2 = pHead2.next;
        }
        ListNode result = null;
        while (!stack1.isEmpty() && !stack2.isEmpty() && stack1.peek() == stack2.peek()) {
            result = stack1.pop();
            stack2.pop();
        }
        return result;
    }
}
