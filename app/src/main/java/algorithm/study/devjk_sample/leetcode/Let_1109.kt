package algorithm.study.devjk_sample.leetcode

/**
 * 리트코드 - Corporate Flight Bookings
 *
 * @link https://leetcode.com/problems/corporate-flight-bookings
 */
class Let_1109 {

    fun corpFlightBookings(bookings: Array<IntArray>, n: Int): IntArray {

        val plusMap = IntArray(n + 2)
        val minusMap = IntArray(n + 2)
        val ans = IntArray(n)

        for (booking in bookings) {
            val first = booking[0]
            val last = booking[1]
            val seats = booking[2]

            plusMap[first] += seats
            minusMap[last + 1] += seats
        }

        var prev = 0
        for (i in 0 until n) {
            ans[i] = prev + plusMap[i + 1] - minusMap[i + 1]
            prev = ans[i]
        }

        return ans
    }

}

fun main(args: Array<String>) {
    val sol = Let_1109()
    println(
        sol.corpFlightBookings(
            arrayOf(
                intArrayOf(1, 2, 10),
                intArrayOf(2, 3, 20),
                intArrayOf(2, 5, 25)
            ), 5
        ).joinToString(", ")
    )

    println(
        sol.corpFlightBookings(
            arrayOf(
                intArrayOf(1, 2, 10),
                intArrayOf(2, 2, 15),
            ), 2
        ).joinToString(", ")
    )
}