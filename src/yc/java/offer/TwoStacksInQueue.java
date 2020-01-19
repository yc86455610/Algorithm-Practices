package yc.java.offer;

/**
 * @program: Algorithm-Practices
 * @description: 用两个栈实现队列--offer19
 * @author: yc
 * @create: 2019-11-27 21:34
 **/

import java.util.Stack;

/**
 * 题目描述：用两个栈实现队列，完成队列的push和pop操作
 *
 * 思路：in栈用来处理入栈操作，out栈用来处理出栈操作
 * 一个元素进入in栈之后，出栈顺序被反转。
 * 元素要出栈时，需要先进入out栈，此时元素出栈顺序再一次被反转。
 * 因为出栈顺序和入栈顺序是相同的，先进入的先退出，这就是队列的顺序。
 */
public class TwoStacksInQueue {
    //先定义in栈和out栈
    Stack<Integer> in = new Stack<>();
    Stack<Integer> out = new Stack<>();

    //实现push方法
    public void push(int node) {
        in.push(node);
    }

    //实现pop方法
    public int pop() throws Exception {
        if (in.isEmpty() && out.isEmpty()) {
            throw new RuntimeException("queue is empty!");
        }
        if (out.isEmpty()) {
            while (!in.isEmpty()) {
                out.push(in.pop());
            }
        }
        return out.pop();
    }
}
