package algorithm.study.pureun.programmers;

/**
 * 프로그래머스 - 순서쌍의 개수
 *
 * @link https://school.programmers.co.kr/learn/courses/30/lessons/120836
 */
public class Prg_120836 {

	public static void main(String[] args) {
		Prg_120836 sol = new Prg_120836();
		int ans = sol.solution(20);
		System.out.println(ans);

	}

	public int solution(int n) {
		int answer = 0;
		
		for(int i = 1; i <= n; i++) {
			if(n%i == 0) {
				answer++;
			}
		}
		return answer;
	}

}
