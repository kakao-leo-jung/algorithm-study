package algorithm.study.devjk_sample.leetcode


/**
 * 리트코드 - Find the Score of All Prefixes of an Array
 *
 * @link https://leetcode.com/problems/find-the-score-of-all-prefixes-of-an-array
 */
class Let_2640 {

    fun findPrefixScore(nums: IntArray): LongArray {
        var max = 0
        var prev: Long = 0
        val ans = LongArray(nums.size)

        for (i in nums.indices) {
            val num = nums[i]
            max = max.coerceAtLeast(num)
            val conver = num + max
            ans[i] = prev + conver
            prev = ans[i]
        }

        return ans
    }
}

fun main(args: Array<String>) {
    val sol = Let_2640()
    println(sol.findPrefixScore(intArrayOf(2, 3, 7, 5, 10)).joinToString(","))
    println(sol.findPrefixScore(intArrayOf(1, 1, 2, 4, 8, 16)).joinToString(","))
}