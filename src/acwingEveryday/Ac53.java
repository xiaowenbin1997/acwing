package acwingEveryday;

import java.util.*;

public class Ac53 {
    public List<Integer> getLeastNumbers_Solution(int [] input, int k) {
        LinkedList<Integer> result = new LinkedList<>();
        if (input == null || input.length == 0) return result;
        PriorityQueue<Integer> pQueue = new PriorityQueue(k,new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        int count = 0;
        for (int num : input) {
            if (count < k) {
                pQueue.offer(num);
                count++;
            } else {
                if (num < pQueue.peek()) {
                    pQueue.poll();
                    pQueue.offer(num);
                }
            }
        }
        while (!pQueue.isEmpty()) {
            result.addFirst(pQueue.poll());
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {9, 6, 13, 8, 1};
        Ac53 ac53 = new Ac53();
        List<Integer> result = ac53.getLeastNumbers_Solution(nums, nums.length);
        System.out.println(result);
    }
}
