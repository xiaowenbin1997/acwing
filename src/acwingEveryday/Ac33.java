package acwingEveryday;

public class Ac33 {
    public ListNode findKthToTail(ListNode pListHead, int k) {
        ListNode left = pListHead,right = pListHead;
        while (right != null && k > 0) {
            right = right.next;
            k--;
        }
        if (right == null && k > 0) return null;
        left = pListHead;
        while (right != null) {
            right = right.next;
            left = left.next;
        }
        return left;
    }
}
