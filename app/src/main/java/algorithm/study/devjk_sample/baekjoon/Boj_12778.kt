package algorithm.study.devjk_sample.baekjoon

/**
 * 백준 - CTP공국으로 이민 가자
 *
 * @link https://www.acmicpc.net/problem/12778
 */
class Boj_12778 {

    fun solve() {
        var problems = readln().toInt()
        while (problems-- > 0) {
            val read = readln().split(" ")
            val type = read[1]
            val inputs = readln().split(" ")
            for (input in inputs) {
                if ("C" == type) {
                    val num = input.first().code - 'A'.code + 1
                    print("$num ")
                } else if ("N" == type) {
                    val character = (input.toInt() + 'A'.code - 1).toChar()
                    print("$character ")
                }
            }
            println()
        }
    }
}

fun main(args: Array<String>) {
    val sol = Boj_12778()
    sol.solve()
}