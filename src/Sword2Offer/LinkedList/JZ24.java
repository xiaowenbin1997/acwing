package Sword2Offer.LinkedList;

import java.util.Stack;

public class JZ24 {
//    public static ListNode ReverseList(ListNode head) {
//        if (head == null || head.next == null) {
//             return head;
//        }
//        Stack<ListNode> temp = new Stack<>();
//        while (head != null) {
//            temp.push(head);
//            head = head.next;
//        }
//        ListNode node = temp.pop();
//        ListNode dummy = node;
//        while (!temp.isEmpty()) {
//            ListNode tempNode = temp.pop();
//            node.next = tempNode;
//            node = node.next;
//        }
//        node.next = null;
//        return dummy;
//    }
    public static ListNode ReverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode newHead = null;
        while (head != null) {
            ListNode temp = head.next;
            head.next = newHead;
            newHead = head;
            head = temp;
        }
        return newHead;
    }
}
