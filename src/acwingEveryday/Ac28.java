package acwingEveryday;

/**
 * 给定单向链表的一个节点指针，定义一个函数在O(1)时间删除该结点。
 * 假设链表一定存在，并且该节点一定不是尾节点。
 */
public class Ac28 {
    public void deleteNode(ListNode node) {
        ListNode nextNode = node.next;
        int tempVal = node.val;
        node.val = nextNode.val;
        nextNode.val = tempVal;
        node.next = nextNode.next;
    }
}
