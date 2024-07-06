package algorithm.study.devjk_sample.leetcode

/**
 * 리트코드 - Container With Most Water
 *
 * @link https://leetcode.com/problems/container-with-most-water
 */
class Let_11 {

    fun maxArea(heights: IntArray): Int {

        var max = 0
        var left = 0
        var right = heights.size - 1

        while (left < right) {
            val lHeight = heights[left]
            val rHeight = heights[right]

            val width = right - left
            val height = lHeight.coerceAtMost(rHeight)

            val size = width * height
            max = Math.max(size, max)

            if (lHeight < rHeight) {
                left++
            } else if (lHeight > rHeight) {
                right--
            } else { // equals
                if (heights[left + 1] < heights[right - 1]) {
                    right--
                } else {
                    left++
                }
            }
        }

        return max
    }

}

fun main(args: Array<String>) {
    val sol = Let_11()
    println(sol.maxArea(intArrayOf(1, 8, 6, 2, 5, 4, 8, 3, 7)))
}