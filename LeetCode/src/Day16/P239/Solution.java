package Day16.P239;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

class Solution {
    private class MyQueue{
        public Deque<Integer> queue = new ArrayDeque<>();
        public int front(){
            return queue.peek();
        }
        public void pop(int val){
            if(!queue.isEmpty()&&val == queue.peek()){
                queue.pop();
            }
        }
        public void push(int val){

        }
    }
    public int[] maxSlidingWindow(int[] nums, int k) {
        return new int[nums.length - k + 1];
    }
}