package algorithm.study.devjk_sample.leetcode

import java.util.*

/**
 * 리트코드 - Better Compression of String
 *
 * @link https://leetcode.com/problems/better-compression-of-string
 */
class Let_3167 {

    fun betterCompression(compressed: String): String {

        val map: TreeMap<String, Int> = TreeMap()
        val sb: StringBuilder = StringBuilder()
        var isNumber = false
        var currentLetter = ""
        var currentNumber = 0
        for (ch in compressed) {
            if (!isNumber && ch.isDigit()) {
                // flush and change
                currentLetter = sb.toString()
                isNumber = true
                sb.clear()
            } else if (isNumber && ch.isLetter()) {
                // flush and change
                currentNumber = sb.toString().toInt()
                insert(map, currentLetter, currentNumber)
                isNumber = false
                sb.clear()
            }
            sb.append(ch)
        }
        currentNumber = sb.toString().toInt()
        insert(map, currentLetter, currentNumber)
        sb.clear()

        for (entry in map) {
            val key = entry.key
            val value = entry.value
            sb.append(key).append(value)
        }

        return sb.toString()
    }

    private fun insert(map: TreeMap<String, Int>, key: String, num: Int) {
        if (!map.containsKey(key)) {
            map[key] = 0
        }
        map[key] = map.getOrDefault(key, 0) + num
    }
}

fun main(args: Array<String>) {
    val sol = Let_3167()
    println(sol.betterCompression("a3c9b2c1"))
    println(sol.betterCompression("c2b3a1"))
    println(sol.betterCompression("a2b4c1"))
}