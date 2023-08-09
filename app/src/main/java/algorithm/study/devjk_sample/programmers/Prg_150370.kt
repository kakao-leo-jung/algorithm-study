package algorithm.study.devjk_sample.programmers

/**
 * 프로그래머스 - 개인정보 수집 유효기간
 *
 * @link https://school.programmers.co.kr/learn/courses/30/lessons/150370
 */
class Prg_150370 {

    val termMap: MutableMap<String, Int> = HashMap();

    fun solution(today: String, terms: Array<String>, privacies: Array<String>): IntArray {
        val answer:MutableList<Int> = mutableListOf()
        parseTerm(terms);

        privacies.forEachIndexed { idx, privacy ->
            val token = privacy.split(" ")
            val termName = token[1]
            val createdAt = token[0]
            val expireDate = addDate(createdAt, termMap[termName]!!)

            // 만료기간 지났음.
            if (today >= expireDate) {
                answer.add(idx + 1)
            }
        }
        return answer.toIntArray()
    }

    private fun addDate(time: String, month: Int): String {
        val token = time.split(".")
        val tYear = token[0].toInt()
        val tMonth = token[1].toInt()
        val tDate = token[2].toInt()

        var updateMonth = (tMonth + month) % 12
        updateMonth = when {
            updateMonth == 0 -> 12
            else -> updateMonth
        }

        var updateYear = tYear + (tMonth + month - 1) / 12

        return updateYear.toString().padStart(2, '0') + "." + updateMonth.toString()
            .padStart(2, '0') + "." + tDate.toString().padStart(2, '0')
    }

    private fun parseTerm(terms: Array<String>) {
        terms.forEach { term ->
            val token = term.split(" ")
            termMap[token[0]] = token[1].toInt()
        }
    }

}

fun main(args: Array<String>) {
    val sol = Prg_150370();
    print(
        sol.solution(
            "2022.05.19",
            arrayOf("A 6", "B 12", "C 3"),
            arrayOf("2021.05.02 A", "2021.07.01 B", "2022.02.19 C", "2022.02.20 C")
        ).contentToString()
    )
}


