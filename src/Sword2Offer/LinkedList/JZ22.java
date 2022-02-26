package Sword2Offer.LinkedList;

import java.util.Stack;

public class JZ22 {
    //栈解法
    public ListNode FindKthToTail0 (ListNode pHead, int k) {
        Stack<ListNode> temp = new Stack<>();
        while (pHead != null) {
            temp.push(pHead);
            pHead = pHead.next;
        }
        ListNode result = null;
        while (k > 0 && !temp.isEmpty()) {
            result = temp.pop();
            k--;
        }
        return k > 0 ? null : result;
    }
    //双指针
    public ListNode FindKthToTail1 (ListNode pHead, int k) {
        if (pHead == null) {
            return null;
        }
        ListNode right = pHead;
        while (k > 0) {
            if (right == null) {
                return right;
            }
            right = right.next;
            k--;
        }
        ListNode left = pHead;
        while (right != null) {
            left = left.next;
            right = right.next;
        }
        return left;
    }
    int size = 0;
    //栈解决
    public ListNode FindKthToTail (ListNode pHead, int k) {
        if (pHead == null) {
            return pHead;
        }
        ListNode node = FindKthToTail(pHead.next,k);
        size++;
        if (size < k) {
            return null;
        } else if (size == k) {
            return pHead;
        } else {
            return node;
        }
    }
}
