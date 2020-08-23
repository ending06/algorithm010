import java.util.Stack;

//--------------------- Change Logs----------------------
// <p>@author ruirui.qu Initial Created at 2020-08-23<p>
//-------------------------------------------------------
public class MinStack1 {
    private Stack<Node> stack;

    public MinStack1() {
        this.stack = new Stack<Node>();
    }

    public void push(int x) {
        if (stack.isEmpty()) {
            stack.push(new Node(x, x));
        } else {
            stack.push(new Node(x, Math.min(x, stack.peek().min)));
        }
    }

    public void pop() {
        stack.pop();
    }

    public int top() {
        return stack.peek().val;
    }

    public int getMin() {
        return stack.peek().min;
    }

    private static class Node {
        int val;
        int min;

        public Node(int val, int min) {
            this.val = val;
            this.min = min;
        }
    }
}