package algorithm.study.devjk_sample.leetcode

/**
 * 리트코드 - Reverse Substrings Between Each Pair of Parentheses
 *
 * @link https://leetcode.com/problems/reverse-substrings-between-each-pair-of-parentheses
 */
class Let_1190 {

    fun reverseParentheses(s: String): String {
        return parse(s, 0, StringBuilder()).first.toString()
    }

    private fun parse(s: String, index: Int, sb: StringBuilder): Pair<StringBuilder, Int> {

        var i = index
        while (i < s.length) {
            val ch = s[i]
            if (ch == '(') {
                val inner = parse(s, i + 1, StringBuilder())
                sb.append(inner.first)
                i = inner.second
            } else if (ch == ')') {
                return Pair(sb.reverse(), i)
            } else {
                sb.append(ch)
            }
            i++
        }

        return Pair(sb, 0)
    }

}

fun main(args: Array<String>) {
    val sol = Let_1190()
    println(sol.reverseParentheses("(abcd)"))
    println(sol.reverseParentheses("(u(love)i)"))
    println(sol.reverseParentheses("(ed(et(oc))el)"))
}