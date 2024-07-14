package algorithm.study.devjk_sample.leetcode

/**
 * 리트코드 - Subarray Product Less Than K
 *
 * @link https://leetcode.com/problems/subarray-product-less-than-k
 */
class Let_713 {

    // this algorithm time complexity = O(N2)
    // todo - get O(N) with using sliding window
    fun numSubarrayProductLessThanK(nums: IntArray, k: Int): Int {
        var ans = 0
        for(i in nums.indices) {
            var before = 1
            for(j in i until nums.size) {
                if(before * nums[j] < k) {
                    ans++
                    before *= nums[j]
                } else {
                    break
                }
            }
        }
        return ans
    }

}

fun main(args: Array<String>) {
    val sol = Let_713()
    println(sol.numSubarrayProductLessThanK(intArrayOf(10, 5, 2, 6), 100))
    println(sol.numSubarrayProductLessThanK(intArrayOf(1, 2, 3), 0))
    println(sol.numSubarrayProductLessThanK(intArrayOf(10,9,10,4,3,8,3,3,6,2,10,10,9,3), 19))
}