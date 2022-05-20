package 数据结构入门;
//232. 用栈实现队列

import java.util.Stack;

/**
 * @author zal
 * @date 2022/5/12 9:07
 */
public class Demo232 {
    public static void main(String[] args) {

    }

}

class MyQueue {
    Stack<Integer> stack1 = null;
    Stack<Integer> stack2 = null;

    public MyQueue() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    public void push(int x) {
        stack1.push(x);
    }

    public int pop() {
        if (stack2.isEmpty()) {
            int len = stack1.size();
            for (int i = 0; i < len; i++) {
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }

    public int peek() {
        if (stack2.isEmpty()) {
            int len = stack1.size();
            for (int i = 0; i < len; i++) {
                stack2.push(stack1.pop());
            }
        }
        return stack2.peek();
    }

    public boolean empty() {
        return stack1.isEmpty() && stack2.isEmpty();
    }
}
