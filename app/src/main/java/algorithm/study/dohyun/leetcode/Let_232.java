package algorithm.study.dohyun.leetcode;
import java.util.Stack;
public class Let_232 {
    private Stack<Integer> realstk = new Stack<>();
    private Stack<Integer> tmpstk = new Stack<>();

    static class MyQueue {
        private Stack<Integer> realstk = new Stack<>();
        private Stack<Integer> tmpstk = new Stack<>();
        public MyQueue() {}

        public void push(int x) {
            while ( !realstk.isEmpty() ){
                tmpstk.push(realstk.pop());
            }
            realstk.push(x);
            while( !tmpstk.isEmpty() ){
                realstk.push(tmpstk.pop());
            }
        }

        public int pop() {
            return realstk.pop();
        }

        public int peek() {
            return realstk.peek();
        }

        public boolean empty() {
            return realstk.isEmpty();
        }
    }



}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */