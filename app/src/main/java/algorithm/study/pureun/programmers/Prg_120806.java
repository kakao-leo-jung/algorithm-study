package algorithm.study.pureun.programmers;

/**
 * 프로그래머스 - 두 수의 나눗셈
 *
 * @link https://school.programmers.co.kr/learn/courses/30/lessons/120806
 */
public class Prg_120806 {

	public static void main(String[] args) {
		Prg_120806 sol = new Prg_120806();
		double ans = sol.solution(3, 2);
		System.out.println(ans);

	}

	public int solution(double num1, double num2) {
		int answer = (int) ((num1 / num2) * 1000);
		return answer;
	}

}
