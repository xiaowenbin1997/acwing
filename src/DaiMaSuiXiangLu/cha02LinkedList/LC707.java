package DaiMaSuiXiangLu.cha02LinkedList;

public class LC707 {
}
//
//class MyLinkedList {
//    ListNode dummy;
//    int size;
//
//    public MyLinkedList() {
//        dummy = new ListNode(-1);
//        size = 0;
//    }
//
//    public int get(int index) {
//        if (index < 0 || index > size) return -1;
//        else {
//            ListNode cur = dummy.next;
//            while (index > 0) {
//                index--;
//                cur = cur.next;
//            }
//            return cur.val;
//        }
//    }
//
//    public void addAtHead(int val) {
//        addAtIndex(0, val);
//    }
//
//    public void addAtTail(int val) {
//        addAtIndex(size, val);
//    }
//
//    public void addAtIndex(int index, int val) {
//        //index > size,不插入
//        if (index > size) return;
//        ListNode tempNode = new ListNode(val);
//        //index小于等于0，在链表头结点处插入
//        if (index <= 0) {
//            tempNode.next = dummy.next;
//            dummy.next = tempNode;
//        }
//        //节点加到链表末尾
//        else if (index == size) {
//            ListNode cur = dummy;
//            while (cur.next != null) {
//                cur = cur.next;
//                index--;
//            }
//            cur.next = tempNode;
//        }
//        //节点加到链表中间
//        else {
//            ListNode cur = dummy;
//            while (index-- > 0) {
//                cur = cur.next;
//            }
//            tempNode.next = cur.next;
//            cur.next = tempNode;
//        }
//        size++;
//    }
//
//    public void deleteAtIndex(int index) {
//        if (index < 0 || index >= size)  return;
//        ListNode cur = dummy;
//        while (index-- > 0) {
//            cur = cur.next;
//        }
//        cur.next = cur.next.next;
//        size--;
//    }
//
//    public static void main(String[] args) {
//        MyLinkedList linkedList = new MyLinkedList();
//        linkedList.addAtHead(7);
//        linkedList.addAtHead(2);
//        linkedList.addAtHead(1);
//        linkedList.addAtIndex(3, 0);
//        linkedList.deleteAtIndex(2);
//        linkedList.addAtHead(6);
//        linkedList.addAtTail(4);
//        linkedList.get(4);
//        linkedList.addAtHead(4);
//        linkedList.addAtIndex(5, 0);
//        linkedList.addAtHead(6);
//    }
//}

class MyLinkedList {
    class ListNode {
        int val;
        ListNode next, prev;

        ListNode(int x) {
            val = x;
        }
    }

    int size;
    ListNode dummy, tail;//Sentinel node

    public MyLinkedList() {
        size = 0;
        dummy = new ListNode(-1);
        tail = dummy;
    }

    public int get(int index) {
        if (index < 0 || index >= size) return -1;
        ListNode cur = dummy.next;
        while (index-- > 0) {
            cur = cur.next;
        }
        return cur.val;
    }

    public void addAtHead(int val) {
        ListNode tempNode = new ListNode(val);
        tempNode.next = dummy.next;
        dummy.next = tempNode;
        tempNode.prev = dummy;
        if (size == 0) {
            tail = tempNode;
        } else {
            tempNode.next.prev = tempNode;
        }
        size++;
    }

    public void addAtTail(int val) {
        if (size == 0) {
            addAtHead(val);
        } else {
            ListNode tempNode = new ListNode(val);
            tail.next = tempNode;
            tempNode.prev = tail;
            tail = tempNode;
            size++;
        }
    }

    public void addAtIndex(int index, int val) {
        if (index <= 0) {
            addAtHead(val);
        } else if (index == size) {
            addAtTail(val);
        } else if (index > size) {
            return;
        } else {
            ListNode tempNode = new ListNode(val);
            ListNode cur = dummy.next;
            index--;
            while (index-- > 0) {
                cur = cur.next;
            }
            tempNode.next = cur.next;
            tempNode.next.prev = tempNode;
            cur.next = tempNode;
            tempNode.prev = cur;
            size++;
        }
    }

    public void deleteAtIndex(int index) {
        if (index < 0 || index >= size) {
            return;
        } else if (index == size - 1) {
            ListNode temp = tail.prev;
            temp.next = null;
            tail.prev = null;
            tail = temp;
        } else {
            ListNode cur = dummy;
            while (index-- > 0) {
                cur = cur.next;
            }
            cur.next = cur.next.next;
            cur.next.prev = cur;
        }
        size--;
    }

    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addAtHead(1);
        myLinkedList.addAtTail(3);
        myLinkedList.addAtIndex(1,2);
        myLinkedList.get(1);
        myLinkedList.deleteAtIndex(1);
        myLinkedList.get(1);
    }
}