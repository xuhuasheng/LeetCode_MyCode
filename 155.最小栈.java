
/*
 * @lc app=leetcode.cn id=155 lang=java
 *
 * [155] 最小栈
 */
// 设计一个支持 push，pop，top 操作，并能在常数时间内检索到最小元素的栈。

// push(x) -- 将元素 x 推入栈中。
// pop() -- 删除栈顶的元素。
// top() -- 获取栈顶元素。
// getMin() -- 检索栈中的最小元素。

// 示例:

// MinStack minStack = new MinStack();
// minStack.push(-2);
// minStack.push(0);
// minStack.push(-3);
// minStack.getMin();   --> 返回 -3.
// minStack.pop();
// minStack.top();      --> 返回 0.
// minStack.getMin();   --> 返回 -2.
import java.util.Stack;
class MinStack {

    /** initialize your data structure here. */

    private static Stack<Integer> minStack;

    public MinStack() {
        minStack = new Stack<Integer>();
    }
    
    public void push(int x) {
        if (minStack.isEmpty()) {
            minStack.push(x);
            minStack.push(x);
        } else {
            int min_temp = minStack.peek();
            if (x < min_temp) {
                min_temp = x;
            } 
            minStack.push(x);
            minStack.push(min_temp);
        }
    }
    
    public void pop() {
        minStack.pop();
        minStack.pop();
    }
    
    public int top() {
        return minStack.get(minStack.size()-2);
    }
    
    public int getMin() {
        return minStack.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */

