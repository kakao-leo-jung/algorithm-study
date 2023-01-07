package algorithm.study.pureun.programmers;

/**
 * 프로그래머스 - 숫자 비교하기
 *
 * @link https://school.programmers.co.kr/learn/courses/30/lessons/120807
 */
public class Prg_120807 {

	public static void main(String[] args) {
		Prg_120807 sol = new Prg_120807();

		int ans = sol.solution(2, 3);
		System.out.println(ans);
	}

	public int solution(int num1, int num2) {
		int answer = 0;

		if (num1 == num2) {
			answer = 1;
		} else {
			answer = -1;
		}
		return answer;
	}

}
