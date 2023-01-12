package algorithm.study.pureun.programmers;

/**
 * 프로그래머스 - 제곱수 판별하기
 *
 * @link https://school.programmers.co.kr/learn/courses/30/lessons/120909
 */
public class Prg_120909 {

	public static void main(String[] args) {
		Prg_120909 sol = new Prg_120909();
		int ans1 = sol.solution(144);
		int ans2 = sol.solution(976);

		System.out.println(ans1);
		System.out.println(ans2);

	}

	public int solution(int n) {
		int answer = 0;
		for (int i = 1; i < n / 2; i++) {
			if (i * i == n) {
				answer = 1;
				break;
			} else if (i * i != n) {
				answer = 2;
			}
		}
		return answer;
	}

}
