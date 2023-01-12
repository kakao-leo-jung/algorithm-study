package algorithm.study.pureun.programmers;

/**
 * 프로그래머스 - 자릿수 더하기
 *
 * @link https://school.programmers.co.kr/learn/courses/30/lessons/120906
 */
public class Prg_120906 {

	public static void main(String[] args) {
		Prg_120906 sol = new Prg_120906();
		int ans = sol.solution(1234);
		System.out.println(ans);

	}

	public int solution(int n) {
		int answer = 0;
		String num = String.valueOf(n);
		int sum = 0;
		for (int i = 0; i < num.length(); i++) {
			int a = Character.getNumericValue(num.charAt(i));
			sum += a;
		}
		answer = sum;
		return answer;
	}

}
