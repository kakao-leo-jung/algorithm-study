package algorithm.study.pureun.programmers;

/**
 * 프로그래머스 - 숨어있는 숫자의 덧셈(1)
 *
 * @link https://school.programmers.co.kr/learn/courses/30/lessons/120851
 */
public class Prg_120851 {

	public static void main(String[] args) {
		Prg_120851 sol = new Prg_120851();
		int ans = sol.solution("aAb1B2cC34oOp");
		System.out.println(ans);

	}

	public int solution(String my_string) {
		int answer = 0;
		int num = 9;
		int sum = 0;

		for (int i = 0; i < my_string.length(); i++) {
			for (int cnt = 1; cnt <= 9; cnt++) {
				if (Character.getNumericValue(my_string.charAt(i)) == cnt) {
					sum += cnt;
				}
			}
		}
		answer = sum;
		return answer;
	}

}
