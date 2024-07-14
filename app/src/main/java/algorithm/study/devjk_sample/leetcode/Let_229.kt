package algorithm.study.devjk_sample.leetcode

/**
 * 리트코드 - Majority Element II
 *
 * @link https://leetcode.com/problems/majority-element-ii
 */
class Let_229A {

    fun majorityElement(nums: IntArray): List<Int> {
        val ans : MutableList<Int> = mutableListOf()
        val len = nums.size / 3
        nums.sort()

        var before = 1000000001
        var i = 0
        var cnt = 0
        while(i < nums.size) {
            val num = nums[i]
            if(before != num) {
                before = num
                cnt++
                i++
                while(i < nums.size && nums[i] == before) {
                    cnt++
                    i++
                }
                if(cnt > len) {
                    ans.add(before)
                }
                cnt = 0
            }
        }
        return ans
    }

}

fun main(args: Array<String>) {
    val sol = Let_229A()
    println(sol.majorityElement(intArrayOf(3, 2, 3)))
    println(sol.majorityElement(intArrayOf(1)))
    println(sol.majorityElement(intArrayOf(1, 2)))
    println(sol.majorityElement(intArrayOf(1, 2, 3)))
}