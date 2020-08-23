//--------------------- Change Logs----------------------
// <p>@author ruirui.qu Initial Created at 2020-08-23<p>
// 自定义栈
//-------------------------------------------------------
public class MinStack2 {

    private Node head;

    public void push (int x){
        if (head ==null){
            head = new Node(x,x);
        }else{
            head = new Node(x,Math.min(x,head.min),head);
        }
    }

    public void pop(){
        head = head.next;
    }

    public int top(){
        return head.val;
    }

    public int getMin(){
        return head.min;
    }
    public static class Node {
        int val;
        int min;
        Node next;

        public Node(int val, int min) {
            this.val = val;
            this.min = min;
        }

        public Node(int val, int min, Node next) {
            this.val = val;
            this.min = min;
            this.next = next;
        }
    }
}