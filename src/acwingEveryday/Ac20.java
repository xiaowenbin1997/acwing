package acwingEveryday;

import java.util.Stack;

/**
 * 请用栈实现一个队列，支持如下四种操作：
 * push(x) – 将元素x插到队尾；
 * pop() – 将队首的元素弹出，并返回该元素；
 * peek() – 返回队首元素；
 * empty() – 返回队列是否为空；
 */
public class Ac20 {

}
class MyQueue {
    Stack<Integer> s1;//进入时使用的栈
    Stack<Integer> s2;//弹出时使用的栈
    /** Initialize your data structure here. */
    public MyQueue() {
        s1 = new Stack<>();
        s2 = new Stack<>();
    }

    /** Push element x to the back of queue. */
    public void push(int x) {
        while (!s2.isEmpty()) {
            s1.push(s2.pop());
        }
        s1.push(x);
    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        if (!s2.isEmpty()) {
            return s2.pop();
        }
        while (!s1.isEmpty()) {
            s2.push(s1.pop());
        }
        return s2.pop();
    }

    /** Get the front element. */
    public int peek() {
        if (!s2.isEmpty()) {
            s2.peek();
        }
        while (!s1.isEmpty()) {
            s2.push(s1.pop());
        }
        return s2.peek();
    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
        if (s1.isEmpty() && s2.isEmpty()) {
            return true;
        }
        return false;
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */