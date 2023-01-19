package algorithm.study.pureun.programmers;

/**
 * 프로그래머스 - 합성수 찾기
 *
 * @link https://school.programmers.co.kr/learn/courses/30/lessons/120846
 */
public class Prg_120846 {

	public static void main(String[] args) {
		Prg_120846 sol = new Prg_120846();
		int ans = sol.solution(10);
		System.out.println(ans);

	}

	public int solution(int n) {
		int answer = 0;
		int cnt = 0;

		for (int i = 1; i <= n; i++) {
			int num = 0;
			for (int j = 1; j <= i; j++) {
				if (i % j == 0) {
					num++;
					if (num >= 3) {
						num = 0;
						cnt++;
						
						break;
					}
				}
			}
		}
		answer = cnt;
		return answer;
	}

}
