package algorithm.study.devjk_sample.leetcode

/**
 * 리트코드 - Sparse Matrix Multiplication
 *
 * @link https://leetcode.com/problems/sparse-matrix-multiplication
 */
class Let_311 {

    fun multiply(mat1: Array<IntArray>, mat2: Array<IntArray>): Array<IntArray> {

        val ans: Array<IntArray> = Array(mat1.size) { IntArray(mat2[0].size) }
        for (i in mat1.indices) {
            for (j in mat2[0].indices) {
                for (k in mat2.indices) {
                    ans[i][j] += mat1[i][k] * mat2[k][j]
                }
            }
        }

        return ans
    }
}

fun main(args: Array<String>) {
    val sol = Let_311()

    println(
        sol.multiply(
            arrayOf(
                intArrayOf(1, 0, 0),
                intArrayOf(-1, 0, 3)
            ), arrayOf(
                intArrayOf(7, 0, 0),
                intArrayOf(0, 0, 0),
                intArrayOf(0, 0, 1),
            )
        ).flatMap { it.asList() }.joinToString(" ")
    )

    println(
        sol.multiply(
            arrayOf(
                intArrayOf(0)
            ), arrayOf(
                intArrayOf(0)
            )
        ).flatMap { it.asList() }.joinToString(" ")
    )

    println(
        sol.multiply(
            arrayOf(
                intArrayOf(1, -5)
            ), arrayOf(
                intArrayOf(12),
                intArrayOf(-1)
            )
        ).flatMap { it.asList() }.joinToString(" ")
    )
}