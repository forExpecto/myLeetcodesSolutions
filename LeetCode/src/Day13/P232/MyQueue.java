package Day13.P232;

import java.util.Stack;

class MyQueue {
    private Stack<Integer> inStack=new Stack<>();
    private Stack<Integer> outStack=new Stack<>();

    public MyQueue() {
    }

    public void push(int x) {
        inStack.push(x);
    }

    public int pop() {
        if(outStack.isEmpty()){
            while (!inStack.isEmpty()) {
                outStack.push(inStack.pop());
            }
        }
        return outStack.pop();
    }

    public int peek() {
        if(outStack.isEmpty()){
            while (!inStack.isEmpty()) {
                outStack.push(inStack.pop());
            }
        }
        return outStack.peek();
    }

    public boolean empty() {
        return inStack.empty()&&outStack.empty();
    }
}