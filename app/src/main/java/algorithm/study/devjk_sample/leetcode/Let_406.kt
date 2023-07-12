package algorithm.study.devjk_sample.leetcode

/**
 * 리트코드 - Queue Reconstruction by Height
 *
 * @link https://leetcode.com/problems/queue-reconstruction-by-height
 */
class Let_406 {

    fun reconstructQueue(people: Array<IntArray>): Array<IntArray> {
        people.sortWith(Comparator<IntArray> { a, b ->
            b[0].compareTo(a[0])
        }.thenComparator { a, b -> a[1].compareTo(b[1]) })

        val ans = ArrayList<IntArray>()
        for (person in people) {
            val h = person[0];
            val cnt = person[1];
            var targetIndex = 0;
            var currentCount = 0;
            for (n in ans.indices) {
                val arrPerson = ans[n]
                if (arrPerson[0] >= h) {
                    currentCount++;
                }
                if (currentCount == cnt) {
                    targetIndex = n + 1
                    break;
                }
            }
            ans.add(targetIndex, person)
        }
        return ans.toTypedArray();
    }
}

fun main() {
    val sol = Let_406();
    val ans2 = sol.reconstructQueue(
        arrayOf(
            intArrayOf(9, 0),
            intArrayOf(7, 0),
            intArrayOf(1, 9),
            intArrayOf(3, 0),
            intArrayOf(2, 7),
            intArrayOf(5, 3),
            intArrayOf(6, 0),
            intArrayOf(3, 4),
            intArrayOf(6, 2),
            intArrayOf(5, 2)
        )
    )

    for (an in ans2) {
        print(an.contentToString() + " ")
    }

}