package ningmengTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Node {
    int value;
    Node next;
}

public class Pro3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        String[] strings = s.split(" ");
        int[] nums = new int[strings.length];
        for (int i = 0; i < strings.length; i++) {
            nums[i] = Integer.parseInt(strings[i]);
        }
        Node head = initList(nums);
        Node sortList = sortList(head);
        while (sortList != null) {
            System.out.print(sortList.value);
            if (sortList.next != null) {
                System.out.print(" ");
            }
            sortList = sortList.next;
        }
    }

    public static Node initList(int[] nums) {
        Node dummy = new Node();
        if (nums.length == 0) return dummy;
        Node head = dummy;
        dummy.value = -1;
        for (int i = 0; i < nums.length; i++) {
            Node temp = new Node();
            temp.value = nums[i];
            head.next = temp;
            head = head.next;
        }
        head.next = null;
        return dummy.next;
    }

    //插入排序
    public static Node sortList(Node head) {
        if (head == null || head.next == null) return head;
        Node dummy = new Node();
        dummy.value = head.value - 1;
        dummy.next = null;
        while (head != null) {
            Node pre = dummy;
            Node cur = pre.next;
            while (cur != null && head.value > cur.value) {
                pre = cur;
                cur = cur.next;
            }
            pre.next = head;
            Node temp = head.next;
            head.next = cur;
            head = temp;
        }
        return dummy.next;
    }
}
