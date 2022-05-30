package acwingEveryday;

public class Ac34 {
    public ListNode entryNodeOfLoop(ListNode head) {
        if (head == null || head.next == head)   return head;
        ListNode pre = head,cur = head;
        while (cur != null && pre != null) {
            cur = cur.next;
            pre = pre.next;
            if (cur == null)   return null;
            else cur = cur.next;
            if (pre == cur) break;
        }
        if(cur == null) return null;
        pre = head;
        while (cur != pre) {
            cur = cur.next;
            pre = pre.next;
        }
        return cur;
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, 9, 10, 7, 8, 2, 5, 6, 4};
        ListNode[] nodes = getListNodes(nums);
        for (int i = 0;i < nodes.length - 1;i++) {
            nodes[i].next = nodes[i + 1];
        }
//        nodes[nums.length - 1].next = nodes[2];
        Ac34 ac34 = new Ac34();
        ListNode listNode = ac34.entryNodeOfLoop(nodes[0]);
        System.out.println(listNode);
    }

    private static ListNode[] getListNodes(int[] nums) {
        ListNode[] nodes = new ListNode[nums.length];
        for (int i = 0;i < nums.length;i++) {
            nodes[i] = new ListNode(nums[i]);
        }
        return nodes;
    }


}
