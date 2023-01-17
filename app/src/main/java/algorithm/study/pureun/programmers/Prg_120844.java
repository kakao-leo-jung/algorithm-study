package algorithm.study.pureun.programmers;

import java.util.Arrays;

/**
 * 프로그래머스 - 배열 회전시키기
 *
 * @link https://school.programmers.co.kr/learn/courses/30/lessons/120844
 */
public class Prg_120844 {

	public static void main(String[] args) {
		Prg_120844 sol = new Prg_120844();
		int[] num = new int[] { 1, 2, 3 };
		int[] ans = sol.solution(num, "right");
		System.out.println(Arrays.toString(ans));

	}

	public int[] solution(int[] numbers, String direction) {
		int[] answer = new int[numbers.length];
		int temp = 0;

		if (direction.equals("right")) {
			temp = numbers[numbers.length - 1];
			for (int i = numbers.length - 1; i > 0; i--) {
				numbers[i] = numbers[i - 1];

			}
			numbers[0] = temp;

		} else {
			temp = numbers[0];
			for (int i = 0; i < numbers.length - 1; i++) {
				numbers[i] = numbers[i + 1];
			}
			numbers[numbers.length - 1] = temp;

		}

		for (int i = 0; i < numbers.length; i++) {
			answer[i] = numbers[i];
		}
		return answer;
	}

}
