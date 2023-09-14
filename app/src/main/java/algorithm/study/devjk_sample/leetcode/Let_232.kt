package algorithm.study.devjk_sample.leetcode

import java.util.*

/**
 * 리트코드 - Implement Queue using Stacks
 *
 * @link https://leetcode.com/problems/implement-queue-using-stacks
 */
class Let_232 {

    class MyQueue() {
        private val stackForPush: Stack<Int> = Stack()
        private val stackForPop: Stack<Int> = Stack()

        fun push(x: Int) {
            switch("PUSH")
            stackForPush.push(x)
        }

        fun pop(): Int {
            switch("POP")
            return stackForPop.pop()
        }

        fun peek(): Int {
            switch("POP")
            return stackForPop.peek()
        }

        fun empty(): Boolean {
            switch("PUSH")
            return stackForPush.isEmpty()
        }

        private fun switch(mode: String) {
            if (mode == "PUSH") {
                while (!stackForPop.isEmpty()) {
                    stackForPush.push(stackForPop.pop())
                }
            } else if (mode == "POP") {
                while (!stackForPush.isEmpty()) {
                    stackForPop.push(stackForPush.pop())
                }
            } else {
                throw RuntimeException("Unreachable");
            }
        }
    }

    /**
     * Your MyQueue object will be instantiated and called as such:
     * var obj = MyQueue()
     * obj.push(x)
     * var param_2 = obj.pop()
     * var param_3 = obj.peek()
     * var param_4 = obj.empty()
     */

}

fun main(args: Array<String>) {
    val sol = Let_232.MyQueue()
}