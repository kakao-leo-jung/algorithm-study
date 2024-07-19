package algorithm.study.devjk_sample.leetcode

/**
 * 리트코드 - Replace Elements in an Array
 *
 * @link https://leetcode.com/problems/replace-elements-in-an-array
 */
class Let_2295 {

    fun arrayChange(nums: IntArray, operations: Array<IntArray>): IntArray {

        val iMap: MutableMap<Int, Int?> = mutableMapOf()

        for (i in nums.indices) {
            val num = nums[i]
            iMap[num] = i
        }

        for (op in operations) {
            val ti = op[0]
            val value = op[1]
            val index = iMap[ti]!!
            nums[index] = value
            iMap[ti] = null
            iMap[value] = index
        }

        return nums
    }
}

fun main(args: Array<String>) {
    val sol = Let_2295()
    println(
        sol.arrayChange(
            intArrayOf(1, 2, 4, 6), arrayOf(
                intArrayOf(1, 3),
                intArrayOf(4, 7),
                intArrayOf(6, 1)
            )
        ).joinToString(", ")
    )

    println(
        sol.arrayChange(
            intArrayOf(1, 2), arrayOf(
                intArrayOf(1, 3),
                intArrayOf(2, 1),
                intArrayOf(3, 2)
            )
        ).joinToString(", ")
    )
}