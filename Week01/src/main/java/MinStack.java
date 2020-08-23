import java.util.Stack;

//--------------------- Change Logs----------------------
// <p>@author ruirui.qu Initial Created at 2020-08-23<p>
//  155,使用辅助栈
//-------------------------------------------------------
public class MinStack {
    private Stack<Integer> dataStack;
    private Stack<Integer> minStack;

    public MinStack() {
        dataStack = new Stack<Integer>();
        minStack = new Stack<Integer>();
    }

    public void push(int x) {
        dataStack.push(x);
        if (minStack.isEmpty() || x < minStack.peek()) {
            minStack.push(x);
        }
    }

    public void pop() {
        int x = dataStack.pop();
        if (x == minStack.peek()) {
            minStack.pop();
        }
    }

    public int top(){
        return dataStack.peek();
    }

    public int getMin(){
        return minStack.peek();
    }
}