package algorithm.study.pureun.programmers;

import java.util.Arrays;

/**
 * 프로그래머스 - 배열 자르기
 *
 * @link https://school.programmers.co.kr/learn/courses/30/lessons/120833
 */
public class Prg_120833 {

	public static void main(String[] args) {
		Prg_120833 sol = new Prg_120833();
		int[] num = new int[] { 1, 2, 3, 4, 5 };
		int[] ans = sol.solution(num, 1, 3);
		System.out.println(Arrays.toString(ans));

	}

	public int[] solution(int[] numbers, int num1, int num2) {
		int[] answer = new int[num2 - num1 + 1];
		int index = 0;
		for (int i = num1; i < num2 + 1; i++) {
			answer[index] = numbers[i];
			index++;
		}

		return answer;
	}
	// substring을 사용해서 구현할려했으나 실패
	// 너무 어렵게 생각해서 위처럼 쉽게 갈수 있는 방법을 생각을 못함

}
