package algorithm.study.pureun.programmers;

import java.util.Arrays;

/**
 * 프로그래머스 - 짝수 홀수 개수
 *
 * @link https://school.programmers.co.kr/learn/courses/30/lessons/120824
 */
public class Prg_120824 {

	public static void main(String[] args) {
		Prg_120824 sol = new Prg_120824();

		int[] n = new int[] { 1, 2, 3, 4, 5 };
		int[] ans = sol.solution(n);
		System.out.println(Arrays.toString(ans));

	}

	public int[] solution(int[] num_list) {
		int num1 = 0;
		int num2 = 0;

		for (int cnt = 0; cnt < num_list.length; cnt++) {
			if (num_list[cnt] % 2 == 0) {
				num1++;
			} else {
				num2++;
			}
		}
		int[] answer = { num1, num2 };
		return answer;
	}

}
