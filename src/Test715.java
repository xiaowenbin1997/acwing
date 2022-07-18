//import DaiMaSuiXiangLu.cha02LinkedList.ListNode;
//
//import java.util.LinkedList;
//import java.util.Scanner;
//import java.util.Stack;
//
//public class Test715 {
//    public static void main(String[] args) {
//        LinkedList<Integer> input = new LinkedList<>();
//        for (int i = 0; i < 10; i++) {
//            input.add(i + 1);
//        }
//        Scanner scanner = new Scanner(System.in);
//    }
//
//    public static ListNode reverse(ListNode head, int k) {
//        ListNode newHead = new ListNode(-1);
//        ListNode dummy = newHead;
//        Stack<ListNode> tempStack = new Stack<>();
//        while (head != null) {
//            if (tempStack.size() == k) {
//                while (!tempStack.isEmpty()) {
//                    ListNode tempNode = tempStack.pop();
//                    newHead.next = tempNode;
//                    newHead = newHead.next;
//                }
//            }
//            tempStack.push(head);
//            head = head.next;
//        }
//        while (!tempStack.isEmpty()) {
//            ListNode tempNode = tempStack.pop();
//            newHead.next = tempNode;
//            newHead = newHead.next;
//        }
//        return dummy.next;
//    }
//}
