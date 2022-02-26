package Sword2Offer.LinkedList;

import java.util.HashMap;
import java.util.Map;

public class JZ35 {
    public RandomListNode Clone(RandomListNode pHead) {
        if (pHead == null) {
            return pHead;
        }
        Map<RandomListNode,RandomListNode> randomMap = new HashMap<>();
        RandomListNode dummy = new RandomListNode(-1);
        RandomListNode tail = dummy;
        RandomListNode cur = pHead;
        while (cur != null) {
            RandomListNode temp = new RandomListNode(cur.label);
            randomMap.put(cur,temp);
            tail.next = temp;
            tail = tail.next;
            cur = cur.next;
        }
        tail = dummy.next;
        while (pHead != null) {
            RandomListNode randomNode = randomMap.get(pHead.random);
            tail.random = randomNode;
            pHead = pHead.next;
            tail = tail.next;
        }
        return dummy.next;
    }

    public static void main(String[] args) {
        RandomListNode[] nodes = new RandomListNode[5];
        for (int i = 0;i < 5;i++) {
            nodes[i] = new RandomListNode(i);
        }
        for (int i = 0;i < 4;i++) {
            nodes[i].next = nodes[i + 1];
        }
        nodes[0].random = nodes[3];
        nodes[1].random = nodes[2];
        nodes[2].random = nodes[0];
        nodes[3].random = null;
        nodes[4].random = null;
        JZ35 jz35 = new JZ35();
        jz35.Clone(nodes[0]);
    }
}
