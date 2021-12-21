package QueueTest;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Stack;

public class QueueTest01 {
    public static void main(String[] args) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<Integer>(new Comparator<Integer>(){
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        priorityQueue.offer(1);
        priorityQueue.offer(2);
        priorityQueue.offer(3);
        System.out.println(priorityQueue.poll());
    }
}
