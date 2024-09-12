package Day19.P739;

import java.util.Stack;

public class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] res = new int[temperatures.length];
        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        for (int i = 1; i < temperatures.length; i++) {
            if(temperatures[i]<=temperatures[stack.peek()]) {
                stack.push(i);
            }else {
                while (!stack.isEmpty()&&temperatures[i]>temperatures[stack.peek()]) {
                    res[stack.peek()] = i - stack.peek();
                    stack.pop();
                }
                stack.push(i);
            }
        }
        return res;
    }
}
