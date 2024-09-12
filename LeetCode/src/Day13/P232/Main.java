package Day13.P232;

public class Main {
    public static void main(String[] args) {
        MyQueue myQueue = new MyQueue();
        myQueue.push(1);
        myQueue.push(2);
        myQueue.push(3);
        myQueue.push(4);
        myQueue.push(5);
        int a=myQueue.pop();
        int b=myQueue.peek();
        System.out.println(a+' '+b);
    }
}
