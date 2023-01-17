package algorithm.study.pureun.programmers;

import java.util.Arrays;

/**
 * 프로그래머스 - 가장 큰 수 찾기
 *
 * @link https://school.programmers.co.kr/learn/courses/30/lessons/120899
 */
public class Prg_120899 {

	public static void main(String[] args) {
		Prg_120899 sol = new Prg_120899();
		int[] num = new int[] { 1, 8, 3 };
		int[] ans = sol.solution(num);
		System.out.println(Arrays.toString(ans));

	}

	public int[] solution(int[] array) {
		int[] answer = new int[2];
		int index = 0;
		int maxNum = 0;
		for (int i = 0; i < array.length; i++) {

			if (maxNum < array[i]) {
				maxNum = array[i];
				index = i;
			}
		}

		answer[0] = maxNum;
		answer[1] = index;
		return answer;
	}

}
