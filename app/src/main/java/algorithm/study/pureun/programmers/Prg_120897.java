package algorithm.study.pureun.programmers;

import java.util.Arrays;

/**
 * 프로그래머스 - 약수 구하기
 *
 * @link https://school.programmers.co.kr/learn/courses/30/lessons/120897
 */
public class Prg_120897 {

	public static void main(String[] args) {
		Prg_120897 sol = new Prg_120897();
		int[] ans = sol.solution(24);
		System.out.println(Arrays.toString(ans));

	}

	public int[] solution(int n) {
		int[] temp = new int[10000];
		int index = 0;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				temp[index] = i;
				index++;
			}
		}
		int[] answer = new int[index];
		for (int i = 0; i < index; i++) {
			answer[i] = temp[i];
		}
		return answer;
	}
	// int[] temp = new int[n/2]; 임의로 지정하지말고 문제요건을 읽어보고 지정을 하자
	// 값이 튀어서 런타임에러가 뜨던것
}
