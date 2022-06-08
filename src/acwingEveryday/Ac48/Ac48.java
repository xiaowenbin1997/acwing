package acwingEveryday.Ac48;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

class ListNode {
    int val;
    ListNode next,random;
    ListNode(int x) {this.val = x;}
}
public class Ac48 {
    Map<ListNode, ListNode> oldNew;
    public ListNode copyRandomList(ListNode head) {
        if (head == null)   return head;
        oldNew = new HashMap<>();
        ListNode temp = head;
        while (temp != null) {
            oldNew.put(temp,new ListNode(temp.val));
            temp = temp.next;
        }
        ListNode newHead = oldNew.get(head);
        while (head != null) {
            newHead.next = oldNew.get(head.next);
            newHead.random = oldNew.get(head.random);
            head = head.next;
            newHead = newHead.next;
        }
        return newHead;
    }
}
