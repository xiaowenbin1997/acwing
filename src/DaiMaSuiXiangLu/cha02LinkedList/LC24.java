package DaiMaSuiXiangLu.cha02LinkedList;

public class LC24 {
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null)  return head;
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode cur = dummy;
        while (cur.next != null && cur.next.next != null) {
            ListNode node1 = cur.next;
            ListNode node2 = node1.next;
            cur.next = node2;
            node1.next = node2.next;
            node2.next = node1;
            cur = node1;
        }
        return dummy.next;
    }
    public ListNode swapPairs01(ListNode head) {
        // base case 退出提交
        if(head == null || head.next == null) return head;
        // 获取当前节点的下一个节点
        ListNode next = head.next;
        // 进行递归
        ListNode newNode = swapPairs01(next.next);
        // 这里进行交换
        next.next = head;
        head.next = newNode;

        return next;
    }

    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        LC24 lc24 = new LC24();
        lc24.swapPairs01(node1);
    }
}
