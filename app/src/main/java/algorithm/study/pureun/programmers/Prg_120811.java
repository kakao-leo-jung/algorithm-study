package algorithm.study.pureun.programmers;

import java.util.Arrays;

/**
 * 프로그래머스 - 중앙값 구하기
 *
 * @link https://school.programmers.co.kr/learn/courses/30/lessons/120811
 */
public class Prg_120811 {

	public static void main(String[] args) {
		Prg_120811 sol = new Prg_120811();
		int[] sam = new int[] { 9, -1, 0 };
		int ans = sol.solution(sam);
		System.out.println(ans);

	}

	public int solution(int[] array) {
		int answer = 0;
		int temp = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = i; j < array.length; j++) {
				if (array[i] > array[j]) {
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}

		answer = array[array.length / 2];
		return answer;
	}
	// 정렬 사용법 아직도 미숙

}
