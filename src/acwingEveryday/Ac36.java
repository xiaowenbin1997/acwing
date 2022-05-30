package acwingEveryday;

public class Ac36 {
    public ListNode merge(ListNode l1, ListNode l2) {
        ListNode newHead = new ListNode(-1);
        ListNode cur = newHead;
        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                cur.next = l1;
                cur = cur.next;
                l1 = l1.next;
            } else {
                cur.next = l2;
                cur = cur.next;
                l2 = l2.next;
            }
        }
        while (l1 != null) {
            cur.next = l1;
            cur = cur.next;
            l1 = l1.next;
        }
        while (l2 != null) {
            cur.next = l2;
            cur = cur.next;
            l2 = l2.next;
        }
        return newHead.next;
    }

    public static void main(String[] args) {
        int[] nums1 = {1,3,5};
        int[] nums2 = {2,4,5};
        ListNode head1 = getListNodeHead(nums1);
        ListNode head2 = getListNodeHead(nums2);
        Ac36 ac36 = new Ac36();
        ListNode merge = ac36.merge(head1, head2);
    }

    private static ListNode getListNodeHead(int[] nums) {
        ListNode[] nodes = new ListNode[nums.length];
        for (int i = 0;i < nums.length;i++) {
            nodes[i] = new ListNode(nums[i]);
        }
        for (int i = 0;i < nums.length - 1;i++) {
            nodes[i].next = nodes[i + 1];
        }
        return nodes[0];
    }
}
