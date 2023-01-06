package algorithm.study.pureun.programmers;

/**
 * 프로그래머스 - 점의 위치 구하기
 *
 * @link https://school.programmers.co.kr/learn/courses/30/lessons/120841
 */
public class Prg_120841 {

	public static void main(String[] args) {
		Prg_120841 sol = new Prg_120841();

		int[] n = new int[] { 2, 4 };
		int ans = sol.solution(n);
		System.out.println(ans);

	}

	public int solution(int[] dot) {
		int answer = 0;

		if (dot[0] > 0 && dot[1] > 0) {
			answer = 1;
		} else if (dot[0] < 0 && dot[1] > 0) {
			answer = 2;
		} else if (dot[0] < 0 && dot[1] < 0) {
			answer = 3;
		} else {
			answer = 4;
		}
		return answer;
	}

}
