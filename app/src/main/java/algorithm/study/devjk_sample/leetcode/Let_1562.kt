package algorithm.study.devjk_sample.leetcode

/**
 * 리트코드 - Find Latest Group of Size M
 *
 * @link https://leetcode.com/problems/find-latest-group-of-size-m
 */
class Let_1562 {

    fun findLatestStep(arr: IntArray, m: Int): Int {
        var ans = -1
        val len = IntArray(arr.size + 1)
        val cnt = IntArray(arr.size + 1)
        var index = 1
        for (num in arr) {
            len[num] = 1

            // check has left
            var left = 0
            if (num - 1 > 0 && len[num - 1] != 0) {
                // no left side
                left = len[num - 1]
            }

            // check has right
            var right = 0
            if (num + 1 < len.size && len[num + 1] != 0) {
                // no left side
                right = len[num + 1]
            }

            len[num + right] = left + right + 1
            len[num - left] = left + right + 1
            len[num] = left + right + 1
            cnt[left]--
            cnt[right]--
            cnt[len[num]]++

            if (cnt[m] > 0) {
                ans = index
            }

            index++
        }

        return ans
    }

}

fun main(args: Array<String>) {
    val sol = Let_1562()
    println(sol.findLatestStep(intArrayOf(3, 5, 1, 2, 4), 1))
    println(sol.findLatestStep(intArrayOf(3, 1, 5, 4, 2), 2))
    println(sol.findLatestStep(intArrayOf(2, 1), 2))
}