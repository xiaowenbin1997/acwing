
import java.util.ArrayList;
import java.util.Scanner;
public class Test712 {

        public static void main(String[] args) {
            // Scanner input=new Scanner(System.in);
            // String str=input.next();
            ArrayList<ListNode> nodeArrays= new ArrayList<ListNode>();
            for(int i = 0;i < 5;i++) {
                ListNode tempNode = new ListNode(i + 1);
                nodeArrays.add(tempNode);
            }
            for(int i =0;i < 4;i++) {
                nodeArrays.get(i).next = nodeArrays.get(i+1);
            }
            ListNode head = reverseList(nodeArrays.get(0));
            System.out.println("hello world");
        }

        public static ListNode reverseList(ListNode head){
            if(head == null || head.next == null)   return head;
            ListNode dummy = new ListNode(-1);
            dummy.next = head;
            ListNode cur = dummy;
            ListNode node1;
            ListNode node2;
            while(cur.next != null && cur.next.next != null) {
                node1 = cur.next;
                node2 = node1.next;
                cur.next = node2;
                node1.next = node2.next;
                node2.next = node1;
                cur = node1;
            }
            return dummy.next;
        }
}
//class ListNode{
//    int val;
//    ListNode next;
//    ListNode(int val) {
//        this.val = val;
//    }
//}