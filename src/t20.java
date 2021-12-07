import java.util.Stack;

/**
 * 请用栈实现一个队列，支持如下四种操作：
 *
 * push(x) – 将元素x插到队尾；
 * pop() – 将队首的元素弹出，并返回该元素；
 * peek() – 返回队首元素；
 * empty() – 返回队列是否为空；
 * 注意：
 *
 * 你只能使用栈的标准操作：push to top，peek/pop from top, size 和 is empty；
 * 如果你选择的编程语言没有 栈的标准库，你可以使用list或者deque等模拟栈的操作；
 * 输入数据保证合法，例如，在队列为空时，不会进行pop或者peek等操作；
 */
public class t20 {
    public static void main(String[] args) {
        MyQueue myQueue = new MyQueue();
        myQueue.push(1);
        myQueue.push(2);
        myQueue.push(3);
        int x1 = myQueue.pop();
        int x2 = myQueue.peek();
        int x3 = myQueue.pop();
        myQueue.push(4);;
        myQueue.push(5);
        int x4 = myQueue.pop();
        int x5 = myQueue.pop();
    }
}

class MyQueue {
    Stack<Integer> s1;
    Stack<Integer> s2;
    /** Initialize your data structure here. */
    public MyQueue() {
        //s1作为进栈
        s1 = new Stack<>();
        //s2作为出栈
        s2 = new Stack<>();
    }

    /** Push element x to the back of queue. */
    public void push(int x) {
        //s1或s2有一个为空,就push
        while (!s2.empty()) {
            s1.push(s2.pop());
        }
        s1.push(x);
    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        if (s2.empty()) {
            if (!s1.empty()) {
                int s1Len = s1.size();
                while (s1Len > 0) {
                    s2.push(s1.pop());
                    s1Len--;
                }
            }
        }
        return s2.pop();
    }

    /** Get the front element. */
    public int peek() {
        if (s2.empty()) {
            if (!s1.empty()) {
                int s1Len = s1.size();
                while (s1Len > 0) {
                    s2.push(s1.pop());
                    s1Len--;
                }
            }
        }
        return s2.peek();
    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
        return s2.empty() && s1.empty();
    }
}