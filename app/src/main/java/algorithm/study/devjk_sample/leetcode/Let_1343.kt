package algorithm.study.devjk_sample.leetcode

/**
 * 리트코드 - Number of Sub-arrays of Size K and Average Greater than or Equal to Threshold
 *
 * @link https://leetcode.com/problems/number-of-sub-arrays-of-size-k-and-average-greater-than-or-equal-to-threshold
 */
class Let_1343 {

    fun numOfSubarrays(arr: IntArray, k: Int, threshold: Int): Int {
        var ans = 0
        var cSum = 0
        var left = 0
        var right = k - 1

        // get first avg
        for (i in 0 until k) {
            cSum += arr[i]
        }
        if (cSum / k >= threshold) {
            ans++
        }

        while (right < arr.size - 1) {
            // calculate next
            cSum -= arr[left++]
            cSum += arr[++right]

            if (cSum / k >= threshold) {
                ans++
            }
        }

        return ans
    }
}

fun main(args: Array<String>) {
    val sol = Let_1343()
    println(sol.numOfSubarrays(intArrayOf(2, 2, 2, 2, 5, 5, 5, 8), 3, 4))
    println(sol.numOfSubarrays(intArrayOf(11, 13, 17, 23, 29, 31, 7, 5, 2, 3), 3, 5))
}