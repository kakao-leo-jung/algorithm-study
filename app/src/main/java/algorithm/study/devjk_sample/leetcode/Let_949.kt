package algorithm.study.devjk_sample.leetcode

/**
 * 리트코드 - Largest Time for Given Digits
 *
 * @link https://leetcode.com/problems/largest-time-for-given-digits
 */
class Let_949 {

    var ans: String = ""
    var maxM: Int = -1

    fun largestTimeFromDigits(arr: IntArray): String {
        ans = ""
        maxM = -1
        dfs(0, Array(4) { false }, IntArray(4), arr)
        return ans
    }

    private fun dfs(cnt: Int, visited: Array<Boolean>, map: IntArray, arr: IntArray) {
        if (cnt >= 4) {
            checkAndUpdate(map)
            return
        }

        for (i in 0 until 4) {
            if (!visited[i]) {
                visited[i] = true
                map[cnt] = arr[i]
                dfs(cnt + 1, visited, map, arr)
                visited[i] = false
            }
        }
    }

    private fun checkAndUpdate(map: IntArray) {
        // time
        val time = map[0] * 10 + map[1]
        if (time > 23) {
            return
        }

        // minute
        val minute = map[2] * 10 + map[3]
        if (minute > 59) {
            return
        }

        // total minute
        val tm = time * 60 + minute
        if (tm > maxM) {
            ans = "${map[0]}${map[1]}:${map[2]}${map[3]}"
            maxM = tm
        }
    }

}

fun main(args: Array<String>) {
    val sol = Let_949()
    println(sol.largestTimeFromDigits(intArrayOf(1, 2, 3, 4)))
    println(sol.largestTimeFromDigits(intArrayOf(5, 5, 5, 5)))
    println(sol.largestTimeFromDigits(intArrayOf(0, 0, 0, 0)))
}