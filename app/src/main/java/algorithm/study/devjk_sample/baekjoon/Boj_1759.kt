package algorithm.study.devjk_sample.baekjoon

/**
 * 백준 - 암호 만들기
 *
 * @link https://www.acmicpc.net/problem/1759
 */
class Boj_1759 {
    fun solve() {
        val input = readln().split(" ")
        val l = input[0].toInt()
        val c = input[1].toInt()
        val template = readln().split(" ").sorted()
        val arr = arrayOfNulls<String>(l)

        combination(0, 0, arr, template, 0, 0, l)
    }

    fun combination(
        arrIndex: Int,
        templateIndex: Int,
        arr: Array<String?>,
        template: List<String>,
        a: Int,
        b: Int,
        l: Int,
    ) {
        if (arrIndex == l) {
            if (a < 1 || b < 2) return
            println(arr.joinToString(""))
            return
        }

        for (i in templateIndex until template.size) {
            val ch = template[i]
            arr[arrIndex] = ch
            if (isVowel(ch)) {
                combination(arrIndex + 1, i + 1, arr, template, a + 1, b, l)
            } else {
                combination(arrIndex + 1, i + 1, arr, template, a, b + 1, l)
            }
        }
    }

    fun isVowel(ch: String): Boolean {
        return ch == "a" || ch == "e" || ch == "i" || ch == "o" || ch == "u"
    }

}

fun main(args: Array<String>) {
    val sol = Boj_1759();
    sol.solve();
}