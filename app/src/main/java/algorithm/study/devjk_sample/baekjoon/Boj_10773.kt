package algorithm.study.devjk_sample.baekjoon

import java.util.*

/**
 * 백준 - 제로
 *
 * @link https://www.acmicpc.net/problem/10773
 */
class Boj_10773 {

    fun solve(): Int {
        val k = readln().toInt()
        var st = Stack<Int>()
        for (i in 1..k) {
            val num = readln().toInt()
            if (num == 0) {
                st.pop()
                continue
            }
            st.push(num)
        }

        var ans = 0
        while (!st.empty()) {
            ans += st.pop()
        }
        return ans
    }
}

fun main(args: Array<String>) {
    val sol = Boj_10773()
    print(sol.solve())
}