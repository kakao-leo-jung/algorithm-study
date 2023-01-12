package algorithm.study.pureun.programmers;

/**
 * 프로그래머스 - 개미 군단
 *
 * @link https://school.programmers.co.kr/learn/courses/30/lessons/120837
 */
public class Prg_120837 {

	public static void main(String[] args) {
		Prg_120837 sol = new Prg_120837();
		int ans1 = sol.solution(23);
		int ans2 = sol.solution(24);
		int ans3 = sol.solution(999);

		System.out.println(ans1);
		System.out.println(ans2);
		System.out.println(ans3);

	}

	public int solution(int hp) {
		int answer = 0;

		int gAnt = hp / 5;
		int sAnt = (hp % 5) / 3;
		int wAnt = (hp % 5) % 3;

		answer = gAnt + sAnt + wAnt;
		return answer;
	}

}
