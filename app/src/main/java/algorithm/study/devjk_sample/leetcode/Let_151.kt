package algorithm.study.devjk_sample.leetcode

/**
 * 리트코드 - Reverse Words in a String
 *
 * @link https://leetcode.com/problems/reverse-words-in-a-string
 */
class Let_151 {

    fun reverseWords(s: String): String {

        val arr: MutableList<String> = mutableListOf()
        var isReadingWord = false
        val builder = StringBuilder()

        // add all tokens in arr
        for (c in s) {
            if (c.isWhitespace()) {
                if (isReadingWord) {
                    // end of reading token
                    isReadingWord = false
                    arr.add(builder.toString())
                    builder.clear()
                }
            } else {
                isReadingWord = true
                builder.append(c)
            }
        }

        if (builder.isNotEmpty()) {
            arr.add(builder.toString())
        }
        builder.clear()

        for (i in arr.size - 1 downTo 0) {
            val token = arr[i]
            builder.append(token)

            if (i != 0) {
                builder.append(" ")
            }
        }

        return builder.toString()
    }

}

fun main(args: Array<String>) {
    val sol = Let_151()
    println(sol.reverseWords("the sky is blue"))
    println(sol.reverseWords("  hello world  "))
    println(sol.reverseWords("a good   example"))
}