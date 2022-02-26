package Sword2Offer.LinkedList;

import java.util.List;

//合并两个
public class JZ25 {
    public static ListNode Merge(ListNode list1,ListNode list2) {
        if (list1 == null && list2 == null) {
            return null;
        } else if (list1 == null) {
            return list2;
        } else if (list2 == null) {
            return list1;
        }
        ListNode newHead = null;
        if (list1.val < list2.val) {
            newHead = list1;
            list1 = list1.next;
        } else {
            newHead = list2;
            list2 = list2.next;
        }
        ListNode dummy = newHead;
        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                newHead.next = list1;
                newHead = newHead.next;
                list1 = list1.next;
            } else {
                newHead.next = list2;
                newHead = newHead.next;
                list2 = list2.next;
            }
        }
        while (list1 != null) {
            newHead.next = list1;
            newHead = newHead.next;
            list1 = list1.next;
        }
        while (list2 != null) {
            newHead.next = list2;
            newHead = newHead.next;
            list2 = list2.next;
        }
        return dummy;
    }
    //递归方法
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null) {
            return list2;
        } else if (list2 == null) {
            return list1;
        } else if (list1.val < list2.val) {
            list1.next = mergeTwoLists(list1.next,list2);
            return list1;
        } else {
            list2.next = mergeTwoLists(list1,list2.next);
            return list2;
        }
    }

    public static ListNode mergeTwoLists1(ListNode list1, ListNode list2) {
        ListNode preHead = new ListNode(-1);
        ListNode cur = preHead;
        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                cur.next = list1;
                list1 = list1.next;
            } else {
                cur.next = list2;
                list2 = list2.next;
            }
            cur = cur.next;
        }
        cur.next = list1 == null ? list2 : list1;
        return preHead.next;
    }

    public static void main(String[] args) {
        ListNode preHead01 = new ListNode(-1);
        ListNode cur01 = preHead01;
        int[] arrays01 = new int[]{2,4,6,8};
        int[] arrays02 = new int[]{1,3,5,7};
        for (int i = 0; i < arrays01.length; i++) {
            ListNode temp = new ListNode(arrays01[i]);
            cur01.next = temp;
            cur01 = cur01.next;
        }
        ListNode preHead02 = new ListNode(-1);
        ListNode cur02 = preHead02;
        for (int i = 0; i < arrays02.length; i++) {
            ListNode temp = new ListNode(arrays02[i]);
            cur02.next = temp;
            cur02 = cur02.next;
        }
        preHead01 = preHead01.next;
        preHead02 = preHead02.next;
        mergeTwoLists(preHead01,preHead02);
    }
}
