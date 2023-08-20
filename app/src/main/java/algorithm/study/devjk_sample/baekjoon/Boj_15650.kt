package algorithm.study.devjk_sample.baekjoon

/**
 * 백준 - N과 M (2)
 *
 * @link https://www.acmicpc.net/problem/15650
 */
class Boj_15650 {

    fun solve() {
        var input = readln().split(" ")
        val n = input[0].toInt()
        val m = input[1].toInt()
        var arr = IntArray(m)

        combination(1, 0, n, m, arr)
    }

    fun combination(cur: Int, curIndex: Int, n: Int, m: Int, arr: IntArray) {
        if (curIndex == m) {
            println(arr.joinToString(" "))
            return
        }

        for (i in cur..n) {
            arr[curIndex] = i
            combination(i + 1, curIndex + 1, n, m, arr)
        }
    }

}

fun main(args: Array<String>) {
    val sol = Boj_15650();
    sol.solve();
}