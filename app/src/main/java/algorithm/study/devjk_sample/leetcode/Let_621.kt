package algorithm.study.devjk_sample.leetcode

import java.util.*

/**
 * 리트코드 - Task Scheduler
 *
 * @link https://leetcode.com/problems/task-scheduler
 */
class Let_621 {

    fun leastInterval(tasks: CharArray, n: Int): Int {

        var ans = 0
        val pq = PriorityQueue<Pair<Char, Int>>(compareByDescending { it.second })
        val map: MutableMap<Char, Int> = mutableMapOf()
        for (task in tasks) {
            if (!map.containsKey(task)) {
                map[task] = 0
            }
            map[task] = map[task]!! + 1
        }

        for (t in map) {
            pq.add(Pair(t.key, t.value))
        }

        while (pq.isNotEmpty()) {
            val save: ArrayList<Pair<Char, Int>> = arrayListOf()
            var cycle = n + 1
            while (cycle > 0 && pq.isNotEmpty()) {
                val task = pq.poll()
                if (task.second - 1 > 0) {
                    save.add(Pair(task.first, task.second - 1))
                }
                ans++
                cycle--
                print("\"${task.first}\" -> ")
            }

            if (cycle > 0 && save.isNotEmpty()) {
                // pq used first, need to sleep
                print("sleep x $cycle -> ")
                ans += cycle
            }
            pq.addAll(save)
        }
        println()

        return ans
    }

}

fun main(args: Array<String>) {
    val sol = Let_621()
    println(sol.leastInterval(charArrayOf('A', 'A', 'A', 'B', 'B', 'B'), 2))
    println(sol.leastInterval(charArrayOf('A', 'C', 'A', 'B', 'D', 'B'), 1))
    println(sol.leastInterval(charArrayOf('A', 'A', 'A', 'B', 'B', 'B'), 3))
}