package Sword2Offer.LinkedList;
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

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
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

    public ListNode mergeTwoLists1(ListNode list1, ListNode list2) {
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
}
