package algorithm.study.devjk_sample.programmers

/**
 * 프로그래머스 - 달리기 경주
 *
 * @link https://school.programmers.co.kr/learn/courses/30/lessons/178871
 */
class Prg_178871 {

    fun solution(players: Array<String>, callings: Array<String>): Array<String> {
        val playerMap: MutableMap<String, Int> = setPlayerMap(players)
        val rankMap: MutableMap<Int, String> = setRankMap(players)

        for (prevPlayer in callings) {
            val currentRank = playerMap[prevPlayer]!!
            val postPlayer = rankMap[currentRank - 1]!!
            playerMap[prevPlayer] = currentRank - 1
            playerMap[postPlayer] = currentRank
            rankMap[currentRank] = postPlayer
            rankMap[currentRank - 1] = prevPlayer
        }

        return playerMap.toList().sortedBy { it.second }.map { it.first }.toTypedArray()
    }

    private fun setPlayerMap(players: Array<String>): MutableMap<String, Int> {
        val map = HashMap<String, Int>()
        for (i in players.indices) {
            val player = players[i]
            map[player] = i + 1
        }
        return map.toMutableMap()
    }

    private fun setRankMap(players: Array<String>): MutableMap<Int, String> {
        val map = HashMap<Int, String>()
        for (i in players.indices) {
            val player = players[i]
            map[i + 1] = player
        }
        return map.toMutableMap()
    }

}

fun main(args: Array<String>) {
    val sol = Prg_178871()
    val ans: Array<String> = sol.solution(
        arrayOf("mumu", "soe", "poe", "kai", "mine"),
        arrayOf("kai", "kai", "mine", "mine")
    )
    print("answer-- ")
    println(ans.contentToString())
}