package algorithm.study.devjk_sample.leetcode

/**
 * 리트코드 - Strobogrammatic Number II
 *
 * @link https://leetcode.com/problems/strobogrammatic-number-ii
 */
class Let_247 {

    fun findStrobogrammatic(n: Int): List<String> {
        val arr: MutableList<String> = mutableListOf()
        checkAll(n, arr, 0, IntArray(n))
        return arr
    }

    private fun checkAll(n: Int, arr: MutableList<String>, index: Int, cur: IntArray) {
        if (index >= cur.size / 2) {
            if (n % 2 == 0) {
                makePop(cur)
                arr.add(cur.joinToString(""))
                return
            }

            val pset = intArrayOf(0, 1, 8)
            for (ps in pset) {
                cur[cur.size / 2] = ps
                makePop(cur)
                arr.add(cur.joinToString(""))
            }
            return
        }

        val set = intArrayOf(0, 1, 6, 8, 9)

        for (t in set) {
            if (index == 0 && t == 0) {
                continue
            }
            cur[index] = t
            checkAll(n, arr, index + 1, cur)
        }
    }

    private fun makePop(cur: IntArray) {
        for (i in cur.size / 2 - 1 downTo 0) {
            var target = cur[i]
            if (target == 6) {
                target = 9
            } else if (target == 9) {
                target = 6
            }
            cur[cur.size - 1 - i] = target
        }
    }
}

fun main(args: Array<String>) {
    val sol = Let_247()
    println(sol.findStrobogrammatic(2))
    println(sol.findStrobogrammatic(1))
    println(sol.findStrobogrammatic(3))
}