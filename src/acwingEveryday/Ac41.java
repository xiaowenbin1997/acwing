package acwingEveryday;

import java.util.Stack;

public class Ac41 {
    /** initialize your data structure here. */
    Stack<Integer> stack;
    Stack<Integer> minStack;
//    public MinStack() {
//        stack = new Stack<>();
//        minStack = new Stack<>();
//    }

    public void push(int x) {
        stack.push(x);
        if (!minStack.isEmpty())    x = Math.min(x, minStack.peek());
        minStack.push(x);
    }

    public void pop() {
        stack.pop();
        minStack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }

    public static void main(String[] args) {
        Ac41 ac41 = new Ac41();
        ac41.push(1);
        ac41.push(2);
    }
}
