package algorithm.study.pureun.programmers;

import java.util.Arrays;

/**
 * 프로그래머스 - 짝수는 싫어요
 *
 * @link https://school.programmers.co.kr/learn/courses/30/lessons/120813
 */
public class Prg_120813 {

	public static void main(String[] args) {
		Prg_120813 sol = new Prg_120813();
		int[] ans = sol.solution(10);
		System.out.println(Arrays.toString(ans));

	}

	public int[] solution(int n) {
		int[] arr = new int[100];

		int index = 0;
		for (int i = 1; i <= n; i++) {
			if (i % 2 != 0) {
				arr[index] = i;
				index++;
			}
		}
		int[] answer = new int[index];
		for (int i = 0; i < index; i++) {
			answer[i] = arr[i];
		}
		return answer;
	}
	// 배열의 크기 역시 나중에 정해도 된다.
	// 일단은 숫자를 받고 새로만들어서 넣으면 되는 것

}
