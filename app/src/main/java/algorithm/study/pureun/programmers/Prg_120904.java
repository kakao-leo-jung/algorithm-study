package algorithm.study.pureun.programmers;

/**
 * 프로그래머스 - 숫자 찾기
 *
 * @link https://school.programmers.co.kr/learn/courses/30/lessons/120904
 */
public class Prg_120904 {

	public static void main(String[] args) {
		Prg_120904 sol = new Prg_120904();
		int ans = sol.solution(29183, 1);
		System.out.println(ans);

	}

	public int solution(int num, int k) {
		int answer = 0;

		String tg = String.valueOf(num);

		for (int i = 0; i < tg.length(); i++) {
			if (tg.charAt(i) - '0' == k) {
				answer = i + 1;
				break;
			} else {
				answer = -1;
			}
		}

		return answer;
	}

}
