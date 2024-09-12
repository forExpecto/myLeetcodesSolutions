package Day15.P150;

import java.util.Stack;

public class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for (int i=0; i<tokens.length; i++) {
            if (tokens[i].equals("+")||tokens[i].equals("-")||tokens[i].equals("*")||tokens[i].equals("/")) {
                int num1=stack.peek();
                stack.pop();
                int num2=stack.peek();
                stack.pop();
                if(tokens[i].equals("+"))stack.push(num1+num2);
                if(tokens[i].equals("-"))stack.push(num1-num2);
                if(tokens[i].equals("*"))stack.push(num1*num2);
                if(tokens[i].equals("/"))stack.push(num1/num2);
            }else {
                stack.push(Integer.parseInt(tokens[i]));
            }
        }
        return stack.peek();
    }
}
