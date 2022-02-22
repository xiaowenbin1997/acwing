package Sword2Offer.LinkedList;

import java.util.ArrayList;

/**
 * JZ6 从尾到头打印链表,输入一个链表的头节点，按链表从尾到头的顺序返回每个节点的值（用数组返回）。
 */
public class JZ6 {
//    public static ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
//        ArrayList<Integer> list = new ArrayList<>();
//        Stack<Integer> tempStack = new Stack<>();
//        if (listNode == null) {
//            return list;
//        }
//        while (listNode != null) {
//            tempStack.push(listNode.val);
//            listNode = listNode.next;
//        }
//        while (!tempStack.isEmpty()) {
//            list.add(tempStack.pop());
//        }
//        return list;
//    }
    public static ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> resultList = new ArrayList<>();
        if (listNode == null) {
            return resultList;
        }
        while (listNode != null) {
            resultList.add(0,listNode.val);
            listNode = listNode.next;
        }
        return resultList;
    }

    public static void main(String[] args) {
        ListNode listNode = new ListNode(1);
    }
}
