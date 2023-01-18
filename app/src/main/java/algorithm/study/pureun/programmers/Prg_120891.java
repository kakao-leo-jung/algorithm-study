package algorithm.study.pureun.programmers;

/**
 * 프로그래머스 - 369게임
 *
 * @link https://school.programmers.co.kr/learn/courses/30/lessons/120891
 */
public class Prg_120891 {

	public static void main(String[] args) {
		Prg_120891 sol = new Prg_120891();
		int ans = sol.solution(3);
		System.out.println(ans);

	}

	public int solution(int order) {
		int answer = 0;
		String temp = String.valueOf(order);

		int cnt = 0;

		for (int i = 0; i < temp.length(); i++) {
			if (temp.charAt(i) - '0' == 3) {
				cnt++;
			} else if (temp.charAt(i) - '0' == 6) {
				cnt++;
			} else if (temp.charAt(i) - '0' == 9) {
				cnt++;
			}
		}

		answer = cnt;
		return answer;
	}

}
