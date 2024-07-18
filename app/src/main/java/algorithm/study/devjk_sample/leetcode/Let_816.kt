package algorithm.study.devjk_sample.leetcode

/**
 * 리트코드 - Ambiguous Coordinates
 *
 * @link https://leetcode.com/problems/ambiguous-coordinates
 */
class Let_816 {

    fun ambiguousCoordinates(s: String): List<String> {
        val ans: MutableList<String> = mutableListOf()
        split(s, ans)
        return ans
    }

    private fun split(s: String, ans: MutableList<String>) {
        for (i in 2 until s.length - 1) {
            val first = s.substring(1, i)
            val second = s.substring(i, s.length - 1)
            ans.addAll(getDigit(first, second))
        }
    }

    private fun getDigit(s1: String, s2: String): List<String> {
        val arr: MutableList<String> = mutableListOf()

        // do dot
        for (i in 1 until s1.length) {
            val point1 = s1.substring(0, i)
            val point2 = s1.substring(i, s1.length)

            if (point1.length > 1 && point1.first() == '0') {
                continue
            }
            if (point2.last() == '0') {
                continue
            }

            // check s2
            for (j in 1 until s2.length) {
                val point3 = s2.substring(0, j)
                val point4 = s2.substring(j, s2.length)
                if (point3.length > 1 && point3.first() == '0') {
                    continue
                }
                if (point4.last() == '0') {
                    continue
                }

                arr.add("($point1.$point2, $point3.$point4)")
            }

            if (!(s2.length > 1 && s2.first() == '0')) {
                arr.add("($point1.$point2, $s2)")
            }
        }

        // check full
        if (!(s1.length > 1 && s1.first() == '0')) {
            for (j in 1 until s2.length) {
                val point3 = s2.substring(0, j)
                val point4 = s2.substring(j, s2.length)
                if (point3.length > 1 && point3.first() == '0') {
                    continue
                }
                if (point4.last() == '0') {
                    continue
                }

                arr.add("($s1, $point3.$point4)")
            }

            if (!(s2.length > 1 && s2.first() == '0')) {
                arr.add("($s1, $s2)")
            }
        }

        return arr
    }
}

fun main(args: Array<String>) {
    val sol = Let_816()
    println(sol.ambiguousCoordinates("(123)"))
    println(sol.ambiguousCoordinates("(0123)"))
    println(sol.ambiguousCoordinates("(00011)"))
}