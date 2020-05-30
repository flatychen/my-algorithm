package flaty.swordToOffer._09用两个栈实现队列;

import java.util.Stack;

/**
 * @author flaty
 * @date 2020-5-29
 */
public class Solution {


    private Stack<Integer> stack1;
    private Stack<Integer> stack2;


    public Solution() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    public void appendTail(int value) {
        stack1.push(value);
    }

    public int deleteHead() {
        if (stack1.empty()) {
            return -1;
        }
        while (!stack1.empty()) {
            stack2.push(stack1.pop());
        }
        int head = stack2.pop();
        while (!stack2.empty()) {
            stack1.push(stack2.pop());
        }
        return head;
    }

/**
 * Your CQueue object will be instantiated and called as such:
 * CQueue obj = new CQueue();
 * obj.appendTail(value);
 * int param_2 = obj.deleteHead();
 */


}

