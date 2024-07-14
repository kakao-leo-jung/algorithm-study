package algorithm.study.devjk_sample.leetcode

import java.util.*

/**
 * 리트코드 - Advantage Shuffle
 *
 * @link https://leetcode.com/problems/advantage-shuffle
 */
class Let_870 {

    fun advantageCount(nums1: IntArray, nums2: IntArray): IntArray {
        val ans = IntArray(nums1.size)
        nums1.sort()
        var left = 0
        var right = nums1.size - 1
        val pq = PriorityQueue<Pair<Int, Int>>(compareByDescending { it.first })
        for (i in nums2.indices) {
            val num = nums2[i]
            pq.add(Pair(num, i))
        }

        while (!pq.isEmpty()) {
            val pair = pq.poll()
            val value = pair.first
            val index = pair.second
            if (nums1[right] > value) {
                ans[index] = nums1[right--]
            } else {
                ans[index] = nums1[left++]
            }
        }
        return ans
    }

}

fun main(args: Array<String>) {
    val sol = Let_870()
    println(sol.advantageCount(intArrayOf(2, 7, 11, 15), intArrayOf(1, 10, 4, 11)).joinToString(","))
    println(sol.advantageCount(intArrayOf(12, 24, 8, 32), intArrayOf(13, 25, 32, 11)).joinToString(","))
}