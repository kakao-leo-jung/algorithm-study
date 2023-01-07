package algorithm.study.pureun.programmers;

/**
 * 프로그래머스 - 피자 나눠 먹기(1)
 *
 * @link https://school.programmers.co.kr/learn/courses/30/lessons/120814
 */
public class Prg_120814 {

	public static void main(String[] args) {
		Prg_120814 sol = new Prg_120814();

		int ans = sol.solution(7);
		System.out.println(ans);

	}

	public int solution(int n) {
		int answer = 0;
		if (n % 7 == 0) {
			answer = n / 7;
		} else {
			answer = (n / 7) + 1;
		}
		return answer;
	}

}
