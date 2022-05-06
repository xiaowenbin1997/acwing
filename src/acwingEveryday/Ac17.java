package acwingEveryday;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

/**
 * 输入一个链表的头结点，按照 从尾到头 的顺序返回节点的值。
 *
 * 返回的结果用数组存储。
 *
 * 数据范围
 * 0≤ 链表长度 ≤1000。
 * 法1：用栈
 * 法2：双指针改变链表顺序
 */
public class Ac17 {
//    public int[] printListReversingly(ListNode head) {
//        Stack<Integer> temp = new Stack<Integer>();
//        while (head != null) {
//            temp.push(head.val);
//            System.out.println(head.val);
//            head = head.next;
//        }
//        int length = temp.size();
//        System.out.println(length);
//        int[] result = new int[length];
//        int i = 0;
//        while (!temp.isEmpty()) {
//            result[i++] = temp.pop();
//        }
//        return result;
//    }
    public int[] printListReversingly(ListNode head) {
        ListNode newHead = reverseLinkedList(head);
        List<Integer> result = new ArrayList<>();
        while (newHead != null) {
            result.add(newHead.val);
            newHead = newHead.next;
        }
        int[] nums = new int[result.size()];
        for (int i = 0;i < nums.length;i++) {
            nums[i] = result.get(i);
        }
        return nums;
    }
    public ListNode reverseLinkedList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode pre = head;
        ListNode cur = pre.next;
        while (cur != null) {
            ListNode temp = cur.next;
            cur.next = pre;
            pre = cur;
            cur = temp;
        }
        head.next = null;
        head = pre;
        return head;
    }
}
