package Sword2Offer.LinkedList;

import java.util.HashSet;
import java.util.Set;

public class JZ23 {
    public ListNode EntryNodeOfLoop(ListNode pHead) {
        if (pHead == null) {
            return null;
        }
        Set<ListNode> collector = new HashSet<>();
        ListNode result = null;
        while (pHead != null) {
            collector.add(pHead);
            pHead = pHead.next;
            if (collector.contains(pHead)) {
                result = pHead;
                break;
            }
        }
        return result;
    }
    //快慢指针版本
    public ListNode EntryNodeOfLoop2(ListNode pHead) {
        if (pHead == null || pHead.next == null) {
            return null;
        }
        ListNode fastNode = pHead;
        ListNode slowNode = pHead;
        while (fastNode != null) {
            slowNode = slowNode.next;
            if (fastNode.next != null) {
                fastNode = fastNode.next.next;
            }
            if (slowNode == fastNode) {
                break;
            }
        }
        ListNode newNode = pHead;
        while (fastNode != null && fastNode != newNode) {
            fastNode = fastNode.next;
            newNode = newNode.next;
        }
        return fastNode;
    }
}
