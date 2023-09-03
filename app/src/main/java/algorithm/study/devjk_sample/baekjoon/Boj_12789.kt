package algorithm.study.devjk_sample.baekjoon

import java.util.*

/**
 * 백준 - 도키도키 간식드리미
 *
 * @link https://www.acmicpc.net/problem/12789
 */
class Boj_12789 {

    fun solve() {
        val n = readln().toInt()
        val arr = readln().split(" ").map { num -> num.toInt() }
        val q: Queue<Int> = LinkedList(arr)
        val st = Stack<Int>()
        var target = 1
        while (!q.isEmpty()) {
            if (!st.empty() && st.peek() == target) {
                st.pop()
                target++
                continue
            }
            val cur = q.poll()
            if (cur == target) {
                target++
                continue
            }
            st.push(cur)
        }
        while (!st.empty()) {
            val cur = st.pop()
            if (cur != target) {
                print("Sad")
                return
            }
            target++
        }
        print("Nice")
    }
}

fun main(args: Array<String>) {
    val sol = Boj_12789()
    sol.solve()
}