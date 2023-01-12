package algorithm.study.pureun.programmers;

/**
 * 프로그래머스 - 옷가게 할인 받기
 *
 * @link https://school.programmers.co.kr/learn/courses/30/lessons/120818
 */
public class Prg_120818 {

	public static void main(String[] args) {
		Prg_120818 sol = new Prg_120818();
		int ans = sol.solution(580000);
		System.out.println(ans);

	}

	public int solution(int price) {
		int answer = 0;
		if (price >= 500000) {
			answer = (int) (price * 0.8);
		} else if (price >= 300000) {
			answer = (int) (price * 0.9);
		} else if (price >= 100000) {
			answer = (int) (price * 0.95);
		} else {
			answer = price;
		}

		return answer;
	}
}
