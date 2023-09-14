package algorithm.study.devjk_sample.programmers

/**
 * 프로그래머스 - 체육복
 *
 * @link https://school.programmers.co.kr/learn/courses/30/lessons/42862
 */
class Prg_42862 {

    fun solution(n: Int, lost: IntArray, reserve: IntArray): Int {
        val arr = Array(n + 1) { 1 }
        for (num in lost) {
            arr[num]--
        }
        for (num in reserve) {
            arr[num]++
        }

        for (i in arr.indices) {
            if (i == 0) continue

            val cur = arr[i]
            if (cur != 2) {
                continue
            }
            val left = i - 1
            if (left >= 1 && arr[left] == 0) {
                arr[left] = 1
                arr[i] = 1
                continue
            }

            val right = i + 1
            if (right < arr.size && arr[right] == 0) {
                arr[right] = 1
                arr[i] = 1
                continue
            }

        }

        var ans = 0
        for (i in arr.indices) {
            if (i == 0) {
                continue
            }
            if (arr[i] > 0) {
                ans++
            }
        }
        return ans
    }

}

fun main(args: Array<String>) {
    val sol = Prg_42862()
    println(sol.solution(5, intArrayOf(2, 4), intArrayOf(1, 3, 5)))
    println(sol.solution(5, intArrayOf(2, 4), intArrayOf(3)))
    println(sol.solution(3, intArrayOf(3), intArrayOf(1)))
}