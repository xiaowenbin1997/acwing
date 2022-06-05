package acwingEveryday;

import java.util.Stack;

public class Ac42 {
    public boolean isPopOrder(int [] pushV,int [] popV) {
        if ((pushV == null && popV == null) || (pushV.length == 0 && popV.length == 0)) return true;
        if (pushV.length != popV.length)    return false;
        Stack<Integer> input = new Stack<>();
        int j = 0;
        for (int i = 0;i < pushV.length;i++) {
            input.push(pushV[i]);
            while (!input.isEmpty() && input.peek() == popV[j]) {
                input.pop();
                j++;
            }
        }
        if (input.isEmpty())
            return true;
        else
            return false;
    }
}
