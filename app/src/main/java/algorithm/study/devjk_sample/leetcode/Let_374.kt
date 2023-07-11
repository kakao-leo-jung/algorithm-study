package algorithm.study.devjk_sample.leetcode

class Let_374 : GuessGame() {

    override fun guessNumber(n: Int): Int {
        var start: Long = 1;
        var end: Long = n.toLong();
        var cur: Long = (start + end) / 2
        var guessResult = guess(cur.toInt())
        while (guessResult != 0) {
            println(cur)
            if (guessResult == 1) {
                // my guess is lower than picked number
                start = cur + 1
            } else {
                // my guess is higher than picked number
                end = cur - 1
            }
            cur = (start + end) / 2
            guessResult = guess(cur.toInt())
        }
        return cur.toInt()
    }
}

open class GuessGame {
    fun guess(num: Int): Int {
        val ans = 1702766719;
        if (num > ans) {
            return -1;
        } else if (num < ans) {
            return 1;
        }
        return 0;
    }

    open fun guessNumber(n: Int): Int {
        // fixme
        return 0;
    }
}

fun main(args: Array<String>) {
    val sol = Let_374()
    print(sol.guessNumber(2126753390))
}