package algorithm.study.devjk_sample.leetcode

/**
 * 리트코드 - Restore the Array From Adjacent Pairs
 *
 * @link https://leetcode.com/problems/restore-the-array-from-adjacent-pairs
 */
class Let_1743 {

    fun restoreArray(adjacentPairs: Array<IntArray>): IntArray {

        val countSet: MutableSet<Int> = mutableSetOf()
        val adjacentMap: MutableMap<Int, MutableList<Int>> = mutableMapOf()
        // find only one
        for (adjacentPair in adjacentPairs) {
            val num1 = adjacentPair[0]
            val num2 = adjacentPair[1]

            if (countSet.contains(num1)) {
                countSet.remove(num1)
            } else {
                countSet.add(num1)
            }

            if (!adjacentMap.containsKey(num1)) {
                adjacentMap[num1] = mutableListOf()
            }
            adjacentMap[num1]?.add(num2)

            if (countSet.contains(num2)) {
                countSet.remove(num2)
            } else {
                countSet.add(num2)
            }

            if (!adjacentMap.containsKey(num2)) {
                adjacentMap[num2] = mutableListOf()
            }
            adjacentMap[num2]?.add(num1)
        }

        val first: Int = countSet.first()
        val ans = IntArray(adjacentPairs.size + 1)
        val usedSet: MutableSet<Int> = mutableSetOf()

        var value = first
        for (i in ans.indices) {
            ans[i] = value
            usedSet.add(value)

            if (i == ans.size - 1) {
                break
            }

            // find next
            val arr = adjacentMap[value]!!
            if (!usedSet.contains(arr[0])) {
                value = arr[0]
            } else {
                value = arr[1]
            }

        }
        return ans
    }
}

fun main(args: Array<String>) {
    val sol = Let_1743()
    println(
        sol.restoreArray(
            arrayOf(
                intArrayOf(2, 1),
                intArrayOf(3, 4),
                intArrayOf(3, 2)
            )
        ).joinToString(",")
    )

    println(
        sol.restoreArray(
            arrayOf(
                intArrayOf(4, -2),
                intArrayOf(1, 4),
                intArrayOf(-3, 1)
            )
        ).joinToString(",")
    )

    println(
        sol.restoreArray(
            arrayOf(
                intArrayOf(100000, -100000)
            )
        ).joinToString(",")
    )
}