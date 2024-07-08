package algorithm.study.devjk_sample.leetcode

/**
 * 리트코드 - Walking Robot Simulation
 *
 * @link https://leetcode.com/problems/walking-robot-simulation
 */
class Let_874 {

    fun robotSim(commands: IntArray, obstacles: Array<IntArray>): Int {
        var ans: Int = 0
        var dir: Int = 0 // 0, 1, 2, 3 up, right, down, left
        val obstacleSet: MutableSet<String> = mutableSetOf()
        var curX = 0
        var curY = 0

        // save map
        for (obstacle in obstacles) {
            val point = obstacle[0].toString() + "/" + obstacle[1].toString()
            obstacleSet.add(point)
        }

        for (command in commands) {

            if (command == -2) {
                // turn left
                dir = (dir + 3) % 4
            } else if (command == -1) {
                // turn right
                dir = (dir + 1) % 4
            } else {
                // go
                var cnt = command
                while (cnt-- > 0) {
                    var nX = curX
                    var nY = curY
                    if (dir == 0) {
                        nY = curY + 1
                    } else if (dir == 1) {
                        nX = curX + 1
                    } else if (dir == 2) {
                        nY = curY - 1
                    } else {
                        nX = curX - 1
                    }
                    if (obstacleSet.contains("$nX/$nY")) {
                        break
                    }
                    // go
                    curX = nX
                    curY = nY

                    // check max
                    ans = Math.max(ans, curX * curX + curY * curY)
                }
            }
        }

        return ans
    }
}

fun main(args: Array<String>) {
    val sol = Let_874()
    println(
        sol.robotSim(
            intArrayOf(4, -1, 3),
            arrayOf()
        )
    )

    println(
        sol.robotSim(
            intArrayOf(4, -1, 4, -2, 4),
            arrayOf(
                intArrayOf(2, 4)
            )
        )
    )

    println(
        sol.robotSim(
            intArrayOf(6, -1, -1, 6),
            arrayOf()
        )
    )
}