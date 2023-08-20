package algorithm.study.devjk_sample.baekjoon

/**
 * 백준 - N과 M (1)
 *
 * @link https://www.acmicpc.net/problem/15649
 */
class Boj_15649 {
    fun solve() {
        var input = readln().split(" ")
        val n = input[0].toInt()
        val m = input[1].toInt()
        var arr = IntArray(m)
        var visited = BooleanArray(n + 1)

        combination(1, 0, n, m, arr, visited)

    }

    fun combination(cur: Int, curIndex: Int, n: Int, m: Int, arr: IntArray, visited: BooleanArray) {
        if(curIndex == m) {
            println(arr.joinToString(" "))
            return
        }

        for(i in 1..n) {
            if(visited[i]) continue
            visited[i] = true
            arr[curIndex] = i
            combination(cur + 1, curIndex + 1, n, m, arr, visited)
            visited[i] = false
        }
    }

}

fun main(args: Array<String>) {
    val sol = Boj_15649();
    sol.solve();
}