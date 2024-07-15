package algorithm.study.devjk_sample.leetcode

/**
 * 리트코드 - Split Two Strings to Make Palindrome
 *
 * @link https://leetcode.com/problems/split-two-strings-to-make-palindrome
 */
class Let_1616 {

    fun checkPalindromeFormation(a: String, b: String): Boolean {
        var isAPalindrome = true
        var isAContinue = true
        var isAContinueB = false
        var isAContinueA = false
        for (i in 0 until a.length / 2) {
            if (isAPalindrome) {
                if (isAContinueB) {
                    if (b[i] != b[a.length - i - 1]) {
                        isAContinueB = false
                    }
                }
                if (isAContinueA) {
                    if (a[i] != a[a.length - i - 1]) {
                        isAContinueA = false
                    }
                }
                if (isAContinue) {
                    if (a[i] != b[a.length - i - 1]) {
                        isAContinue = false
                        if (b[i] == b[a.length - i - 1]) {
                            isAContinueB = true
                        }
                        if (a[i] == a[a.length - i - 1]) {
                            isAContinueA = true
                        }
                    }
            }
                if (!isAContinue && !isAContinueA && !isAContinueB) {
                    isAPalindrome = false
                }
            }
        }

        if (isAPalindrome) {
            return true
        }

        var isBPalindrome = true
        var isBContinue = true
        var isBContinueA = false
        var isBContinueB = false
        for (i in 0 until a.length / 2) {
            if (isBPalindrome) {
                if (isBContinueA) {
                    if (a[i] != a[a.length - i - 1]) {
                        isBContinueA = false
                    }
                }
                if (isBContinueB) {
                    if (b[i] != b[a.length - i - 1]) {
                        isBContinueB = false
                    }
                }
                if (isBContinue) {
                    if (b[i] != a[a.length - i - 1]) {
                        isBContinue = false
                        if (a[i] == a[a.length - i - 1]) {
                            isBContinueA = true
                        }
                        if (b[i] == b[a.length - i - 1]) {
                            isBContinueB = true
                        }
                    }
                }
                if (!isBContinue && !isBContinueB && !isBContinueA) {
                    isBPalindrome = false
                }
            }
        }

        return isBPalindrome
    }

}

fun main(args: Array<String>) {
    val sol = Let_1616()
    println(sol.checkPalindromeFormation("x", "y"))
    println(sol.checkPalindromeFormation("xbdef", "xecab"))
    println(sol.checkPalindromeFormation("ulacfd", "jizalu"))
    println(sol.checkPalindromeFormation("abda", "acmc"))
    println(
        sol.checkPalindromeFormation(
            "aejbaalflrmkswrydwdkdwdyrwskmrlfqizjezd",
            "uvebspqckawkhbrtlqwblfwzfptanhiglaabjea"
        )
    )

    //aejbaalflrmkswrydwdkdwdyrwskmrlfqizjezd
    //uvebspqckawkhbrtlqwblfwzfptanhiglaabjea

}